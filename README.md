# AxolotlForHeliumBalloon

## Introduction
This plugin act as a demo-plugin how you can implement a Custom SpawnModifier for HeliumBalloon

HeliumBalloon has a powerful API where you can control almost everything of the Plugin function. This is a Demo-Plugin for HeliumBalloon to demonstrate how you can implement a CustomSpawnModifier.

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

