package me.zero.skyblock.items.build;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import org.apache.commons.lang.WordUtils;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import me.zero.skyblock.user.User;
import me.zero.skyblock.user.statistics.StatType;
import me.zero.skyblock.util.Formatters;
import me.zero.skyblock.util.ItemUtil;
import me.zero.skyblock.util.ReflectionUtil;
import me.zero.skyblock.util.SUtil;
import net.minecraft.server.v1_8_R3.NBTTagCompound;

public abstract class SItem {
	
	public String origin;
	public boolean recomb;
    public int hpb;
    public String uuid;
    public List<SItemFlag> flags = getFlags();
    public boolean blacklisted;
    public String skin;
    public String dye;
    public boolean fpb;
    public int kills;
    public boolean trackKills;
	
	public static SItem getItemClass(ItemStack item) {
        if (item == null || item.getType() == Material.AIR) return null;
        String id = SUtil.getId(item);
        if (id == null) return null;
        SItem instance = getItemClass(id);
        return instance;
    }
    
    public boolean isLeatherArmour(Material m) {
		return m == Material.LEATHER_BOOTS ||
		m == Material.LEATHER_LEGGINGS ||
		m == Material.LEATHER_CHESTPLATE ||
		m == Material.LEATHER_HELMET;
	}
    
    public static SItem getItemClass(String id) {
    if (id == null || id.equals("null")) return null;

    id = id.replace("-", "__").toUpperCase();

    Class<? extends SItem> clazz = Lists.items.get(id);
    if (clazz != null) {
        return ReflectionUtil.getInstance(clazz);
    }

    return null;
   }

	
	public static SItem getItem(ItemStack item) {


        SItem i = getItemClass(item);
        if (i == null) {
            return null;
        }
        net.minecraft.server.v1_8_R3.ItemStack nms = CraftItemStack.asNMSCopy(item);
        if (!nms.hasTag()) {
            return i;
        }
        i.load(nms.getTag());
        return i;
    }
    
    public ItemStack buildItemStack(User user) {
    	Rarity rarity = getRarity();
    	if (getRarity() != Rarity.NONE) {
    		if (recomb) {
    			rarity = rarity.next();
        	}
    	}
        
        String name = getName();
        List<String> lore = new ArrayList();
        
        ItemStatistics stats = null;
        if (this instanceof ItemStatistics) {
            stats = (ItemStatistics) this;
        }
        
        if (stats.getGearScore() != 0) {
        	lore.add("§7Gear Score: §d" + stats.getGearScore());
        }
        
        if (stats != null) {
    boolean b = false;
    for (StatType type : StatType.values()) {
        int base = stats.get(type, user);
        String s = editStat(type, base, hpb, type.isPassive());
        if (s != null && !s.isEmpty()) {
            if (!type.isPassive()) {
                b = true;
            } else if (b) {
                lore.add("");
                b = false;
            }
            lore.add(s);
        }
    }
}
        
  	List<String> description = getLore();
        if (description != null) {
            lore.addAll(description);
            lore.add("");
        }
        
        ItemStack item = null;
        
        if(trackKills){
            lore.add("§fKills: §6" + Formatters.format(kills));
            lore.add("");
        }
        
        if (!lore.isEmpty() && !lore.get(lore.size() - 1).isEmpty()) {
          lore.add("");
        }
        
        String doogonitom = "";
        
        if (isDungeonItem()) {
        	doogonitom = " DUNGEON";
        }
        
        
        String loreRarity = (rarity.getColor() + (recomb ? "§l§kk§r " + rarity.getColor() : "") + "§l"
                    + rarity.toString().replace("_", " ") + doogonitom)
                    + (getItemType() != null || getItemType() != ItemType.NULL ? " " + getItemType().toString().replace("_", " ") : "")
                    + (recomb ? " §kk" : "");
                    
         lore.add(loreRarity);
            name = rarity.getColor() +  name;
            
        if (this instanceof SkullItem && ((SkullItem)this).getTexture() != null) {
            if(((SkullItem)this).isURL()){
                item = ItemUtil.getSkullFromUrl(((SkullItem) this).getTexture());
                ItemMeta meta = item.getItemMeta();
                meta.setLore(lore);
                meta.setDisplayName(name);
                item.setItemMeta(meta);
            }
            else {
                item = ItemUtil.getSkull(((SkullItem) this).getTexture(), name, lore);
            }
        } else {
            item = ItemBuilder.buildItemStack(getMaterial(), getDurability(), name, lore);
        }
        ItemMeta meta = item.getItemMeta();
        meta.spigot().setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        if ((this instanceof ColoredArmor && isLeatherArmour(getMaterial()))) {
            Color color = null;
                color = ((LeatherArmorMeta) this).getColor();
            
            if (color != null) {
                LeatherArmorMeta data = (LeatherArmorMeta) item.getItemMeta();
                data.setColor(color);
                item.setItemMeta(data);
            }
        }
        
        item = addAttributes(item);
            
    	
    	return item;
    }
    
    @OverridingMethodsMustInvokeSuper
    public ItemStack addAttributes(ItemStack item) {
        net.minecraft.server.v1_8_R3.ItemStack nms = CraftItemStack.asNMSCopy(item);
        NBTTagCompound attributes = SUtil.getCompound(nms);
        addAttributes(attributes);


        return CraftItemStack.asBukkitCopy(nms);
    }
    
    @OverridingMethodsMustInvokeSuper
    public void addAttributes(NBTTagCompound attributes) {
        if (hpb != 0) {
            attributes.setInt("hpb", hpb);
        }
        if (recomb) {
            attributes.setInt("rarity_upgrades", 1);
        }
        if (uuid != null && !uuid.isEmpty()) {
            attributes.setString("uuid", uuid);
        } 
        if (skin != null) {
            attributes.setString("active_skin", skin);
        }
        if(dye != null){
            attributes.setString("armor_dye", dye);
        }
        if (fpb) {
            attributes.setInt("fpb", 1);
        }

        if(getItemType() == ItemType.SWORD || getItemType() == ItemType.BOW) {
            if (trackKills) {
                attributes.setInt("trackKills", 1);
            }
            attributes.setInt("kills", kills);
        }

        attributes.setString("id", getId());
    }
    
    public void load(NBTTagCompound tag) {
        NBTTagCompound ea = tag.getCompound("ExtraAttributes");
        loadAttributes(ea);
    }
    
    public String editStat(StatType type, Integer base, int hpb, boolean passive) {
        int hpbbonus = getHpbBonus(type, hpb);
        base += hpbbonus;
        if (base == 0) {
            return null;
        }
        String stat = "§7" + WordUtils.capitalizeFully(type.toString().replace("_", " ")) + ": ";
        stat += (passive ? "§a" : "§c") + (base > 0 ? "+" : "") + Formatters.format(base)
                + (type.isPercent() ? "%" : "")
                + (hpbbonus != 0 ? " §e(" + (hpbbonus > 0 ? "+" : "") + hpbbonus + ")" : "");
        return stat;
    }

    public int getHpbBonus(StatType type, int hpb) {
        int bonus = 0;
        if (getItemType() == ItemType.SWORD || getItemType() == ItemType.AXE || getItemType() == ItemType.BOW
                || getItemType() == ItemType.WEAPON || getItemType() == ItemType.FISHING_ROD) {
            if (type == StatType.DAMAGE) {
                bonus = hpb * 2;
            } else if (type == StatType.STRENGTH) {
                bonus = hpb * 2;
            }
        } else if (getItemType() == ItemType.HELMET || getItemType() == ItemType.CHESTPLATE
                || getItemType() == ItemType.LEGGINGS || getItemType() == ItemType.BOOTS) {
            if (type == StatType.HEALTH) {
                bonus = hpb * 4;
            } else if (type == StatType.DEFENSE) {
                bonus = hpb * 2;
            }
        }
        return bonus;
    }
    
    @OverridingMethodsMustInvokeSuper
    public void loadAttributes(NBTTagCompound ea){
        if (ea.hasKey("origin")) {
            origin = ea.getString("origin");
        }
    }
    
	public abstract List<String> getLore();
	public List<SItemFlag> getFlags() {
		return new ArrayList();
	}
	public List<String> getAfterLore() {
		return null;
	}
	
	
	public byte getDurability() {
		return 0;
	}
	
	public abstract ItemType getItemType();
	
	public Gamestage getGamestage() {
		return Gamestage.STARTER;
	}
	
	public String getId() {
		return this.getClass().getSimpleName();
	}
	
	public abstract Rarity getRarity();
	
	public abstract Material getMaterial();
	
	public DungeonType getDungeonType() {
		return DungeonType.NONE;
	}
	
	public Soulbound getSoulbound() {
		return Soulbound.NONE;
	}
	
	public abstract String getName();
	
	public enum SItemFlag {
		HIDE_RARITY, ENCHANTED, DUNGEON
	}
	
	public boolean isEnchanted() {
		return false;
	}
	
	public boolean isStackable() {
		return true;
	}
	
	public boolean isDungeonItem() {
		return false;
	}
	
}