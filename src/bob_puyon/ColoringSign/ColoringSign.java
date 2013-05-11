package bob_puyon.ColoringSign;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ColoringSign extends JavaPlugin{
	//扱うloggerの取得
		public final static Logger logger = Logger.getLogger("Minecraft");
		public final static String logPrefix = "[ColoringSign] ";
		public final static String msgPrefix = "\u00A77[ColoringSign] \u00A7f";

		@Override
		public void onEnable() {
			//イベントリスナーの登録
			ColoringSignListener eventListener = new ColoringSignListener(this);
			getServer().getPluginManager().registerEvents(eventListener, this);

			//起動メッセージ
			PluginDescriptionFile file_pdf = this.getDescription();
			logger.info("[" +file_pdf.getName()+ "] v" + file_pdf.getVersion() + " is enabled!");
		}

		@Override
		public void onDisable() {
			//停止メッセージ
			PluginDescriptionFile file_pdf = this.getDescription();
			logger.info("[" +file_pdf.getName()+ "] v" + file_pdf.getVersion() + " is disabled!");
		}


}
