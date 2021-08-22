package com.healthnotifier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HealthNotifierPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HealthNotifierPlugin.class);
		RuneLite.main(args);
	}
}