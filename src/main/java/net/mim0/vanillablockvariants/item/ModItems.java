package net.mim0.vanillablockvariants.item;

import net.mim0.vanillablockvariants.VanillaBlockVariants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VanillaBlockVariants.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
