package me.zero.skyblock.util;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class ChatUtil {

    /**
     * Sends a clickable and hoverable message to the player.
     *
     * @param player The target player.
     * @param message The main message to display.
     * @param hoverLines A list of hover lines. Can be multiple.
     * @param clickAction The click action string. Auto-detects type. If null, no click action will be applied.
     */
    public static void sendClickableMessage(Player player, String message, ArrayList<String> hoverLines, String clickAction) {
        TextComponent textComponent = new TextComponent(message);

        if (hoverLines != null && !hoverLines.isEmpty()) {
            StringBuilder hoverBuilder = new StringBuilder();
            for (String line : hoverLines) {
                hoverBuilder.append(line).append("\n");
            }
            // Remove last \n
            if (hoverBuilder.length() > 0) {
                hoverBuilder.setLength(hoverBuilder.length() - 1);
            }
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                    new ComponentBuilder(hoverBuilder.toString()).create()));
        }

        if (clickAction != null) {
            ClickEvent.Action actionType = getClickAction(clickAction);
            String value = cleanClickValue(clickAction);
            textComponent.setClickEvent(new ClickEvent(actionType, value));
        }

        player.spigot().sendMessage(textComponent);
    }

    private static ClickEvent.Action getClickAction(String clickAction) {
        if (clickAction.startsWith("/")) {
            return ClickEvent.Action.RUN_COMMAND;
        } else if (clickAction.toLowerCase().startsWith("suggest:")) {
            return ClickEvent.Action.SUGGEST_COMMAND;
        } else if (clickAction.toLowerCase().startsWith("http")) {
            return ClickEvent.Action.OPEN_URL;
        } else {
            return ClickEvent.Action.RUN_COMMAND; // Default fallback
        }
    }

    private static String cleanClickValue(String clickAction) {
        if (clickAction.toLowerCase().startsWith("suggest:")) {
            return clickAction.substring(7); // Remove 'suggest:' prefix
        }
        return clickAction;
    }
}
