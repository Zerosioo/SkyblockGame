package me.zero.skyblock.npcs.mayors;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import me.zero.skyblock.mayors.Mayor;
import me.zero.skyblock.mayors.Perk;

import java.util.Arrays;
import java.util.List;

public class Marina extends MortarNPC implements Mayor {

    public Marina() {
        super(new NPCMeta() {
            @Override public String getName() { return "Marina"; }
            @Override public int getId() { return 5555; }
            @Override public String getSignature() { return "Inc6EBdQcld+Kb8Is+9uYwIwIxSsSYYPcGbSdhOYloqQEXQFR4f9/XnOdGQqAaor76ll85Qo8TOxaQ30MrNfiyrmy4FnQv+01lNZ3NhEnmcA3y7OSDc7L1uMhaPO5IqtpzjJV60JSHssL2nR+r0R/5yIh+zC9wVyoVhkQk7ILc9mjbiClOslVOFmNyCcCMgvbExPdY8Vb3gKVeBo6XLadO5rvY7Hf7gxB/HG2nqeUIs6mfgvf+yadqlmtncBENltdJjkw3iy3ETdor7uzQn7uPHuyuGIqzWVXNJkrx4JLYAAj95iKFinzqKmw35vcWKZO/ZITuVV2XHEBR/+dZ+cQTX58gcx/emoRh1S+4WF2OYLztr9js6zUXYQtfpURzRpw3An0FwoMslddN8/UjZ8amo+vd+PqSTgSjjejn6Gp1okREVtD0TKDTIaVtvMMmz0oTPM0ZTFO5MpOv8JBCTFqsAsnGcTU5ysrdTteoi44FrVuDQjTyD3MoHMPnwgm+REpSeHq6wF28xYbwjVniI4Jb7eWfWQAlKzXn34AqpQ9hEjjM6NqVUoub9xnXWZcend4qVol95ENzID7ejd7MF51RNIDw5uy8HxMzStqZPHn2coW76ZEzMOROeV6F80CT2wsD81qWYxPONRyltCwPzqqlzs0Haqee+CcxwFOIXnWwU="; }
            @Override public String getTexture() { return "ewogICJ0aW1lc3RhbXAiIDogMTc0OTY5NDM5MTI4NSwKICAicHJvZmlsZUlkIiA6ICIwNDg0N2ZjNWM5YjY0NTQ1YjI1ZWJkYmJiNzdjNjg2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYXFsdWEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODA3ZmM5YmVlOGQzMzQ0ZTg0MGU0MDMxYTM3MjQ5YTRjM2M4N2ZjODBjZjE2NDMyY2M1YzIxNTNkMWY5YzUzZCIKICAgIH0KICB9Cn0="; }
            @Override public String getDisplayName() { return "§9Marina"; }
            @Override public String getWorldName() { return "world"; }
            @Override public double getX() { return 0; }
            @Override public double getY() { return 0; }
            @Override public double getZ() { return 0; }
            @Override public float getYaw() { return 0; }
            @Override public float getPitch() { return 0; }
            @Override public boolean canLook() { return true; }
        });
    }

    @Override
    public void onInteract(NPCInteractionEvent event) {
        speak(event.getPlayer(), Arrays.asList("§fLet’s go fishing!"));
    }

    @Override
    public List<Perk> getPerks() {
        return Arrays.asList(
                new Perk("§dFishing XP Buff", Arrays.asList("§7Gain §3+50 ☯ Fishing Wisdom", "§7on public islands.")),
                new Perk("§dLuck of the Sea 2.0", Arrays.asList("§7Gain §315 α Sea Creature Chance.")),
                
                new Perk("§dFishing Festival", Arrays.asList("§7Start a special fishing", "§7event during the first §b3 §7days", "§7of each month!", " ", "§7Fish and fight dangerous", "§bsharks §7and earn unique", "§7Shark loot.")),
                
                new Perk("§dDouble Trouble", Arrays.asList("§7For every §31 α Sea Creature Chance§7,", "§7gain §9+0.1 ⚓ Double Hook Chance§7."))
        );
    }

    @Override
    public MortarNPC createNPC() {
        return new Marina();
    }

    @Override
    public void onActive() {
        System.out.println("Marina has been elected.");
    }
}
