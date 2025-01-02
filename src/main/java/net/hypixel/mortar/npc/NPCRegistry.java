/*
 * Copyright (C) 2023 by Ruby Game Studios
 * Mortar is apart of Skyblock, which is licensed under the Creative Commons Non-Commercial 4.0 International License.
 *
 * You may not use this software for commercial use, however you are free
 * to modify, copy, redistribute, or build upon our codebase. You must give
 * appropriate credit, provide a link to the license, and indicate
 * if changes were made.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, visit https://creativecommons.org/licenses/by-nc/4.0/legalcode
 */
package me.zero.mortar.npc;

import lombok.NonNull;

import me.zero.mortar.MortarLibrary;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class NPCRegistry {
    private static List<MortarNPC> NPC_LIST = new ArrayList<>();

    public void register(MortarNPC npc, boolean spawn) {
        NPC_LIST.add(npc);
        npc.load();

        if (spawn) {
            npc.spawn();
        }
    }

    public @NonNull Optional<MortarNPC> getByName(@NonNull String name) {
        return NPC_LIST.stream()
                .filter(npc -> npc.getMeta().getName().equals(name))
                .findFirst();
    }

    public @NonNull Optional<MortarNPC> getByID(int id) {
        return NPC_LIST.stream()
                .filter(npc -> npc.getMeta().getId() == id)
                .findFirst();
    }

    public void spawnAll(Player player) {
        NPC_LIST.forEach(npc -> npc.spawn(player));
    }

    public void despawnAll(Player player) {
        NPC_LIST.forEach(npc -> npc.despawn(player));
    }

    public void startTasks() {
        new BukkitRunnable() {

            @Override
            public void run() {
                //looking task
                NPC_LIST.forEach(npc -> {
                    if (npc.getMeta().canLook()) {
                        for (Entity entity : npc.getLocation().getWorld().getNearbyEntities(npc.getLocation(), 7, 7, 7)) {
                            if (entity instanceof Player) {
                                npc.look((Player) entity);
                            }
                        }
                    }
                });

                //despawning (from chatgpt)
                List<Player> online = new ArrayList<>(Bukkit.getOnlinePlayers());

                for (Player player : online) {
                    NPC_LIST.forEach(npc -> {
                        boolean playerFound = false;

                        for (Entity entity : npc.getLocation().getWorld().getNearbyEntities(npc.getLocation(), 30, 30, 30)) {
                            if (entity instanceof Player) {
                                if (entity.equals(player)) {
                                    playerFound = true;
                                }
                            }
                        }

                        if (!playerFound) {
                            npc.despawn(player);
                        } else {
                            npc.spawn(player);
                        }
                    });
                }
            }
        }.runTaskTimer(MortarLibrary.getLibrary().getPlugin(), 0, 3);
    }
}
