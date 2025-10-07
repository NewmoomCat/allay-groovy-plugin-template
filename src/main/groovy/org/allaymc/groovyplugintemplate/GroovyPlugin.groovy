package org.allaymc.groovyplugintemplate

import org.allaymc.api.plugin.Plugin

class GroovyPlugin extends Plugin{
    @Override
    void onLoad() {
        log.info("GroovyPluginTemplate loaded!")
    }

    @Override
    void onEnable() {
        log.info("GroovyPluginTemplate enabled!")
    }

    @Override
    void onDisable() {
        log.info("GroovyPluginTemplate disabled!")
    }
}
