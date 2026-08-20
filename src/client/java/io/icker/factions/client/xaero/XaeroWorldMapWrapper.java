package io.icker.factions.client.xaero;

/**
 * Shim for Xaero's World Map integration.
 * The actual rendering is done in MixinGuiMap.
 * This class is only constructed/called from FactionsClientMod when xaeroworldmap is loaded.
 */
public final class XaeroWorldMapWrapper {
    private XaeroWorldMapWrapper() {}

    /** Called from FactionsClientMod.onInitializeClient() when xaeroworldmap is loaded. */
    public static void register() {
        // Mixin is applied unconditionally at startup; this method exists so the
        // FactionsClientMod isModLoaded guard controls class-loading of this class.
    }
}
