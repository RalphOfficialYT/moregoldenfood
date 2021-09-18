package ralphofficial.moregolden.food.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ralphofficial.moregolden.food.BaseFoodComponent;
import ralphofficial.moregolden.food.MainClass;

public class ModItems {

    public static final Item GOLDEN_STEAK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_STEAK));
    public static final Item GOLDEN_PORKCHOP = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_PORKCHOP));
    public static final Item GOLDEN_MUTTON = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_MUTTON));
    public static final Item GOLDEN_POTATO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_POTATO));
    public static final Item GOLDEN_BEETROOT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_BEETROOT));
    public static final Item GOLDEN_BERRIES = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_BERRIES));
    public static final Item GOLDEN_CHICKEN = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BaseFoodComponent.GOLDEN_CHICKEN));

    public static void itemRegistry() {

        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_steak"), GOLDEN_STEAK);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_porkchop"), GOLDEN_PORKCHOP);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_mutton"), GOLDEN_MUTTON);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_potato"), GOLDEN_POTATO);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_beetroot"), GOLDEN_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_berries"), GOLDEN_BERRIES);
        Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, "golden_chicken"), GOLDEN_CHICKEN);

    }

}
