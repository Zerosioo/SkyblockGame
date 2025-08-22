package me.zero.skyblock.user;

import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.util.SUtil;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.ConfigurationSection;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CompletableFuture;

public class User
{

    private static final Map<UUID, User> USER_CACHE = new HashMap<>();
    private static final File USER_FOLDER = new File("plugins/SkyblockGame/users");

    private UUID uuid;
    private final Config config;
    private long coins;
    private long bits;
    private long bankCoins;
    public PlayerRank rank;
    private int skyblocklevel;
    private int skyblockxp;
    private int giftedranks;
    public final BooleanHandler booleanHandler = new BooleanHandler();
    
    
    private User(UUID uuid)
    {
        this.uuid = uuid;
        this.coins = 0;
        this.bits = 0;
        this.bankCoins = 0;
        this.skyblocklevel = 0;
        this.skyblockxp = 0;
        this.giftedranks = 0;
        this.rank = PlayerRank.DEFAULT;

        if (!USER_FOLDER.exists()) USER_FOLDER.mkdirs();
        String path = uuid.toString() + ".yml";
        File configFile = new File(USER_FOLDER, path);
        boolean save = false;
        
        try
        {
            if (!configFile.exists())
            {
                save = true;
                configFile.createNewFile();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        this.config = new Config(USER_FOLDER, path);
        USER_CACHE.put(uuid, this);
        if (save) save();
        load();
    }

    public void load() {
    this.uuid = UUID.fromString(config.getString("uuid"));
    this.coins = config.getLong("coins");
    this.bits = config.getLong("bits");
    this.bankCoins = config.getLong("bankCoins");
    this.rank = PlayerRank.valueOf(this.config.getString("rank"));
    this.skyblocklevel = config.getInt("skyblocklevel");
    this.skyblockxp = config.getInt("skyblockxp");
    this.giftedranks = config.getInt("giftedranks");

    if (this.config.contains("booleanStates")) {
        ConfigurationSection section = this.config.getConfigurationSection("booleanStates");
        if (section != null) {
            for (String key : section.getKeys(false)) {
                boolean value = section.getBoolean(key);
                booleanHandler.setBoolean(key, value);
            }
        }
    }
}


    public void save()
    {
        config.set("uuid", uuid.toString());
        config.set("coins", coins);
        config.set("bits", bits);
        config.set("bankCoins", bankCoins);
        config.set("skyblocklevel", skyblocklevel);
        config.set("skyblockxp", skyblockxp);
        this.config.set("rank", this.rank.toString());
        config.set("giftedranks", giftedranks);
        
        this.config.set("booleanStates", booleanHandler.getAllBooleans());


        config.save();
    }

    public void asyncload() {

            SUtil.runAsync(new Runnable() {

                    @Override
                    public void run() {

                            User.this.setRank(PlayerRank.valueOf(User.this.getString("rank", "DEFAULT")));

                    }
            });

    }

        protected String getString(String string, String string2) {
                return null;
        }

    public static Collection<User> getCachedUsers()
    {
        return USER_CACHE.values();
    }

    public long getCoins() {
        return coins;
    }

    // Setter for coins
    public void setCoins(long coins) {
        this.coins = coins;
    }
    
    public void addCoins(long coins) {
        this.coins += coins;
    }
    public void subCoins(long coins) {
        this.coins -= coins;
    }
    public void addBankCoins(long bankCoins) {
        this.bankCoins += bankCoins;
    }
    public void subBankCoins(long bankCoins) {
        this.bankCoins -= bankCoins;
    }
    
    public long getBits() {
    return bits;
    }
    
    public void setBits(long bits) {
    	this.bits = bits;
    }
    
    public void addBits(long bits) {
        this.bits += bits;
    }

    public void subBits(long bits) {
        this.bits -= bits;
    }

    public void setRank(PlayerRank rank) {
        this.rank = rank;
        this.giftedranks += 1;
        Player player = Bukkit.getPlayer(uuid);
        String colour = rank.getColour();
        String levelPrefix = LevelPrefix();

        String initialName = levelPrefix + " " + colour + player.getName();
        player.setDisplayName(initialName);
        player.setPlayerListName(initialName);

        // Register player on scoreboard
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        Team team = scoreboard.getTeam(player.getName());
        if (team == null) {
            team = scoreboard.registerNewTeam(player.getName());
        }
        team.setPrefix(levelPrefix + " " + colour);
        team.addEntry(player.getName());
        player.setScoreboard(scoreboard);
        save();
    }

    public PlayerRank getRank() {
        return this.rank;
    }
    
    public int getGiftedRanks() {
    	
    	return giftedranks;
    }
    public static User getUser(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        if (USER_CACHE.containsKey(uuid)) {
            return USER_CACHE.get(uuid);
        }
        return new User(uuid);
    }

    public static User getUser(Player player) {
        if (player == null) {
            return null;
        }
        return User.getUser(player.getUniqueId());
    }

    public void addSkyblockXP(double amount) {
        this.skyblockxp += amount;
        while (skyblockxp >= getNextskyblocklevelXP()) {
            skyblocklevelUp();
        }
    }

    private void skyblocklevelUp() {
    int oldLevel = skyblocklevel; 
    skyblockxp -= getNextskyblocklevelXP();
    skyblocklevel++;
    int newLevel = skyblocklevel; 

    Player player = Bukkit.getPlayer(uuid);
    if (player != null) {
        player.sendMessage("§b§m                                             ");
        player.sendMessage(" §3§lSKYBLOCK LEVEL UP §bLevel §8" + oldLevel + "➜§3" + newLevel);
        player.sendMessage("§b§m                                             ");
        player.playSound(player.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
    }
    
        String colour = rank.getColour();
        String levelPrefix = LevelPrefix();

        String initialName = levelPrefix + " " + colour + player.getName();
        player.setDisplayName(initialName);
        player.setPlayerListName(initialName);

        // Register player on scoreboard
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        Team team = scoreboard.getTeam(player.getName());
        if (team == null) {
            team = scoreboard.registerNewTeam(player.getName());
        }
        team.setPrefix(levelPrefix + " " + colour);
        team.addEntry(player.getName());
        player.setScoreboard(scoreboard);
}


    public double getNextskyblocklevelXP() {
        return 100; 
    }


    public String getskyblocklevelColour() {
        if (this.skyblocklevel < 40) return "§7";
        if (this.skyblocklevel < 80) return "§f";
        if (this.skyblocklevel < 120) return "§e";
        if (this.skyblocklevel < 160) return "§a";
        if (this.skyblocklevel < 200) return "§2";
        if (this.skyblocklevel < 240) return "§b";
        if (this.skyblocklevel < 280) return "§3";
        if (this.skyblocklevel < 320) return "§9";
        if (this.skyblocklevel < 360) return "§d";
        if (this.skyblocklevel < 400) return "§5";
        if (this.skyblocklevel < 440) return "§6";
        if (this.skyblocklevel < 480) return "§c";
        if (this.skyblocklevel < 500) return "§4";
        return "§4"; 
    }

    public String LevelPrefix() {

            return "§8[" + getskyblocklevelColour() + getSkyblockLevel() + "§8]";

    }

    public void setSkyblockXP(int skyblockxp) {
    this.skyblockxp = skyblockxp;
    }

   public int getSkyblockXP() {
    return skyblockxp;
    }

    public int getSkyblockLevel() {
            return this.skyblocklevel;
    }

    public void setSkyblockLevel() {
            this.skyblocklevel = skyblocklevel;
    }

    public UUID getUuid() {
        return this.uuid;
    }
    
    public void debug(String message) {
    	Player player = Bukkit.getPlayer(uuid);
    	if (booleanHandler.getBoolean("debug") == true) {
    	player.sendMessage("§9[DEBUG] §f" + message);
    	}
    }
    
    public void sendMessage(String message) {
    	Player player = Bukkit.getPlayer(uuid);
    	player.sendMessage(message);
    }
}