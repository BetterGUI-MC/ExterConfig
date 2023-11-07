package me.hsgamer.bettergui.extraconfig;

import me.hsgamer.bettergui.builder.ConfigBuilder;
import me.hsgamer.hscore.config.simplixstorage.LightningConfig;
import me.hsgamer.hscore.expansion.common.Expansion;

public final class ExtraConfig implements Expansion {

    @Override
    public void onEnable() {
        ConfigBuilder.INSTANCE.register(LightningConfig::ofToml, "toml");
        ConfigBuilder.INSTANCE.register(LightningConfig::ofJson, "json");
        ConfigBuilder.INSTANCE.register(LightningConfig::ofYaml, "yaml", "yml");
    }
}
