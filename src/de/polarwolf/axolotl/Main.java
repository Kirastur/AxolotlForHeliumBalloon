package de.polarwolf.axolotl;

import org.bukkit.plugin.java.JavaPlugin;

import de.polarwolf.heliumballoon.api.HeliumBalloonProvider;

public final class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		HeliumBalloonProvider.getAPI().addReloadRegistration(this, null, null);
		new AxolotlListener(this);
		this.getLogger().info("You can now use customized axolotls as your HeliumBalloon pet.");
	}

}
