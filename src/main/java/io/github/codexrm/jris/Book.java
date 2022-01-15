package io.github.codexrm.jris;

public class Book extends RisEntry {

    private String pb;
    private String vl;
    private String t2;
    private String ad;
    private String et;

    public Book() {
        super();
    }

    public String getPublisher() {
        return pb;
    }

    public void setPublisher(final String pb) {
        this.pb = pb;
    }

    public String getVolume() {
        return vl;
    }

    public void setVolume(final String vl) {
        this.vl = vl;
    }

    public String getSerie() {
        return t2;
    }

    public void setSerie(final String t2) {
        this.t2 = t2;
    }

    public String getAddress() {
        return ad;
    }

    public void setAddress(final String ad) {
        this.ad = ad;
    }

    public String getEdition() {
        return et;
    }

    public void setEdition(final String et) {
        this.et = et;
    }
}
