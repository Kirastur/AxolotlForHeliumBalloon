package de.polarwolf.axolotl;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new AxolotlListener(this);
		this.getLogger().info("You can now use customized axolotls as your HeliumBalloon pet.");
	}

}
