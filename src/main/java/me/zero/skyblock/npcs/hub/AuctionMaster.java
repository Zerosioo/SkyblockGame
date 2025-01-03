package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class AuctionMaster extends MortarNPC {
    public AuctionMaster() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "hub_ah_master";
            }
            @Override
            public int getId() {
                return 1;
            }
            @Override
            public String getSignature() {
                return "NF6EjQpec0jMubbV2SVbm4ctXd+bLvM3MSdGyafHLYyRv048joSHAPFeUFTyRsHImjFW1+QclvkI/vg5CzAv+ijrrRnwDOl7X7d7cl6yw58iv4YGGx8ICvXc/jbXs+b1UkAWk0MXrLiyoIirZUt+rCpklasmaVJa+yunLaFcZ+VPCV0jOAt0IpZBqb4FyfVeS5wcqGDJwlmLQHKDcfJjU0wvi+jTkgY5valtqndv62m+3y18UnNv5yzlI/fiFSRvVAD10OUvvWeKamy016ogZ+txNBAhsXaI56R7KTa9fa774Sw80gNdgNLAGmVMhptuIguuxRe27bTAOw91XobnJybdZArDgy7rlqh/P5uv23ncyqxSw9QQxyGZGqEGC/CosZ1KoxPGgZ76YwXMQRgok+Al/+ydQskJYqMIA0sE/snHOSEB1RLarxLUkY9xgRLeRT0VwSthXItoxUzTNuxSJyyGxCCpi/F9tMwt95pp8cEz6sy4ai5iJjepwgnVBEkCWH2g/A1AQ4MXfs0h1dUg6tajfsCeQRjx9d06nRp3vTAGMAtwVCyFDRcSVf26+xvg3osqktefAUXJGzY+M9m4Zm6PdNXkoCLa3AbdlYeuBr6k/2R9wDD/h202L5C2N5f5Rb8igffHOl5YgLZXiCpRD06cDhtVUAYqYXLWrjHZucM=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxNDc2MTQ2Njc2OSwKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMTk3MWQ3OTZkYzRkYzlhZjM4Y2M5NzA2Nzk2M2RlNGVkMmJmOTk5MjI0MjU3NDE2ZGZiODQxNDg4ZmQ5ZTBkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
            }
            @Override
            public String getDisplayName() {
                return ChatColor.GOLD + "Auction Master";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -46.5D;
            }
            @Override
            public double getY() {
                return 73D;
            }
            @Override
            public double getZ() {
                return -90.5D;
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
                "Hey there, I'm the Auction Master.",
                "At the auction house you can put your valuable items up for auction!",
                "You may also want to check back here to see what items other players are selling to see if you can get a good deal.",
                "Talk to me if you would like to start your first auction or if you want to see the items currently being sold."
        ));
    }
}