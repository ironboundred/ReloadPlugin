# ReloadPlugin
A replacement for spigot /reload command.

This plugin allows for plugins to listen for the ReloadEvent to fire. 
The event can specifiy either 1 plugin or all plugins, can also be used if you want your plugin to have a 2 stage reload.
One thats for just reloading the config and one for reloading all the plugin.

An example on how to listen to the even can be found here https://github.com/ironboundred/ReloadPlugin/blob/master/src.main.java/com/ironboundred/ReloadPlugin/ReloadEventListener.java
