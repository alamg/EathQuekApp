package com.cou.cse.alamgir.eathquekapp.Model;

public class EarthQuakeMetadata {
    private long generated;
    private int count;
    private String api;
    private String title;
    private String url;
    private int status;

    public long getGenerated() {
        return this.generated;
    }

    public void setGenerated(long generated) {
        this.generated = generated;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getApi() {
        return this.api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
