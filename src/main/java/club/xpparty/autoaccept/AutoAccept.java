package club.xpparty.autoaccept;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = AutoAccept.MODID, version = AutoAccept.VERSION)
public class AutoAccept {
	public static final String MODID = "xpparty-autoaccept";
	public static final String VERSION = "1.0";
	
	public static ChatListener chatListener = new ChatListener();
		
	@EventHandler
    public void init(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(chatListener);
	}
}
