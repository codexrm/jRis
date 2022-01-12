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

  public String getPb() {
    return pb;
  }

  public void setPb(String pb) {
    this.pb = pb;
  }

  public String getVl() {
    return vl;
  }

  public void setVl(String vl) {
    this.vl = vl;
  }

  public String getT2() {
    return t2;
  }

  public void setT2(String t2) {
    this.t2 = t2;
  }

  public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public String getEt() {
    return et;
  }

  public void setEt(String et) {
    this.et = et;
  }
}
