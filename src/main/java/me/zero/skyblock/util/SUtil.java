package me.zero.skyblock.util;

import org.bukkit.scheduler.BukkitRunnable;
import me.zero.skyblock.main.SkyblockGame;
import net.minecraft.server.v1_8_R3.NBTTagCompound;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SUtil {
	private static SkyblockGame plugin = SkyblockGame.getPlugin(SkyblockGame.class);
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yy");
	private static final NumberFormat COMMA_FORMAT = NumberFormat.getInstance();
	static
    {
        COMMA_FORMAT.setGroupingUsed(true);
    }

    public static String commaify(int i)
    {
        return COMMA_FORMAT.format(i);
    }

    public static String commaify(double d)
    {
        return COMMA_FORMAT.format(d);
    }

    public static String commaify(long l)
    {
        return COMMA_FORMAT.format(l);
    }
    
    public static String getFormattedNumber(double num, int iteration) {

        if (num < 1000) {
            return String.valueOf(num);
        }

        char[] c = new char[]{'k', 'M', 'B', 'T'};

        double d = ((long) num / 100) / 10.0;
        boolean isRound = (d * 10) %10 == 0;

        return (d < 1000? //this determines the class, i.e. 'k', 'm' etc
                ((d > 99.9 || isRound || (!isRound && d > 9.99)? //this decides whether to trim the decimals
                        (int) d * 10 / 10 : d + "" // (int) d * 10 / 10 drops the decimal
                ) + "" + c[iteration])
                : getFormattedNumber(d, iteration+1));
    }
    
    public static String createLineProgressBar(int length, ChatColor progressColor, double current, double max)
    {
        double percent = Math.min(current, max) / max;
        long completed = Math.round((double) length * percent);
        StringBuilder builder = new StringBuilder().append(progressColor + "" + ChatColor.STRIKETHROUGH);
        for (int i = 0; i < completed; i++)
            builder.append("-");
        builder.append(ChatColor.WHITE + "" + ChatColor.STRIKETHROUGH);
        for (int i = 0; i < length - completed; i++)
            builder.append("-");
        builder.append(" ").append(ChatColor.AQUA).append(" " + SUtil.commaify(current)).append(ChatColor.AQUA).append("/")
                .append(ChatColor.AQUA).append(SUtil.commaify(max));
        return builder.toString();
    }
    


        public static void runAsync(Runnable runnable)     {
        new Thread(runnable).start();
    }
    
    public static void delaySync(Runnable task, long delay) {
        new BukkitRunnable() {
            @Override
            public void run() {
                task.run();
            }
        }.runTaskLater(plugin, delay);
    }
    
     public static void delay(final Runnable runnable, final long delay) {
        new BukkitRunnable() {
            public void run() {
                runnable.run();
            }
        }.runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), delay);

     }
     
      public static double square(double val) {
        return val * val;
    }
    
    public static String getDate()
    {
        return DATE_FORMAT.format(new Date());
    }
    
    public static String ntify(int i)
    {
        if (i == 11 || i == 12 || i == 13)
            return i + "th";
        String s = String.valueOf(i);
        char last = s.charAt(s.length() - 1);
        switch (last)
        {
            case '1': return i + "st";
            case '2': return i + "nd";
            case '3': return i + "rd";
            default: return i + "th";
        }
    }
    
    public static String zeroed(long l)
    {
        return l > 9 ? "" + l : "0" + l;
    }
    
    public static String getId(ItemStack item) {
		String id = null;
			
		if(item != null && item.getType() != Material.AIR) {
			net.minecraft.server.v1_8_R3.ItemStack stack = CraftItemStack.asNMSCopy(item);
			if(stack.getTag() != null) {
				id = stack.getTag().getCompound("ExtraAttributes").getString("id");
			}
			if(id == null || id.isEmpty()) {
				if(item.getType() == Material.STAINED_GLASS_PANE && item.getDurability() == 15) {
					return null;
				}
				id = item.getType().toString();
				if(item.getDurability() != 0) {
					id+= "-" + item.getDurability();
				}
			}
			return id;
		}
		return null;
	}
	
	public static NBTTagCompound getCompound(net.minecraft.server.v1_8_R3.ItemStack nmsStack) {
		if(nmsStack == null ) return null;
		NBTTagCompound compound;
		if (nmsStack.getTag() == null || nmsStack.getTag().isEmpty()) {
			compound = new NBTTagCompound();
			nmsStack.setTag(compound);
		}
		else
		{
		compound = nmsStack.getTag();
		}
		NBTTagCompound attributes;
		if (compound.getCompound("ExtraAttributes").isEmpty()) {
			attributes = new NBTTagCompound();
			compound.set("ExtraAttributes", attributes);
		}
		else
		{
		attributes = compound.getCompound("ExtraAttributes");
		}
		return attributes;
	}
	
}