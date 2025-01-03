package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Gustave extends MortarNPC {
    public Gustave() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Gustave";
            }
            @Override
            public int getId() {
                return 102;
            }
            @Override
            public String getSignature() {
                return "hYkAj4Ea+VVW3eHacfAWRGEKXTVRPntdfC97KP6awi61bNDTPMocvoODrstFPSZMBxueybB1GhX5Z3RVBpo08EQk2P7QXHyUuFUreq/19L0UFsIUYPdnS4sJ5SU+Vva8dUMT8zEt65W63ToejHlCocioe7Q8c+1FttkvEG/M+3CzrbDBjvGKvTRSTQPoQxMNbtRCxQ+Jd4ek6TJsjNns7eUp0r/vHQZXcARUIMeo0doaKsWhGYCw9MUvNYj9olIlDEUxuWi1o+zBk1s23LsOZ/ZOeJYsJD+4cHQpTfkdDzIw1l9ZynkFJmxetcBe+y6CAjMuRJk/rNrIQ3NbRayFZF8RzfjqxpGUAJipYigP8zj0+mgYRQ1pwC8s4egVoS9a82RR9EOsXi5nWeMGfio9qn6DRPJpsmkjdn2WLsTsTEVqJD4VfZ+mduPZF0ZO69SnoO9YkkvAKGp9RkIRIlR3mZpDc2gV+01v8sgOuDh7Nii/0V7yeGweSHYUy9Yd7wl9pEN4UIxoaQdOTQ4RrjeYX46gc11cSqqtipb9c/2PsiUT7fA12AhalC4n6+0enW7i/KO8J+UqDVjGJ4Ao+viAQHqee/7RtR5dIbVFjIPZrZbMDE8Uqluf9LWEPAC46PH9Z4EvGFd1827n99XLGltB2IE3lKEEQWbqTcMDZ/oH90M=";
            }
            @Override
            public String getTexture() {
                return "eyJ0aW1lc3RhbXAiOjE1NjQxODQ0NjgzODUsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NmYWZlNmY1MDE0YzUyYzBlOTczNTkyOTg0OTA2YWUxZDE5ZTgxMDVlMmRjZmQ3ZWFjYmUwMWVmODdjZTMyMGMifX19";
            }
            @Override
            public String getDisplayName() {
                return "Gustave";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -385.5D;
            }
            @Override
            public double getY() {
                return 89D;
            }
            @Override
            public double getZ() {
                return 55.5D;
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

     
    }
}