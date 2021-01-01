package club.xpparty.autoaccept;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChatListener {
		
	@SubscribeEvent
	@SideOnly(value = Side.CLIENT)
	public void onChat(ClientChatReceivedEvent e) {
		String message = e.message.getUnformattedText();
		if(!message.contains("has invited you to join their party!") || message.contains(":")) return;
		String ign = message.replace("-----------------------------------------------------", "").split(" has")[0];
		if(ign.contains("]")) ign = ign.split("] ")[1];
		System.out.println(ign + " has invited you to join");
		if(ign.equalsIgnoreCase("find")) Minecraft.getMinecraft().thePlayer.sendChatMessage("/party accept " + ign);
	}
}