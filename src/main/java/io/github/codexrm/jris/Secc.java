package io.github.codexrm.jris;

public class Secc extends RisEntry {

    private String ep;
    private String sp;
    private String t3;
    private String pb;
    private String vl;
    private String ad;
    private String et;

    public Secc() {
        super();
    }

    public String getChapter() {
        return ep;
    }

    public void setChapter(final String ep) {
        this.ep = ep;
    }

    public String getPages() {
        return sp;
    }

    public void setPages(final String sp) {
        this.sp = sp;
    }

    public String getSerie() {
        return t3;
    }

    public void setSerie(final String t3) {
        this.t3 = t3;
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
