package io.github.codexrm.jris;

import java.util.ArrayList;

public class JournalArticle extends BaseReference {

    private final ArrayList<String> listAuthor;
    private String title;
    private String date;
    private String journal;
    private String volume;
    private String number;
    private String pages;


    public JournalArticle() {
        super();
        listAuthor = new ArrayList<>();
    }

    public ArrayList<String> getListAuthor() {return listAuthor;}

    public void setAuthor(final String author) {
        this.listAuthor.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = validateDate(date);
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(final String journal) {
        this.journal = journal;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(final String pages) {
        this.pages = pages;
    }
}
