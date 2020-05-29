package com.ironboundred.ReloadPlugin;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadPlugin extends JavaPlugin {
  public final Logger logger = getLogger();
  private static ReloadPlugin instance;

  @Override
  public void onEnable() {
    instance = this;

    instance.getCommand("reloadplugin").setExecutor(new ReloadCommand());

    instance.getServer().getPluginManager().registerEvents(new ReloadEventListener(), instance);

    PluginDescriptionFile pdffile = getDescription();
    logger.info(pdffile.getName() + " v." + pdffile.getVersion() + " Has Been Enabled");
  }

  @Override
  public void onDisable() {
    PluginDescriptionFile pdffile = getDescription();
    logger.info(pdffile.getName() + " v." + pdffile.getVersion() + " Has Been Disabled");
  }

  public static ReloadPlugin getInstance() {
    return instance;
  }
}
