package com.Bomb_Ranger.grub.init;

import com.Bomb_Ranger.grub.Grub;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Grub.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Grub.MOD_ID)
public class itemInit 
{
	public static final Item example_item = null;
	
	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
	}
}
