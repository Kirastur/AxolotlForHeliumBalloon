package de.polarwolf.axolotl;

import org.bukkit.Bukkit;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import de.polarwolf.heliumballoon.elements.Element;
import de.polarwolf.heliumballoon.elements.living.LivingElement;
import de.polarwolf.heliumballoon.events.BalloonElementCreateEvent;

public class AxolotlListener implements Listener {

	public AxolotlListener(Plugin plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	// This event is called every time when the Minecraft entity
	// should be created as part of a balloon.
	@EventHandler(priority = EventPriority.NORMAL)
	public void onBalloonElementCreateEvent(BalloonElementCreateEvent event) {

		// Get the Balloon Element from the event.
		Element element = event.getElement();

		// Check if the Balloon Element is a LivingEntiry.
		// If not, this event does not belong to us.
		// (In the Balloon Config an axolotl can only be declared as LivingEntity)
		if (!(element instanceof LivingElement)) {
			return;
		}

		// Since we know we have a LivingEntity yet,
		// we can cast the object to get it.
		LivingElement livingElement = (LivingElement) element;

		// Now we can get the Minecraft Entity from our Element.
		Entity entity = livingElement.getEntity();

		// If the Minecraft Entity is not of type axolotl,
		// this event does not belong to us.
		if (!(entity instanceof Axolotl)) {
			return;
		}

		// Now we can cast the Entity to get the axolotl.
		Axolotl axolotl = (Axolotl) entity;

		// Next, get the CustomString from the BalloonConfig.
		String customString = livingElement.getConfig().getCustom();

		// If the CustomString is empty,
		// there is no customization we had to care about.
		if ((customString == null) || (customString.isEmpty())) {
			return;
		}

		try {

			// Try to convert the CusomString into the needed Variant type.
			Axolotl.Variant axolotlVariant = Axolotl.Variant.valueOf(customString);

			// Now we have collected all needed information,
			// so we can perform our customization
			axolotl.setVariant(axolotlVariant);

			// This is a cheap workaround
			// because sometimes the axolotl gets the wrong rotation.
			livingElement.disableAware();

		} catch (Exception e) {

			// If something goes wrong here
			// simply print the exception to the server console.
			e.printStackTrace();
		}
	}

}
