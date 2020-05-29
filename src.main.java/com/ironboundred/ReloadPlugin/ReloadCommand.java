package com.ironboundred.ReloadPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!sender.hasPermission("reloadplugin.reload")) {
      sender.sendMessage("Your not able to use this command!");
      return true;
    }

    sender.sendMessage(ChatColor.YELLOW + "[RELOAD] " + ChatColor.WHITE + "Reloading...");

    /*
     * Check all the length of arguments suppled by the command sender we switch all the lengths
     * only checking 0-2, as we only have 2 options that should be used true/false and a sever name.
     */
    switch (args.length) {
      case 0: {
        ReloadPlugin.getInstance().getServer().getPluginManager()
            .callEvent(new ReloadEvent(sender, false, null));

        return true;
      }
      case 1: {
        switch (args[0]) {
          case "true": {
            ReloadPlugin.getInstance().getServer().getPluginManager()
                .callEvent(new ReloadEvent(sender, true, null));
            return true;
          }

          case "false": {
            ReloadPlugin.getInstance().getServer().getPluginManager()
                .callEvent(new ReloadEvent(sender, false, null));
            return true;
          }

          default: {
            ReloadPlugin.getInstance().getServer().getPluginManager()
                .callEvent(new ReloadEvent(sender, false, args[0]));
            return true;
          }
        }
      }

      case 2: {
        boolean deep = false;
        String plugin = null;

        switch (args[0]) {
          case "true": {
            deep = true;
            break;
          }

          case "false": {
            deep = false;
            break;
          }

          default: {
            plugin = args[0];
          }
        }

        switch (args[1]) {
          case "true": {
            deep = true;
            break;
          }

          case "false": {
            deep = false;
            break;
          }

          default: {
            plugin = args[1];
          }
        }

        ReloadPlugin.getInstance().getServer().getPluginManager()
            .callEvent(new ReloadEvent(sender, deep, plugin));
        return true;
      }

      /*
       * Our default case is going to match alot like our case for 2 since we are already checking
       * for 0 length and firing a reload for every plugin and we only have 2 arguments any extra
       * arguments need to be ignored.
       */
      default: {
        boolean deep = false;
        String plugin = null;

        switch (args[0]) {
          case "true": {
            deep = true;
            break;
          }

          case "false": {
            deep = false;
            break;
          }

          default: {
            plugin = args[0];
          }
        }

        switch (args[1]) {
          case "true": {
            deep = true;
            break;
          }

          case "false": {
            deep = false;
            break;
          }

          default: {
            plugin = args[1];
          }
        }

        ReloadPlugin.getInstance().getServer().getPluginManager()
            .callEvent(new ReloadEvent(sender, deep, plugin));
        return true;
      }
    }
  }

}
