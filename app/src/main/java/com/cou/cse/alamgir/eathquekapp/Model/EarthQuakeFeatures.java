package com.cou.cse.alamgir.eathquekapp.Model;

public class EarthQuakeFeatures {
    private EarthQuakeFeaturesGeometry geometry;
    private String id;
    private String type;
    private EarthQuakeFeaturesProperties properties;

    public EarthQuakeFeaturesGeometry getGeometry() {
        return this.geometry;
    }

    public void setGeometry(EarthQuakeFeaturesGeometry geometry) {
        this.geometry = geometry;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EarthQuakeFeaturesProperties getProperties() {
        return this.properties;
    }

    public void setProperties(EarthQuakeFeaturesProperties properties) {
        this.properties = properties;
    }
}
