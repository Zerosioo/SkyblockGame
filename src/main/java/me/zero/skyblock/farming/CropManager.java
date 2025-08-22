package me.zero.skyblock.farming;

import org.bukkit.Material;

import me.zero.skyblock.farming.crops.Crop;
import me.zero.skyblock.farming.crops.impl.WheatCrop;

import java.util.HashMap;
import java.util.Map;

public class CropManager {

    private static final Map<Material, Crop> cropMap = new HashMap<>();

    public static void registerDefaults() {
        register(new WheatCrop());
        // register other crops here
    }

    public static void register(Crop crop) {
        cropMap.put(crop.getMaterial(), crop);
    }

    public static Crop getCrop(Material material) {
        return cropMap.get(material);
    }
}
