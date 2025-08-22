package me.zero.skyblock.mayors;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.zero.skyblock.util.SkyBlockLogger;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class ElectionVoteManager {

    private static File file;
    private static FileConfiguration config;

    private static final Map<UUID, Integer> playerVotes = new HashMap<>();
    private static final Map<Integer, Integer> candidateVotes = new HashMap<>();

    public static void initialize(File dataFolder) {
        file = new File(dataFolder, "election_votes.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        config = YamlConfiguration.loadConfiguration(file);
        loadVotes();
    }

    private static void loadVotes() {
        playerVotes.clear();
        candidateVotes.clear();

        if (config.contains("votes")) {
            for (String uuidStr : config.getConfigurationSection("votes").getKeys(false)) {
                UUID uuid = UUID.fromString(uuidStr);
                int candidate = config.getInt("votes." + uuidStr);
                playerVotes.put(uuid, candidate);
                candidateVotes.put(candidate, candidateVotes.getOrDefault(candidate, 0) + 1);
            }
        }
    }

    private static void saveVotes() {
        config.set("votes", null);
        for (Map.Entry<UUID, Integer> entry : playerVotes.entrySet()) {
            config.set("votes." + entry.getKey().toString(), entry.getValue());
        }
        try {
            config.save(file);
        } catch (IOException e) {
            SkyBlockLogger.severe("&cSomethinh went wrong while trying to save votes!");
        }
    }

    public static void addVote(UUID playerUUID, int candidateNumber) {
        if (candidateNumber < 1 || candidateNumber > 5) {
            throw new IllegalArgumentException("Invalid candidate number.");
        }

        removeOldVoteByPlayer(playerUUID);

        playerVotes.put(playerUUID, candidateNumber);
        candidateVotes.put(candidateNumber, candidateVotes.getOrDefault(candidateNumber, 0) + 1);
        saveVotes();
    }

    public static void removeOldVoteByPlayer(UUID playerUUID) {
        if (playerVotes.containsKey(playerUUID)) {
            int previousCandidate = playerVotes.get(playerUUID);
            candidateVotes.put(previousCandidate, candidateVotes.get(previousCandidate) - 1);
            if (candidateVotes.get(previousCandidate) <= 0) {
                candidateVotes.remove(previousCandidate);
            }
            playerVotes.remove(playerUUID);
            saveVotes();
        }
    }

    public static int getTotalVotes() {
        return playerVotes.size();
    }

    public static int getVotes(int candidateNumber) {
        return candidateVotes.getOrDefault(candidateNumber, 0);
    }

    public static double getVotePercentage(int candidateNumber) {
        int total = getTotalVotes();
        if (total == 0) return 0.0;
        int votes = getVotes(candidateNumber);
        double percent = (votes * 100.0) / total;
        return Math.round(percent * 10.0) / 10.0;
    }

    public static void removeAllVotesAndCandidates() {
        playerVotes.clear();
        candidateVotes.clear();
        config.set("votes", null);
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasVoted(Player player) {
        return playerVotes.containsKey(player.getUniqueId());
    }

    public static int calculateWinner() {
        int winner = -1;
        int maxVotes = -1;

        for (int i = 1; i <= 5; i++) {
            int votes = candidateVotes.getOrDefault(i, 0);
            if (votes > maxVotes) {
                maxVotes = votes;
                winner = i;
            }
        }
        return winner;
    }

    public static int calculateSecondPlace() {
        int winner = calculateWinner();
        int secondPlace = -1;
        int secondMaxVotes = -1;

        for (int i = 1; i <= 5; i++) {
            if (i == winner) continue;
            int votes = candidateVotes.getOrDefault(i, 0);
            if (votes > secondMaxVotes) {
                secondMaxVotes = votes;
                secondPlace = i;
            }
        }
        return secondPlace;
    }

    public static String getTotalVotesCommafied() {
        int totalVotes = getTotalVotes();
        return NumberFormat.getNumberInstance(Locale.US).format(totalVotes);
    }

    public static String getVotePercentageString(int candidateNumber) {
        double percentage = getVotePercentage(candidateNumber);
        DecimalFormat format = new DecimalFormat("0.0");
        return format.format(percentage);
    }

    public static int getPlayerVote(UUID playerUUID) {
        return playerVotes.getOrDefault(playerUUID, -1);
    }

    public static int getPlayerVote(Player player) {
        return getPlayerVote(player.getUniqueId());
    }

    public static Map<Integer, Integer> getAllCandidateVotes() {
        return new HashMap<>(candidateVotes);
    }
}
