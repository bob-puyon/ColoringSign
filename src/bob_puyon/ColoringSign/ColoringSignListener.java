package bob_puyon.ColoringSign;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class ColoringSignListener implements Listener
{
	ColoringSign plg;

	public ColoringSignListener(ColoringSign plg_instance)
	{
		this.plg = plg_instance;
	}

	@EventHandler
	public void onSignChange(SignChangeEvent event)
	{
		for (int i = 0; i<event.getLines().length; i++) {
			String msg = event.getLine(i);
			msg = msg.replace("&", "§");
			event.setLine(i, msg);
		}
	}
}