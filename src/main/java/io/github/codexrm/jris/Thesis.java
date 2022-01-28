package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

public class Thesis extends BaseReference {

    private final ArrayList<String> listAuthor;
    private String title;
    private LocalDate date;
    private String school;
    private String type;
    private String address;

    public Thesis() {
        super();
        listAuthor = new ArrayList<>();
    }

    public ArrayList<String> getListAuthor() {
        return listAuthor;
    }

    public void setAuthor(final String author) {
        this.listAuthor.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(final String school) {
        this.school = school;
    }

    public String getThesisType() {
        return type;
    }

    public void setThesisType(final String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}