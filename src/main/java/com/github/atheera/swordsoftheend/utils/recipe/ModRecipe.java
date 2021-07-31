package com.github.atheera.swordsoftheend.utils.recipe;

import net.java.games.input.Component;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.IShapedRecipe;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nullable;
import com.google.gson.*;
/*
public class ModRecipe implements Recipe<CraftingContainer> {

    public static class Type implements RecipeType<ModRecipe> {
        private Type() {}
        public static final Type INSTANCE = new Type();
        public static final String ID = "infuse_recipe";
    }

    class InfuseRecipeJsonFormat {
        JsonObject inputA;
        JsonObject inputB;
        String outputItem;
        int outputAmount;
    }

    public static class InfuseRecipeSerializer implements RecipeSerializer<ModRecipe> {

        @Override // read - Turns json into Recipe
        public ModRecipe fromJson(ResourceLocation id, JsonObject json) {
            InfuseRecipeJsonFormat recipeJson = new Gson().fromJson(json, InfuseRecipeJsonFormat.class);

            // Ingredient easily turns JsonObjects of the correct format into Ingedients
            Ingredient inputA = Ingredient.fromJson(recipeJson.inputA);
            Ingredient inputB = Ingredient.fromJson(recipeJson.inputB);
            // The json will specify the item ID. We can get the Item instance based off of that from the Item registry
            Item outputItem = Registry.ITEM_REGISTRY.getRegistryName(new Component.Identifier());
        }

        @Nullable
        @Override // read - Turns FriendlyByteBuf into Recipe
        public ModRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf packetData) {
            return null;
        }

        @Override // write - Turns Recipe into FriendlyByteBuf
        public void toNetwork(FriendlyByteBuf packetData, ModRecipe recipe) {

        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return null;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return null;
        }
    }

    private final Ingredient inputA;
    private final Ingredient inputB;
    private final Ingredient fuel;
    private final ItemStack result;
    private final ResourceLocation id;
    private final Component.Identifier ID;

    public ModRecipe(ResourceLocation id, ItemStack result, Ingredient inputA, Ingredient inputB, Ingredient fuel, Component.Identifier ID) {
        this.id = id;
        this.ID = ID;
        this.fuel = fuel;
        this.inputA = inputA;
        this.inputB = inputB;
        this.result = result;
    }

    public Ingredient getInputA() {
        return this.inputA;
    }

    public Ingredient getInputB() {
        return this.inputB;
    }

    public Ingredient fuel() {
        return this.fuel;
    }

    @Override
    public ItemStack getResultItem() {
        return this.result;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public ItemStack assemble(CraftingContainer inv) {
        return this.getResultItem().copy();
    }

    @Override
    public boolean matches(CraftingContainer inv, Level world) {
        if(inv.getContainerSize() < 2) return false;
        return inputA.test(inv.getItem(0)) && inputB.test(inv.getItem(1));
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public boolean canCraftInDimensions(int p_43999_, int p_44000_) {
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

}*/