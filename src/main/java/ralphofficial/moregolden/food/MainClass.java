package ralphofficial.moregolden.food;

import net.fabricmc.api.ModInitializer;
import ralphofficial.moregolden.food.registry.ModItems;

public class MainClass implements ModInitializer {

	public static final String MOD_ID = "moregolden";

	@Override
	public void onInitialize() {

		ModItems.itemRegistry();

	}
}
