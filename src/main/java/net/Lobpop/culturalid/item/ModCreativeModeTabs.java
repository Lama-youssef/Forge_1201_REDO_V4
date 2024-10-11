package net.Lobpop.culturalid.item;

import net.Lobpop.culturalid.CulturalMod;
import net.Lobpop.culturalid.ModItems;
import net.Lobpop.culturalid.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CulturalMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CULTURAL_TAB = CREATIVE_MOD_TAB.register("cultural_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.cultural_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SUMAC.get());

                        pOutput.accept(ModItems.FLATBREAD.get());
                        pOutput.accept(ModItems.PINENUTS.get());
                        pOutput.accept(ModItems.POMEGRANATE.get());
                        pOutput.accept(ModItems.MSAKHAN.get());
                        pOutput.accept(ModItems.EMPANADA.get());

                        pOutput.accept(ModItems.SUMAC_SEEDS.get());







                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
