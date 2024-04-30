package io.github.foksha;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForceSelectWorld implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("force-select-world");

	@Override
	public void onInitialize() {
		LOGGER.info("Force Select World Menu is enabled.");
	}
}