package com.cou.cse.alamgir.eathquekapp.Model;

public class EarthQuake {
    private EarthQuakeFeatures[] features;
    private EarthQuakeMetadata metadata;
    private double[] bbox;
    private String type;

    public EarthQuakeFeatures[] getFeatures() {
        return this.features;
    }

    public void setFeatures(EarthQuakeFeatures[] features) {
        this.features = features;
    }

    public EarthQuakeMetadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(EarthQuakeMetadata metadata) {
        this.metadata = metadata;
    }

    public double[] getBbox() {
        return this.bbox;
    }

    public void setBbox(double[] bbox) {
        this.bbox = bbox;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
