package net.Lobpop.culturalid;

import net.Lobpop.culturalid.block.ModBlocks;
import net.Lobpop.culturalid.item.ModsFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CulturalMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUMAC = ITEMS.register("sumac",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLATBREAD = ITEMS.register("flatbread",
            () -> new Item(new Item.Properties().food(ModsFoods.FLATBREAD)));

    public static final RegistryObject<Item> PINENUTS = ITEMS.register("pinenuts",
            () -> new Item(new Item.Properties().food(ModsFoods.PINENUTS)));

    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().food(ModsFoods.POMEGRANATE)));

    public static final RegistryObject<Item> MSAKHAN = ITEMS.register("msakhan",
            () -> new Item(new Item.Properties().food(ModsFoods.MSAKHAN)));

    public static final RegistryObject<Item> EMPANADA = ITEMS.register("empanada",
            () -> new Item(new Item.Properties().food(ModsFoods.EMPANADA)));

    public static final RegistryObject<Item> SUMAC_SEEDS = ITEMS.register("sumac_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SUMAC_CROP.get(), new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
