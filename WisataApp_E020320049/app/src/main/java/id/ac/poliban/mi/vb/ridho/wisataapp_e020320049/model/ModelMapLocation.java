package id.ac.poliban.mi.vb.ridho.wisataapp_e020320049.model;

import com.google.android.gms.maps.model.LatLng;

public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}