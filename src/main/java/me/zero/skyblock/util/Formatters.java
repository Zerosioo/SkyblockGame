package me.zero.skyblock.util;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatters {
	public static String format(Number num){
		NumberFormat format = NumberFormat.getInstance(Locale.CANADA);
		format.setMaximumFractionDigits(1);

		return format.format(num);
	}
	public static String percentFormat(Number percent) {
		String formatted = format(percent);
		char color;
		if(percent.floatValue() > 90)
		{
		color = 'a';
		}
		else if(percent.floatValue() > 50) {
			color = 'e';
		}
		else {
			color = 'c';
		}
		return "§" + color + formatted;
	}
	public static String getPercentColor(double value, double number) {
		if(value >= 0.5 * number) {
			return  "a";
		}
		if(value >= 0.1 * number) {
			return  "e";
		}
		return "c";
	}

	public static String shortNum(double value) {
	    if (value < 1000) return format(value);
	    int exp = (int) (Math.log(value) / Math.log(1000));
	    return format((value / Math.pow(1000, exp))) + "kMBTQE".charAt(exp-1);
	}
	public static String shortNumWithoutDot(double value) {
		if (value < 1000) return (int)(value) + "";
		int exp = (int) (Math.log(value) / Math.log(1000));
		return (int)(value / Math.pow(1000, exp)) + "" + "kMBTQE".charAt(exp-1);
	}

	public static String coinsFormat(double coins){
		return "§6" + format(coins) + " Coins§f";
	}
}
