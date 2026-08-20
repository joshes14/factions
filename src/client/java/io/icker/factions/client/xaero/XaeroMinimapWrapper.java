package io.icker.factions.client.xaero;

/**
 * Shim for Xaero's Minimap integration.
 * The actual rendering is done in MixinMinimapRenderer.
 * Only called from FactionsClientMod when xaerominimap is loaded.
 */
public final class XaeroMinimapWrapper {
    private XaeroMinimapWrapper() {}

    /** Called from FactionsClientMod.onInitializeClient() when xaerominimap is loaded. */
    public static void register() {
        // Mixin is applied at startup; this method exists for the isModLoaded guard.
    }
}
