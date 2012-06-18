package com.yapaha.osm;

import android.app.Activity;
import android.os.Bundle;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

/**
 * Author: Pavel Isakov
 * Date: 18.06.12 21:41
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        MapView mapView = (MapView) findViewById(R.id.mapView);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);

        mapView.getController().setZoom(14);
        mapView.getController().animateTo(new GeoPoint(59.949509, 30.357971), MapController.AnimationType.EXPONENTIALDECELERATING);
        mapView.invalidate();
    }
}
