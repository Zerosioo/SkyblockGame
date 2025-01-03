package me.zero.skyblock.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemBuilder {

    private final ItemStack item;
    private final ItemMeta meta;

    private ItemBuilder(ItemStack stack){
        this.item = stack;
        this.meta = stack.getItemMeta();
    }


    public static ItemBuilder of(ItemStack stack){
        return new ItemBuilder(stack);
    }

    public static ItemBuilder of(Material material , int amount){
        return of(new ItemStack(material , amount));
    }

    public static ItemBuilder of(Material material){
        return of(material , 1);
    }


    public ItemBuilder setAmount(int amount){
        item.setAmount(amount);
        return this;
    }



    public ItemBuilder setDisplayName(String name){
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        meta.setLore(lore);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(String... lines) {
        List<String> lore = Arrays.stream(lines).map(line -> ChatColor.translateAlternateColorCodes('&', line)).collect(Collectors.toList());
        return setLore(lore);
    }

    public ItemBuilder setLore(String lore){
        return setLore(new String[]{lore});
    }



    public ItemBuilder addEnchantment(Enchantment enchantment , int level , boolean ignoreMaxLvl){
        meta.addEnchant(enchantment , level , ignoreMaxLvl);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment , int level){
        return addEnchantment(enchantment , level , false);
    }

    public ItemBuilder addEnchantment(Enchantment enchantment){
        return addEnchantment(enchantment , 1);
    }

    public ItemBuilder removeEnchantment(Enchantment enchantment){
        meta.removeEnchant(enchantment);
        item.setItemMeta(meta);
        return this;
    }

    public ItemStack build(){
        return item;
    }


}
