package me.zero.skyblock.commands.abstraction;

import me.zero.skyblock.ranks.PlayerRank;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandParameters {
    String[] aliases() default {};
    String description() default "";
    String usages() default "/<command>";
    PlayerRank rank() default PlayerRank.DEFAULT;
    boolean requireOperator() default false;
}
