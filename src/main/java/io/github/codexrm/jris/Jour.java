package io.github.codexrm.jris;

public class Jour extends RisEntry {

  private String jo;
  private String vl;
  private String is;
  private String sp;

  public Jour() {
    super();
  }
  
  public String getJo() {
    return jo;
  }

  public void setJo(String jo) {
    this.jo = jo;
  }

  public String getVl() {
    return vl;
  }

  public void setVl(String vl) {
    this.vl = vl;
  }

  public String getIs() {
    return is;
  }

  public void setIs(String is) {
    this.is = is;
  }

  public String getSp() {
    return sp;
  }

  public void setSp(String sp) {
    this.sp = sp;
  }
}
