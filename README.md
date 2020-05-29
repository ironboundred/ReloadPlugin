# ReloadPlugin
A replacement for spigot /reload command.

This plugin allows for plugins to listen for the ReloadEvent to fire. 
The event can specifiy either 1 plugin or all plugins, can also be used if you want your plugin to have a 2 stage reload.
One thats for just reloading the config and one for reloading all the plugin.

An example on how to listen to the event can be found here https://github.com/ironboundred/ReloadPlugin/blob/master/src.main.java/com/ironboundred/ReloadPlugin/ReloadEventListener.java

This is a maven project that can be added in your pom.xml with the following:
```xml
<repository>
 <id>jitpack.io</id>
 <url>https://jitpack.io</url>
</repository>

<dependency>
 <groupId>com.github.ironboundred</groupId>
 <artifactId>ReloadPlugin</artifactId>
 <version>0.0.9-SNAPSHOT</version>
</dependency>
````
