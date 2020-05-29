# ReloadPlugin
A replacement for spigot /reload command.

This plugin allows for plugins to listen for the ReloadEvent to fire. 
The event can specifiy either 1 plugin or all plugins, can also be used if you want your plugin to have a 2 stage reload.
One thats for just reloading the config and one for reloading all the plugin.

An example on how to listen to the even can be found here https://github.com/ironboundred/ReloadPlugin/blob/master/src.main.java/com/ironboundred/ReloadPlugin/ReloadEventListener.java

This is a maven project if you have the souce code do mvn clean install and then you can add the plugin to your pom as a dependency,
<dependency>
 	<groupId>com.ironboundred.ReloadPlugin</groupId>
  <artifactId>ReloadPlugin</artifactId>
  <version>0.0.9-SNAPSHOT</version>
  <scope>provided</scope>
</dependency>
