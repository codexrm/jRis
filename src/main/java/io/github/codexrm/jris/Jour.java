package io.github.codexrm.jris;

public class Jour extends RisEntry {

    private String jo;
    private String vl;
    private String is;
    private String sp;

    public Jour() {
        super();
    }

    public String getJournal() {
        return jo;
    }

    public void setJournal(final String jo) {
        this.jo = jo;
    }

    public String getVolume() {
        return vl;
    }

    public void setVolume(final String vl) {
        this.vl = vl;
    }

    public String getNumber() {
        return is;
    }

    public void setNumber(final String is) {
        this.is = is;
    }

    public String getPages() {
        return sp;
    }

    public void setPages(final String sp) {
        this.sp = sp;
    }
}
