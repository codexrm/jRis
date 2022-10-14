package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

public class ConferencePaper extends BaseReference {

    private final ArrayList<String> authorList;
    private final ArrayList<String> editorList;
    private String title;
    private LocalDate date;
    private String volume;
    private String publisher;
    private String address;
    private String pages;

    public ConferencePaper() {
        super();
        authorList = new ArrayList<>();
        editorList = new ArrayList<>();
    }

    public ArrayList<String> getAuthorList() { return authorList; }

    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    public ArrayList<String> getEditorList() { return editorList; }

    public void setEditor(final String editor) {
        this.editorList.add(editor);
    }

    public String getTitle() { return title; }

    public void setTitle(final String title) { this.title = title; }

    public LocalDate getDate() { return date; }

    public void setDate(final LocalDate date) { this.date = date; }

    public String getVolume() { return volume; }

    public void setVolume(final String volume) { this.volume = volume; }

    public String getPublisher() { return publisher; }

    public void setPublisher(final String publisher) { this.publisher = publisher; }

    public String getAddress() { return address; }

    public void setAddress(final String address) { this.address = address; }

    public String getPages() { return pages; }

    public void setPages(final String pages) { this.pages = pages; }
}
