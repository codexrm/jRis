package io.github.codexrm.jris;

import java.util.ArrayList;

public class BookSection extends BaseReference {

    private final ArrayList<String> listAuthor;
    private final ArrayList<String> listEditor;
    private final ArrayList<String> listSeriesEditor;
    private String title;
    private String date;
    private String chapter;
    private String pages;
    private String serie;
    private String publisher;
    private String volume;
    private String address;
    private String edition;


    public BookSection() {
        super();
        listAuthor = new ArrayList<>();
        listEditor = new ArrayList<>();
        listSeriesEditor = new ArrayList<>();
    }

    public ArrayList<String> getListAuthor() {
        return listAuthor;
    }

    public void setAuthor(final String author) {
        this.listAuthor.add(author);
    }

    public ArrayList<String> getListEditor() {
        return listEditor;
    }

    public void setEditor(final String editor) {
        this.listEditor.add(editor);
    }

    public ArrayList<String> getListSeriesEditor() {
        return listSeriesEditor;
    }

    public void setSeriesEditor(final String seriesEditor) {
        this.listSeriesEditor.add(seriesEditor);
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
        this.date = validateYear(date);
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(final String chapter) {
        this.chapter = chapter;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(final String pages) {
        this.pages = pages;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(final String serie) {
        this.serie = serie;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(final String edition) {
        this.edition = edition;
    }


}
