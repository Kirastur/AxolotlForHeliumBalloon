# AxolotlForHeliumBalloon

## Introduction
This plugin has two purposes:
1. Add support for the new minecraft 1.17 animals to HeliumBalloon
2. Act as a demo-plugin how you can implement a Custom SpawnModifier for HeliumBalloon

## Minecraft 1.17 animals
Our Minecraft Plugin "HeliumBalloon" is based on Minecraft 1.16. It is compatible to Minecraft 1.17 in the way that you can use it with Minecraft 1.17 and that you can use the 1.17 ENUMs for Blocks and Entities. But you don't have the customizations for blocks and entities introduced in minecraft 1.17. This will done in a future relase when we integrate native 1.17 support. Meanwhile we have created an extra plugin to customze these entities.

## Example for SpawnModifier
HeliumBalloon has a powerful API where you can control almost everything of the Plugin function. This is also a Demo-Plugin for HeliumBalloon to demonstrate how you can implement a CustomSpawnModifier.

In this example we use the "custom" attribute of the animal element to define an axolotl variant.

## First steps
Install the HeliumBalloon plugin from https://www.spigotmc.org/resources/heliumballoon.95902

To test this demo, login into minecraft and assign this new pet to your player by using "/balloon assign demoAxolotl"

If the player doesn't have the permission to use all pets, you must assign him the "balloon.pet.demoAxolotl" permission first.

Note: An axolotl is a water pet. There can be some unexpected behavior if you summon you axolotl pet on land. Try again in water.

## How to customize your axolotl
Use one of the Axoloty.Variant ENUMs as value for the "custom" parameter:
* BLUE Blue axolotl.
* CYAN Cyan axolotl.
* GOLD Gold axolotl.
* LUCY Leucistic (pink) axolotl.
* WILD Brown axolotl.

Please see https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/Axolotl.Variant.html
for more information.

