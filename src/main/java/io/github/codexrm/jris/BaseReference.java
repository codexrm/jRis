package io.github.codexrm.jris;

public class BaseReference {

    protected String note;

    public BaseReference() {
        super();
    }

    public String getNotes() {
        return note;
    }

    public void setNotes(final String note) {
        this.note = note;
    }

    private boolean isNumero(final String numero) {
        try {
            Long.valueOf(numero);
            return true;

        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public String validateYear(final String year) {
        if (isNumero(year)) {
            final char[] charYear = year.toCharArray();
            switch (charYear.length) {
                case 1:
                    return "000" + year;
                case 2:
                    return "00" + year;
                case 3:
                    return "0" + year;
                case 4:
                    return year;
                default:
                    return null;
            }
        } else return null;
    }

    private String validateMonth(String month) {
        if (isNumero(month)) {
            final char[] charMonth = month.toCharArray();
            if (charMonth.length == 1) {
                month = "0" + month;
            } else {
                if (charMonth.length > 2) {
                    return null;
                }
            }
            return month;
        } else return null;
    }

    public String validateDate(final String date) {
        final String[] fullDate = date.split("/", 2);
        final String year = validateYear(fullDate[0].strip());
        final String month = validateMonth(fullDate[1].strip());

        if (year != null) {
            if (month != null) {
                return year + "/" + month;
            } else return year;
        } else return null;
    }
}
