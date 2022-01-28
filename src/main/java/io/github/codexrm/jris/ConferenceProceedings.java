package io.github.codexrm.jris;

import java.util.ArrayList;

public class ConferenceProceedings extends BaseReference {

    private final ArrayList<String> listAuthor;
    private final ArrayList<String> listEditor;
    private final ArrayList<String> listSeriesEditor;
    private String title;
    private String date;
    private String volume;
    private String serie;
    private String address;

    public ConferenceProceedings() {
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
        this.date = validateDate(date);
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    public String getSerie() {return serie;}

    public void setSerie(final String serie) {this.serie = serie;}

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}