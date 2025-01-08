package me.zero.skyblock.location;

import lombok.Getter;


public enum SkyblockLocation {
    BARN("§bThe Barn"),
    DESERT_SETTLEMENT("§eDesert Settlement"),
    MUSHROOM_DESERT("§eMushroom Desert"),
    OASIS("§bOasis"),
    MUSHROM_GORGE("§bMushroom Gorge"),

    DUNGEON_HUB("§cDungeon Hub"),
    ISLAND("§aYour Island"),
    BAZAAR("§eBazaar Allay"),
    VILLAGE("§bVillage"),

    COAL_MINE("§bCoal Mine"),
    GOLD_MINE("§6Gold Mine"),

    PARK("§aPark"),

    BIRCH_PARK("§aBirch Park"),
    SPRUCE_WOODS("§aSpruce Woods"),
    DARK_THICKET("§aDark Thicket"),
    SAVANNA_WOODLANDS("§aSavanna Woodlands"),
    JUNGLE_ISLAND("§aJungle Island"),

    AUCTION_HOUSE("§6Auction House"),
    BANK("§6Bank"),
    BUILDERS_HOUSE("§bBuilder's House"),
    MOUNTAIN("§bMountain"),
    GRAVEYARD("§cGraveyard"),
    FARM("§bFarm"),
    WILDERNESS("§2Wilderness"),

    SPIDER_DEN("§bSpider's Den"),
    NETHER("§cNether Fortress"),


    END("§dThe End"),

    DEEP_CAVERNS("§bDeep Caverns"),
    GUNPOWDER("§bGunpowder Mines"),
    LAPIS("§bLapis Quarry"),
    PIGMEN("§bPigmen's Den"),
    SLIMEHILL("§bSlimehill"),
    DIAMOND("§bDiamond Reserve"),
    OBSIDIAN("§bObsidian Sanctuary"),

    COMMUNITY_CENTER("§bCommunity Center"),
    DARK_AUCTION("§5Dark Auction"),

    COLLISEUM("§bColliseum"),

    NONE("§7None"),
    DRAGON_NEST("§dDragon Nest"),
    CASTLE("§bRuins");
    @Getter
    public final String name;
    @Getter
    private String[] description;

    SkyblockLocation(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name != null ? name : "Unknown Location";
    }



    public boolean isDeepCaverns() {
        return this == DEEP_CAVERNS ||
                this == GUNPOWDER ||
                this == LAPIS ||
                this == PIGMEN ||
                this == SLIMEHILL ||
                this == DIAMOND ||
                this == OBSIDIAN;
    }

    public boolean isMushroomDesert() {
        return this == DESERT_SETTLEMENT ||
                this == MUSHROOM_DESERT ||
                this == OASIS ||
                this == MUSHROM_GORGE;
    }

    public boolean isPark() {
        return this == BIRCH_PARK ||
                this == SPRUCE_WOODS ||
                this == DARK_THICKET ||
                this == JUNGLE_ISLAND ||
                this == SAVANNA_WOODLANDS;
    }

    public static SkyblockLocation getLocation(int x, int y, int z) {


        if (x > 98 && z < -19 && x < 155 && z > -80) {
            return COLLISEUM;
        }

        if (x > -7 && z > -114 && x < 16 && z < -96) {
            return COMMUNITY_CENTER;
        }


        if (x < 220 && x > 200 && z > -295 && z < -222) {
            return BARN;
        }

        if (x > 85 && x < 200 && z > -316 && z < -194) {
            return BARN;
        }


        if (x < -25 && x > -42 && z < -73 && z > -79) {
            return BAZAAR;
        }

        if (x < -18 && x > -57 && z < -80 && z > -100) {
            return AUCTION_HOUSE;
        }
        if (x < -19 && x > -31 && z < -48 && z > -70) {
            return BANK;
        }
        if (x < 93 && x > 18 && z < -100 && z > -190) {
            return FARM;
        }
        if (x < -5 && x > -40 && z < -140 && z > -235 && y < 90) {
            return COAL_MINE;
        }
        if (x < -38 && y < 73 && z > -173 && x > -65 && y > 55 && z < -135) {
            return COAL_MINE;
        }
        if (x > -11 && y < 75 && z < -153 && x < 5 && y > 60 && z > -181) {
            return COAL_MINE;
        }
        if (x < -43 && x > -58 && z < -23 && z > -40 && y < 82) {
            return BUILDERS_HOUSE;
        }
        if (x < -66 && x > -215 && z < -80 && z > -200) {
            return GRAVEYARD;
        }
        if (x < -97 && x > -140 && z < -50 && z > -85) {
            return GRAVEYARD;
        }
        if (x < 40 && x > -60 && z < 70 && z > 0) {
            return MOUNTAIN;
        }
        if (x < -96 && x > -225 && z < 20 && z > -80) {
            return PARK;
        }
        if (x > -40 && z < -71 && x < -25 && z > -81) {
            return BAZAAR;
        }
        if (x < 80 && x > -80 && z < 15 && z > -155) {
            return VILLAGE;
        }
        if (x < -44 && x > -97 && z < -38 && z > -57) {
            return VILLAGE;
        }
        if (x > -462 && z < -33 && x < -445 && z > -53 && y < 151 && y > 106)
            return SAVANNA_WOODLANDS;
        if (x > -482 && z < -30 && x < -360 && z > -141 && y < 162 && y > 117)
            return JUNGLE_ISLAND;
        if (x > -473 && z < 50 && x < -375 && z > -57 && y < 138 && y > 106)
            return SAVANNA_WOODLANDS;
        if (x > -386 && z < -6 && x < -311 && z > -123 && y < 124 && y > 100)
            return DARK_THICKET;
        if (x > -430 && z < 87 && x < -317 && z > -31 && y < 123 && y > 87)
            return SPRUCE_WOODS;
        if (x > -316 && z < 50 && x < -269 && z > -85 && y < 104)
            return BIRCH_PARK;
        if (x < 50 && z < -260 && x > -95 && z > -410) {
            return GOLD_MINE;
        }
        if (x > 35 && z > 0 && x < 200 && z < 220)
            return WILDERNESS;
        if (x < 85 && z < -476 && x > -108 && z > -650) {
            if (y < 19) {
                return OBSIDIAN;
            }
            if (y < 46) {
                return DIAMOND;
            }
            if (y < 78) {
                return SLIMEHILL;
            }
            if (y < 112) {
                return PIGMEN;
            }
            if (y < 136) {
                return LAPIS;
            }
            if (y < 178 && z < -535) {
                return GUNPOWDER;
            }
            return DEEP_CAVERNS;
        }
        if (x > -400 && z < -125 && z > -372 && x < -126) {
            return SPIDER_DEN;
        }
        if (x < -175 && z < -372 && x > -443 && z > -760) {
            return NETHER;
        }
        if (x < -611 && y < 100 && z < -222 && x > -740 && z > -330) {
            return DRAGON_NEST;
        }

        if (x < -430 && z > -450 && x > -810 && z < -100)
            return END;
        if (x < 192 && z > -404 && x > 117 && z < -336)
            return DESERT_SETTLEMENT;
        if (x > 70 && x < 210 && z < -425 && z > -610)
            return OASIS;
        if (x < 420 && z < -280 && x > 160 && z > -620) {
            if (y < 70)
                return MUSHROM_GORGE;
            return MUSHROOM_DESERT;
        }
        if (y > 50 && x < -190 && z > 27 && x > -281 && z < 131) {
            return CASTLE;
        }
        return NONE;
    }
}