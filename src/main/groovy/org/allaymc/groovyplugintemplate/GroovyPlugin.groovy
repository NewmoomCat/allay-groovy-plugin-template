package org.allaymc.groovyplugintemplate

import lombok.extern.slf4j.Slf4j
import org.allaymc.api.plugin.Plugin

@Slf4j
public class GroovyPlugin extends Plugin{
    @Override
    public void onLoad() {
        pluginLogger.info("GroovyPluginTemplate loaded!")
    }

    @Override
    public void onEnable() {
        pluginLogger.info("GroovyPluginTemplate enabled!")
    }

    @Override
    public void onDisable() {
        pluginLogger.info("GroovyPluginTemplate disabled!")
    }
}

