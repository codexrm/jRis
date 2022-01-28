package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book extends BaseReference {

    private final ArrayList<String> listAuthor;
    private final ArrayList<String> listEditor;
    private final ArrayList<String> listSeriesEditor;
    private String title;
    private LocalDate date;
    private String publisher;
    private String volume;
    private String serie;
    private String address;
    private String edition;


    public Book() {
        super();
        listAuthor = new ArrayList<>();
        listEditor = new ArrayList<>();
        listSeriesEditor = new ArrayList<>();
    }

    public ArrayList<String> getListAuthor() {
        return listAuthor;
    }

    public void setAuthor(final String Author) {
        this.listAuthor.add(Author);
    }

    public ArrayList<String> getListEditor() {
        return listEditor;
    }

    public void setEditor(final String editor) {
        this.listEditor.add(editor);
    }

    public ArrayList<String> getListSerieEditor() {
        return listSeriesEditor;
    }

    public void setSerieEditor(final String seriesEditor) {
        this.listSeriesEditor.add(seriesEditor);
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(final String serie) {
        this.serie = serie;
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
