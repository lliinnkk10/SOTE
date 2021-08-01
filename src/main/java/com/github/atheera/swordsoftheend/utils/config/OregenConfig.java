package com.github.atheera.swordsoftheend.utils.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {

    private final String name;
    private boolean enable;
    private int size;
    private int range;
    private int count;
    private int bottom;
    private int top;

    public OregenConfig(String name, boolean enable) {
        this.name = name;
        this.enable = enable;
        this.size = 0;
        this.range = 0;
        this.count = 0;
        this.bottom = 0;
        this.top = 0;
    }

    public static ForgeConfigSpec.IntValue shadite_size;
    public static ForgeConfigSpec.IntValue shadite_count;
    public static ForgeConfigSpec.IntValue shadite_maxHeight;
    public static ForgeConfigSpec.IntValue shadite_minHeight;
    public static ForgeConfigSpec.BooleanValue shadite_spawn;

    public static ForgeConfigSpec.IntValue gold_size;
    public static ForgeConfigSpec.IntValue gold_count;
    public static ForgeConfigSpec.IntValue gold_maxHeight;
    public static ForgeConfigSpec.IntValue gold_minHeight;
    public static ForgeConfigSpec.BooleanValue gold_spawn;

    public static ForgeConfigSpec.IntValue deep_gold_size;
    public static ForgeConfigSpec.IntValue deep_gold_count;
    public static ForgeConfigSpec.IntValue deep_gold_maxHeight;
    public static ForgeConfigSpec.IntValue deep_gold_minHeight;
    public static ForgeConfigSpec.BooleanValue deep_gold_spawn;

    public static ForgeConfigSpec.IntValue lumin_size;
    public static ForgeConfigSpec.IntValue lumin_count;
    public static ForgeConfigSpec.IntValue lumin_maxHeight;
    public static ForgeConfigSpec.IntValue lumin_minHeight;
    public static ForgeConfigSpec.BooleanValue lumin_spawn;

    public static ForgeConfigSpec.IntValue deep_lumin_size;
    public static ForgeConfigSpec.IntValue deep_lumin_count;
    public static ForgeConfigSpec.IntValue deep_lumin_maxHeight;
    public static ForgeConfigSpec.IntValue deep_lumin_minHeight;
    public static ForgeConfigSpec.BooleanValue deep_lumin_spawn;

    public static ForgeConfigSpec.IntValue enchant_size;
    public static ForgeConfigSpec.IntValue enchant_count;
    public static ForgeConfigSpec.IntValue enchant_maxHeight;
    public static ForgeConfigSpec.IntValue enchant_minHeight;
    public static ForgeConfigSpec.BooleanValue enchant_spawn;

    public static ForgeConfigSpec.IntValue deep_enchant_size;
    public static ForgeConfigSpec.IntValue deep_enchant_count;
    public static ForgeConfigSpec.IntValue deep_enchant_maxHeight;
    public static ForgeConfigSpec.IntValue deep_enchant_minHeight;
    public static ForgeConfigSpec.BooleanValue deep_enchant_spawn;

    public static void init(ForgeConfigSpec.Builder server) {

        server.comment("Ore Generation");

        shadite_spawn = server
                .comment("Should the ore 'Shadite' generate? Default true")
                .define("oregen.shadite_spawn", true);
        shadite_count = server
                .comment("Maximum number of shadite ore veins per chunk. Default 2")
                .defineInRange("oregen.shadite_count", 2, 1, 15);
        shadite_size = server
                .comment("Maximum amount of ores per vein. Default 4")
                .defineInRange("oregen.shadite_size", 4, 1, 15);
        shadite_maxHeight = server
                .comment("Max height ores found. Default 50")
                .defineInRange("oregen.shadite_maxHeight", 50, 20, 60);
        shadite_minHeight = server
                .comment("Min height ores found. Default 10")
                .defineInRange("oregen.shadite_minHeight", 10, 10, 40);

        gold_spawn = server
                .comment("Should the ore 'Energized Gold' generate? Default true")
                .define("oregen.gold_spawn", true);
        gold_count = server
                .comment("Maximum number of Energized Gold ore veins per chunk. Default 2")
                .defineInRange("oregen.gold_count", 2, 1, 15);
        gold_size = server
                .comment("Maximum amount of ores per vein. Default 4")
                .defineInRange("oregen.gold_size", 4, 1, 15);
        gold_maxHeight = server
                .comment("Max height ores found. Default 30")
                .defineInRange("oregen.gold_maxHeight", 30, 10, 60);
        gold_minHeight = server
                .comment("Min height ores found. Default 10")
                .defineInRange("oregen.gold_minHeight", 10, 0, 30);

        deep_gold_spawn = server
                .comment("Should the ore 'Deep Energized Gold' generate? Default true")
                .define("oregen.deep_gold_spawn", true);
        deep_gold_count = server
                .comment("Maximum number of Deep Energized Gold ore veins per chunk. Default 3")
                .defineInRange("oregen.deep_gold_count", 3, 1, 15);
        deep_gold_size = server
                .comment("Maximum amount of ores per vein. Default 4")
                .defineInRange("oregen.deep_gold_size", 4, 1, 15);
        deep_gold_maxHeight = server
                .comment("Max height ores found. Default 0")
                .defineInRange("oregen.deep_gold_maxHeight", 0, -10, 10);
        deep_gold_minHeight = server
                .comment("Min height ores found. Default -30")
                .defineInRange("oregen.deep_gold_minHeight", -30, -30, -10);

        lumin_spawn = server
                .comment("Should the ore 'Luminite' generate? Default true")
                .define("oregen.lumin_spawn", true);
        lumin_count = server
                .comment("Maximum number of Luminite ore veins per chunk. Default 2")
                .defineInRange("oregen.lumin_count", 2, 1, 15);
        lumin_size = server
                .comment("Maximum amount of ores per vein. Default 4")
                .defineInRange("oregen.lumin_size", 4, 1, 15);
        lumin_maxHeight = server
                .comment("Max height ores found. Default 30")
                .defineInRange("oregen.lumin_maxHeight", 30, 10, 60);
        lumin_minHeight = server
                .comment("Min height ores found. Default -20")
                .defineInRange("oregen.lumin_minHeight", 10, 0, 30);

        deep_lumin_spawn = server
                .comment("Should the ore 'Deep Luminite' generate? Default true")
                .define("oregen.deep_lumin_spawn", true);
        deep_lumin_count = server
                .comment("Maximum number of Deep Luminite ore veins per chunk. Default 3")
                .defineInRange("oregen.deep_lumin_count", 3, 1, 15);
        deep_lumin_size = server
                .comment("Maximum amount of ores per vein. Default 4")
                .defineInRange("oregen.deep_lumin_size", 4, 1, 15);
        deep_lumin_maxHeight = server
                .comment("Max height ores found. Default 0")
                .defineInRange("oregen.deep_lumin_maxHeight", 0, -10, 10);
        deep_lumin_minHeight = server
                .comment("Min height ores found. Default -30")
                .defineInRange("oregen.deep_lumin_minHeight", -30, -30, -10);

        enchant_spawn = server
                .comment("Should the ore 'Enchantment' generate? Default true")
                .define("oregen.enchantment_spawn", true);
        enchant_count = server
                .comment("Maximum number of Enchantment ore veins per chunk. Default 2")
                .defineInRange("oregen.enchantment_count", 2, 1, 15);
        enchant_size = server
                .comment("Maximum amount of ores per vein. Default 6")
                .defineInRange("oregen.enchantment_size", 6, 1, 15);
        enchant_maxHeight = server
                .comment("Max height ores found. Default 30")
                .defineInRange("oregen.enchantment_maxHeight", 30, 10, 60);
        enchant_minHeight = server
                .comment("Min height ores found. Default -20")
                .defineInRange("oregen.enchantment_minHeight", 10, 0, 30);

        deep_enchant_spawn = server
                .comment("Should the ore 'Deep Enchantment' generate? Default true")
                .define("oregen.deep_enchantment_spawn", true);
        deep_enchant_count = server
                .comment("Maximum number of Deep Enchantment ore veins per chunk. Default 3")
                .defineInRange("oregen.deep_enchantment_count", 3, 1, 15);
        deep_enchant_size = server
                .comment("Maximum amount of ores per vein. Default 6")
                .defineInRange("oregen.deep_enchantment_size", 6, 1, 15);
        deep_enchant_maxHeight = server
                .comment("Max height ores found. Default 0")
                .defineInRange("oregen.deep_enchantment_maxHeight", 0, -10, 10);
        deep_enchant_minHeight = server
                .comment("Min height ores found. Default -30")
                .defineInRange("oregen.deep_enchantment_minHeight", -30, -30, -10);

    }

    protected String getName() { return this.name; }
    public boolean isEnable() { return enable; }
    public int getSize() { return size; }
    public int getRange() { return range; }
    public int getCount() { return count; }
    public int getBottom() { return bottom; }
    public int getTop() { return top; }

}
