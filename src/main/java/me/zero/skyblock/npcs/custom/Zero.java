package me.zero.skyblock.npcs.custom;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
public class Zero extends MortarNPC {
    public Zero() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Zero";
            }
            @Override
            public int getId() {
                return 2836;
            }
            @Override
            public String getSignature() {
                return "vqlZs3zPDCTYWfh5nbxTOrWO8ZVLknUFjtm0AlVJBqfpEYh6/oeSte4Hh6coZ87TZSbi1rkMjv5zYQ/4XB9J65pCojDivgUkcrm6agtzxb7zNSzOtdHhU91pxDW+qgCf8Hfo2hcBx8w/IRuyPvVPn8kZn3zVuNrzjR85d+WGOOWGGEcc5p/uArLM8YsBY94BvR0FPIVNeV4FJdXU1PoZ1u43ESvoQyb9J9VLONmJrTqTwvltpQFB4XyZm7Q1pqKLbJuHX37QHcZc3xe86ZK2Kx56tkNp0XnS3gNaUhZr7+pG9eyIlUDBtyzxkoBhkXwfC43vKTVTi4ZIUi95whsF17po2SvmmhP98r9ZjsXSKRMewuhC/ds56g5vGL8X/fRWSIXQ1NWzQ/qAc6z0iZKTEjnS0F2ONBllL1fBz5jV/eU+9cf9kW2uo4A8P5A2Is6YwqIe62crJ26yjSWE7Jjl/qP9at3ZgynHxu4wolB3UAo0pDHBfy/N/o6Cz9P+h1ikLD2UTgcP+lHCLyX/xto43nyRJn2CblXPt4VOVOXczw4ZCFYBu2YO4RcbNKK8XanjQ2+6eBBV/FDYjAQOXTEzR8KD0kxxMTzXCLq3XaSBCqfqeyXRGetSrOjsV6s9REZGV+oAsv5kvH9QNP8vwVwieqGbJBTNEqQbCOTcNDK1mOk=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTAyMTUyOTQ2OSwKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYjllOGQyMzMxODJmMjNiZDA1NTRlOTFjOGY4MTVjODdmMDlkMjZjYTA3OGVkMmM1NjI0N2U2OWNlMTlmZTY2IgogICAgfQogIH0KfQ==";
            }
            @Override
            public String getDisplayName() {
                return "§cZero";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -3.5D;
            }
            @Override
            public double getY() {
                return 70D;
            }
            @Override
            public double getZ() {
                return -91.5D;
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
      
      speak(event.getPlayer(), Arrays.asList(
                "§fDon't forget to report bugs on the forums!",
                "§fIf you find an exploit you can even report it directly to a staff member!"
                
        ));
      
    }
}