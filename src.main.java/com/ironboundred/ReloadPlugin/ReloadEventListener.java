package com.ironboundred.ReloadPlugin;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ReloadEventListener implements Listener {
  @EventHandler
  public void relaodEvent(ReloadEvent event) {
    /*
     * Check to see if the event plugin is null.
     * 
     * If the event plugin is not null then we need to check if our pluign is the one being
     * reloaded.
     */
    if (event.getPlugin() != null) {
      if (event.getPlugin().equalsIgnoreCase(ReloadPlugin.getInstance().getName())) {
        ReloadPlugin.getInstance().logger.info("Reload was called for ReloadPlugin!");
        event.getCommandSender().sendMessage(ChatColor.YELLOW + "[RELOAD] " + ChatColor.WHITE
            + "Reload was called for ReloadPlugin!");

        /*
         * A deep reload was asked for by the command sender. Not all plugins need a deep reload but
         * for example we will just log in console that it was asked for
         */
        if (event.isDeep()) {
          ReloadPlugin.getInstance().logger.info("A deep relaod was done!");
          event.getCommandSender().sendMessage(
              ChatColor.YELLOW + "[RELOAD] " + ChatColor.WHITE + "A deep relaod was done!");
        }
      }
      return;
    }
    /*
     * All plugins listening to the event have been asked to relaod.
     */
    ReloadPlugin.getInstance().logger.info("Reload was called for all plugins!");
    event.getCommandSender().sendMessage(
        ChatColor.YELLOW + "[RELOAD] " + ChatColor.WHITE + "Reload was called for all plugins!");

    /*
     * A deep reload was asked for by the command sender. Not all plugins need a deep reload but for
     * example we will just log in console that it was asked for
     */
    if (event.isDeep()) {
      ReloadPlugin.getInstance().logger.info("A deep relaod was done!");
      event.getCommandSender().sendMessage(
          ChatColor.YELLOW + "[RELOAD] " + ChatColor.WHITE + "A deep relaod was done!");
    }
  }
}
