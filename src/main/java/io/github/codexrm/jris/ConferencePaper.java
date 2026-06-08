package io.github.codexrm.jris;

import java.util.ArrayList;

/**
 * Represents a conferencePaper Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.4.0
 */
public class ConferencePaper extends BaseReference {

    private final ArrayList<String> authorList;
    private final ArrayList<String> editorList;
    private String title;
    private String year;
    private String volume;
    private String publisher;
    private String address;
    private String pages;

    public ConferencePaper() {
        super();
        authorList = new ArrayList<>();
        editorList = new ArrayList<>();
    }

    /**
     * Gets the conferencePaper’s author list.
     *
     * @return the conferencePaper’s authorList.
     */
    public ArrayList<String> getAuthorList() { return authorList; }

    /**
     * Sets the conferencePaper’s author.
     *
     * @param author A String containing the conferencePaper’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the conferencePaper’s editor list.
     *
     * @return the conferencePaper’s editorList.
     */
    public ArrayList<String> getEditorList() { return editorList; }

    /**
     * Sets the conferencePaper’s editor.
     *
     * @param editor A String containing the conferencePaper’s editor.
     */
    public void setEditor(final String editor) {
        this.editorList.add(editor);
    }

    /**
     * Gets the conferencePaper’s title.
     *
     * @return the conferencePaper’s title.
     */
    public String getTitle() { return title; }

    /**
     * Sets the conferencePaper’s title.
     *
     * @param title A String containing the conferencePaper’s title.
     */
    public void setTitle(final String title) { this.title = title; }

    /**
     * Gets the conferencePaper’s year.
     *
     * @return the conferencePaper’s year.
     */
    public String getYear() { return year; }

    /**
     * Sets the conferencePaper’s year.
     *
     * @param year A String containing the conferencePaper’s year.
     */
    public void setYear(final String year) { this.year = year; }

    /**
     * Gets the conferencePaper’s volume.
     *
     * @return the conferencePaper’s volume.
     */
    public String getVolume() { return volume; }

    /**
     * Sets the conferencePaper’s volume.
     *
     * @param volume A String containing the conferencePaper’s volume.
     */
    public void setVolume(final String volume) { this.volume = volume; }

    /**
     * Gets the conferencePaper’s publisher.
     *
     * @return the conferencePaper’s publisher.
     */
    public String getPublisher() { return publisher; }

    /**
     * Sets the conferencePaper’s publisher.
     *
     * @param publisher A String containing the conferencePaper’s publisher.
     */
    public void setPublisher(final String publisher) { this.publisher = publisher; }

    /**
     * Gets the conferencePaper’s address.
     *
     * @return the conferencePaper’s address.
     */
    public String getAddress() { return address; }

    /**
     * Sets the conferencePaper’s address.
     *
     * @param address A String containing the conferencePaper’s address.
     */
    public void setAddress(final String address) { this.address = address; }

    /**
     * Gets the conferencePaper’s pages.
     *
     * @return the conferencePaper’s pages.
     */
    public String getPages() { return pages; }

    /**
     * Sets the conferencePaper’s pages.
     *
     * @param pages A String containing the conferencePaper’s pages.
     */
    public void setPages(final String pages) { this.pages = pages; }
}
