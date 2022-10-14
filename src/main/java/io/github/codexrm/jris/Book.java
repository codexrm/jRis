package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents an book Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class Book extends BaseReference {

    private final ArrayList<String> authorList;
    private final ArrayList<String> editorList;
    private final ArrayList<String> seriesEditorList;
    private String title;
    private LocalDate date;
    private String publisher;
    private String volume;
    private String series;
    private String address;
    private String edition;


    public Book() {
        super();
        authorList = new ArrayList<>();
        editorList = new ArrayList<>();
        seriesEditorList = new ArrayList<>();
    }

    /**
     * Gets the book’s author list.
     *
     * @return the book’s authorList.
     */
    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    /**
     * Sets the book’s author.
     *
     * @param author A String containing the book’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the book’s editor list.
     *
     * @return the book’s editorList.
     */
    public ArrayList<String> getEditorList() {
        return editorList;
    }

    /**
     * Sets the book’s editor.
     *
     * @param editor A String containing the book’s editor.
     */
    public void setEditor(final String editor) {
        this.editorList.add(editor);
    }

    /**
     * Gets the book’s serie editor list.
     *
     * @return the book’s serieEditorList.
     */
    public ArrayList<String> getListSerieEditor() {
        return seriesEditorList;
    }

    /**
     * Sets the book’s series editor.
     *
     * @param seriesEditor A String containing the book’s seriesEditor.
     */
    public void setSerieEditor(final String seriesEditor) {
        this.seriesEditorList.add(seriesEditor);
    }

    /**
     * Gets the book’s title.
     *
     * @return the book’s title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the book’s title.
     *
     * @param title A String containing the book’s title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the book’s date.
     *
     * @return the book’s date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the book’s date.
     *
     * @param date A LocalDate containing the book’s date.
     */
    public void setDate(final LocalDate date) {
        this.date = date;
    }

    /**
     * Gets the book’s publisher.
     *
     * @return the book’s publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the book’s publisher.
     *
     * @param publisher A String containing the book’s publisher.
     */
    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the book’s volume.
     *
     * @return the book’s volume.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the book’s volume.
     *
     * @param volume A String containing the book’s volume.
     */
    public void setVolume(final String volume) {
        this.volume = volume;
    }

    /**
     * Gets the book’s series.
     *
     * @return the book’s series.
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the book’s series.
     *
     * @param series A String containing the book’s series.
     */
    public void setSeries(final String series) {
        this.series = series;
    }

    /**
     * Gets the book’s address.
     *
     * @return the book’s address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the book’s address.
     *
     * @param address A String containing the book’s address.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Gets the book’s edition.
     *
     * @return the book’s edition.
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the book’s edition.
     *
     * @param edition A String containing the book’s edition.
     */
    public void setEdition(final String edition) {
        this.edition = edition;
    }
}
