package io.github.codexrm.jris;

public class Conf extends RisEntry {

    private String vl;
    private String t3;
    private String ad;

    public Conf() {
        super();
    }

    public String getVolume() {
        return vl;
    }

    public void setVolume(final String vl) {
        this.vl = vl;
    }

    public String getSerie() {
        return t3;
    }

    public void setSerie(final String t3) {
        this.t3 = t3;
    }

    public String getAddress() {
        return ad;
    }

    public void setAddress(final String ad) {
        this.ad = ad;
    }
}
