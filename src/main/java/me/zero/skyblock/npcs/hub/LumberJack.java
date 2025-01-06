package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.Material;

import me.zero.skyblock.inventory.inventories.reward.LumberJackGUI;
import me.zero.skyblock.user.*;
import me.zero.skyblock.util.SUtil;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;


public class LumberJack extends MortarNPC {
    public LumberJack() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "LumberJack";
            }
            @Override
            public int getId() {
                return 2086;
            }
            @Override
            public String getSignature() {
                return "W2LCZGjj8Y/bUZuFz459V3koVFzFkEyR+z5sU9yWMW9nw70wsoC7ILmzQ7JvlHjX8riGliJAQCnTEPWjdNQMFOkWSnoctCtey7WkBTQIQwwK+x2D8Wyls/KvUiI2EmI7cVAAUNBGKusx4QLNkebr/76FNXGq8jY8DrWrUfLBE0H09klVpek/qd6CZTQp/n/snfQdAy6uzBPyR3UjBkdQ81wV+Z97UF/NFiF0RUMEz/YS9kX3uSkTC+y/bVCbnoizOQ+FD/Wwk5RD0g2Bze20j8RrpeMTN2LnyaZhJs8zUgJ53BYY8GNEMUBpkTA6qurh6tl4nYPjoazbYAAtP+KlT3WpBeq4S63Xb8O+qanyuzVN0e2MHYhOJNB5/+KTJrR+7R/IvxckoGPfnQoHjlaY+bAPCjfthAPHJwVIMu5S11fukAXMJ9D4lVpA/c6ov0C7DesxU9YGwI7vIff/zFcES4p8rvCf69SSCt9V+sBuwCdnPWYgzLYx0OfDdWKW+2v2AQwr+6vVCNcgSSqfdMAj4qOuqa7mOXIbZEMLDtNK/hEWH9JXNZR17IkiciaZoODncORubUMMt7kn4C4I/HEPcQCdnURtEHvSU2u07NTQLEv5xXyGQeV2zoxPaJF9nI/FkY1Szdt5XqzRTuJ1q9SiiR0YPL6CI6RaEQKBd9cBi8A=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxMjExNjM0ODgyMSwKICAicHJvZmlsZUlkIiA6ICJjOTAzOGQzZjRiMTg0M2JiYjUwNTU5ZGE3MWFjMTk2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUQk5SY29vbGNhdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZDBhYmRkOWY2ZWU3ZDgzNzBkMjYyMTA5Y2I4NTNiYWNkM2Y0M2Y4Y2U0MjQxMTY0ZDA4ZTNkMmE1NjgzZTMyIgogICAgfQogIH0KfQ==";
            }
            @Override
            public String getDisplayName() {
                return "Lumber Jack";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -112.5D;
            }
            @Override
            public double getY() {
                return 74D;
            }
            @Override
            public double getZ() {
                return -36.5D;
            }
            @Override
            public float getYaw() {
                return -89.8F;
            }
            @Override
            public float getPitch() {
                return 0.2F;
            }
            @Override
            public boolean canLook() {
                return true;
            }
        });
    }
    @Override
    public void onInteract(NPCInteractionEvent event) {
      
        Player player = event.getPlayer();
        User user = User.getUser(player.getUniqueId());
        
        if (user.booleanHandler.getBoolean("lumber_jack_first_interaction") == false) {
            
    speak(player, Arrays.asList(
                "§fTimber!",
                "§fMy woodcutting assistant has fallen quite ill! Do you think you could take over for him?",
                "§fI just need you to chop down some Logs. If you do, I'll even give you his old axe as a reward!"
        ));
        
    SUtil.delay(() ->user.booleanHandler.setBoolean("lumber_jack_first_interaction", true) , 90);
    SUtil.delay(() ->user.booleanHandler.setBoolean("timber_quest_collect_logs", true) , 90);
    return;
        }
        
        
        if (user.booleanHandler.getBoolean("lumber_jack_idle_dialogue") == true) {
            
            speak(player, Arrays.asList("§fHowdy, §7"+ player.getName() + "§f!", "§fThey don't call me §aLumber Jack §ffor nothing!", "§fA lumberjack always pays his debts!"));
            return;
            // set idle dialogue to true in the quest if the quest is completed! dont forget it zero!
            
        }
        
        if (user.booleanHandler.getBoolean("travel_to_the_park") == true) {
            
            speak(player, "§fTravel to §aBirch Park§f, west of the §bForest§f, to find all different types of wood!");
            return;
        }
        
        
    if (user.booleanHandler.getBoolean("sweet_axe_claimed") == true) {
            
            speak(player, Arrays.asList("§fYou've got the knack for wood. Could you get some Birch Planks from §aBirch Park§f?", "§fMy associate will be there waiting for you. He will reward you in §6Coins §fif you're up to the task!"));
            
            SUtil.delay(() ->user.booleanHandler.setBoolean("travel_to_the_park", true) , 60);
            return;
            
        }
        
        ItemStack oakLog = new ItemStack(Material.LOG, 10, (short) 0);
        
    if (player.getInventory().containsAtLeast(oakLog, 10)) {
        player.getInventory().removeItem(oakLog);
        user.booleanHandler.setBoolean("timber_quest_collect_logs", false);
        user.booleanHandler.setBoolean("timber_quest_completed", true); 

        speak(player, "§fThank you! Take this §aSweet Axe§f, it's so sweet that it drops apples from logs sometimes!");
        SUtil.delay(() -> new LumberJackGUI().open(player), 30);
     } else if (user.booleanHandler.getBoolean("timber_quest_collect_logs") == true) {
        speak(player, "§fBring me some Logs. You can chop them down in this §bForest§f!");
        return;
      }
    }
}