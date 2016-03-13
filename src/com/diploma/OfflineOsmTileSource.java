package com.diploma;

import org.openstreetmap.gui.jmapviewer.tilesources.AbstractOsmTileSource;

public class OfflineOsmTileSource extends AbstractOsmTileSource {

    private final int minZoom;
    private final int maxZoom;

    public OfflineOsmTileSource(String path, int minZoom, int maxZoom) {
        super("Offline from "+path, path, null);
        this.minZoom = minZoom;
        this.maxZoom = maxZoom;
    }

    @Override
    public int getMaxZoom() {
        return maxZoom;
    }

    @Override
    public int getMinZoom() {
        return minZoom;
    }

}