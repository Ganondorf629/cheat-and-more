package com.ganondorf629.cheatandmore;

import com.ganondorf629.cheatandmore.proxy.CommonProxy;

import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = main.MOD_ID, name = main.NAME, version = main.VERSION, clientSideOnly = true, acceptedMinecraftVersions = main.ACCEPTED_VERSIONS)
public class cheat {
	@SideOnly(value=Side.CLIENT)
	@Instance public static cheat instance;
	
	/*@SidedProxy(clientSide = main.CLIENT_PROXY_CLASS, serverSide = main.SERVER_PROXY_CLASS)*/
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new loggedInEvent());
		System.out.println("Event Handler Initialized");
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	public class loggedInEvent{
		public PlayerCapabilities capabilitiesFly = new PlayerCapabilities();

		@SubscribeEvent
		public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) { event.player.capabilities.isFlying = true;
		event.player.capabilities.disableDamage = true; System.out.println("LOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED INLOGGED IN");
		}

}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}