package net.mim0.vanillavariants.item;

import net.mim0.vanillavariants.VanillaVariants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VanillaVariants.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
