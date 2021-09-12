# AxolotlForHeliumBalloon

## Introduction
Our Minecraft Plugin "HeliumBalloon" is based on Minecraft 1.16. It is compatible to Minecraft 1.17 in the way that you can use it with Minecraft 1.17 and that you can use the 1.17 ENUMs for Blocks and Entities. But you don't have customization for 1.17 Balloons or Pets. This will done in a future relase when we integrate native 1.17 support. Meanwhile we have created an extra plugin to customze these entities.

## Example for SpawnModifier


This is a Demo-Plugin for HeliumBalloon
to demonstrate how you can implement a CustomSpawnModifier.

In this example we use the "custom" attribute of the animal element
to define a horse color and a horse style.

Add the following template configuration to your HeliumBalloon config.yml

    templates:
        demo6:
            animal:
               type: HORSE
               custom: BROWN WHITE_DOTS
               leash: true

Then login into minecraft and assign this new pet to your player
by using "/balloon assign demo6"

The horse should now always be brown with white dots.
 (If you cannot see the dots, try to remove any ResourcePacks)

The custom string is build as "HorseColor HorseStyle"
with a space between the two parameters.

Please see https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/Horse.Color.html
for a list of allowed colors.

Please see https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/Horse.Style.html
for a list of allowed styles.
