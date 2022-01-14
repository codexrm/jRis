package io.github.codexrm.jris;

public class RisEntry {

    protected String au;
    protected String a2;
    protected String a3;
    protected String a4;
    protected String ti;
    protected String da;
    protected String n1;

    public RisEntry() {
        super();
    }

    public String getAuthor() {
        return au;
    }

    public void setAuthor(String name, String lastName) {
        this.au = createAuthor(name, lastName);
    }

    public void setAuthor(String author) {
        this.au = author;
    }

    public String getAuthor2() {
        return a2;
    }

    public void setAuthor2(String name, String lastName) {
        this.a2 = createAuthor(name, lastName);
    }

    public void setAuthor2(String author) {
        this.a2 = author;
    }

    public String getAuthor3() {
        return a3;
    }

    public void setAuthor3(String name, String lastName) {
        this.a3 = createAuthor(name, lastName);
    }

    public void setAuthor3(String author) {
        this.a3 = author;
    }

    public String getAuthor4() {
        return a4;
    }

    public void setAuthor4(String name, String lastName) {
        this.a4 = createAuthor(name, lastName);
    }

    public void setAuthor4(String author) {
        this.a4 = author;
    }

    public String getTitle() {
        return ti;
    }

    public void setTitle(String ti) {
        this.ti = ti;
    }

    public String getDate() {
        return da;
    }

    public void setDate(String year, RisMonth month) {
        if (year != null && month != null) {
            this.da = getYear(year) + "/" + numberMonth(month);
        } else {
            if (year != null) {
                this.da = getYear(year);
            } else if (month != null) {
                this.da = "/" + numberMonth(month);
            }
        }
    }

    public void setDate(String da) {
        this.da = da;
    }

    public String getNotes() {
        return n1;
    }

    public void setNotes(String n1) {
        this.n1 = n1;
    }

    private String numberMonth(RisMonth month) {
        String numberMonth;
        switch (month) {
            case JANUARY:
                numberMonth = "01";
                break;
            case FEBRURY:
                numberMonth = "02";
                break;
            case MARCH:
                numberMonth = "03";
                break;
            case APRIL:
                numberMonth = "04";
                break;
            case MAY:
                numberMonth = "05";
                break;
            case JUNE:
                numberMonth = "06";
                break;
            case JULY:
                numberMonth = "07";
                break;
            case AUGUST:
                numberMonth = "08";
                break;
            case SEPTEMBER:
                numberMonth = "09";
                break;
            case OCTOBER:
                numberMonth = "10";
                break;
            case NOVEMBER:
                numberMonth = "11";
                break;
            default:
                numberMonth = "12";
        }
        return numberMonth;
    }

    private String createAuthor(String name, String lastName) {
        String author = null;
        if (name != null && lastName != null) {
            author = lastName + "," + name;
        }
        return author;
    }

    private String getYear(String year) {

        char[] charYear = year.toCharArray();
        if (charYear.length == 1) {
            year = "000" + year;
        } else {
            if (charYear.length == 2) {
                year = "00" + year;
            } else {
                if (charYear.length == 3) {
                    year = "0" + year;
                }
            }
        }
        return year;
    }
}
