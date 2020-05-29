package com.ironboundred.ReloadPlugin;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/*
 * This event will fire with a commandsender, boolean and a string. We have the command sender so
 * that when a plugin relaods it can send a messages to the entity asking for a relaod. We use the
 * boolean so if a plugin has the need to reload more then just the config it can use this deep
 * relaod to do so. The String is used for identifying a plugin by name, allows for only specific
 * plugins to be reloaded.
 */

public class ReloadEvent extends Event {
  private static final HandlerList handlers = new HandlerList();
  private CommandSender sender;
  private boolean deep;
  private String plugin;

  public ReloadEvent(CommandSender sender, boolean deep, String plugin) {
    setCommandSender(sender);
    setDeep(deep);
    setPlugin(plugin);
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public CommandSender getCommandSender() {
    return sender;
  }

  public void setCommandSender(CommandSender sender) {
    this.sender = sender;
  }

  public boolean isDeep() {
    return deep;
  }

  public void setDeep(boolean deep) {
    this.deep = deep;
  }

  public String getPlugin() {
    return plugin;
  }

  public void setPlugin(String plugin) {
    this.plugin = plugin;
  }

}
