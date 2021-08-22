package com.healthnotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("healthnotifier")
public interface HealthNotifierConfig extends Config
{

	@ConfigItem(
			keyName = "hitpoints",
			name = "Hitpoints Threshold",
			description = "The amount of hitpoints to send a notification at. A value of 0 will disable notification.",
			position = 6
	)
	default int getHitpointsThreshold()
	{
		return 0;
	}
}
