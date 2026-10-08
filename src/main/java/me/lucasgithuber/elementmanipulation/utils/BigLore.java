package me.lucasgithuber.elementmanipulation.utils;

import net.md_5.bungee.api.ChatColor;


public enum BigLore {
    INFO_DIMENSIONS(ChatColor.of("#192371"), "");

    private final ChatColor color;
    private final String lore;

    BigLore(ChatColor color, String lore) {
        this.color = color;
        this.lore = lore;
    }

    public ChatColor getColor() {
        return color;
    }

    public String getLore() {
        return lore;
    }

    public String lore() {
        return lore;
    }

    public ChatColor color() {
        return color;
    }
}
