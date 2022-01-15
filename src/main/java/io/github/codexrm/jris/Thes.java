package io.github.codexrm.jris;

public class Thes extends RisEntry {

    private String pb;
    private String m3;
    private String ad;

    public Thes() {
        super();
    }

    public String getUniversity() {
        return pb;
    }

    public void setUniversity(final String pb) {
        this.pb = pb;
    }

    public String getThesisType() {
        return m3;
    }

    public void setThesisType(final String m3) {
        this.m3 = m3;
    }

    public String getAddress() {
        return ad;
    }

    public void setAddress(final String ad) {
        this.ad = ad;
    }
}
