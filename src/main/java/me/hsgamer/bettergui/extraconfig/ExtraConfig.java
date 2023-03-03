package me.hsgamer.bettergui.extraconfig;

import me.hsgamer.bettergui.builder.ConfigBuilder;
import me.hsgamer.hscore.bukkit.addon.PluginAddon;
import me.hsgamer.hscore.config.simplixstorage.JsonProvider;
import me.hsgamer.hscore.config.simplixstorage.TomlProvider;
import me.hsgamer.hscore.config.simplixstorage.YamlProvider;

public final class ExtraConfig extends PluginAddon {
    private final TomlProvider tomlProvider = new TomlProvider();
    private final JsonProvider jsonProvider = new JsonProvider();
    private final YamlProvider yamlProvider = new YamlProvider();

    @Override
    public void onEnable() {
        ConfigBuilder.INSTANCE.register(tomlProvider::loadConfiguration, "toml");
        ConfigBuilder.INSTANCE.register(jsonProvider::loadConfiguration, "json");
        ConfigBuilder.INSTANCE.register(yamlProvider::loadConfiguration, "yaml", "yml");
    }
}
