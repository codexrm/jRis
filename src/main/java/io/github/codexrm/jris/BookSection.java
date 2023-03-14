package io.github.codexrm.jris;

import java.util.ArrayList;

/**
 * Represents an bookSection Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class BookSection extends BaseReference {

    private final ArrayList<String> authorList;
    private final ArrayList<String> editorList;
    private final ArrayList<String> seriesEditorList;
    private String title;
    private String chapter;
    private String year;
    private String pages;
    private String series;
    private String publisher;
    private String volume;
    private String address;
    private String edition;
    private String number;
    private String isbn;


    public BookSection() {
        super();
        authorList = new ArrayList<>();
        editorList = new ArrayList<>();
        seriesEditorList = new ArrayList<>();
    }

    /**
     * Gets the bookSection’s author list.
     *
     * @return the book’s authorList.
     */
    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    /**
     * Sets the bookSection’s author.
     *
     * @param author A String containing the bookSection’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the bookSection’s editor list.
     *
     * @return the book’s editorList.
     */
    public ArrayList<String> getEditorList() {
        return editorList;
    }

    /**
     * Sets the bookSection’s editor.
     *
     * @param editor A String containing the bookSection’s editor.
     */
    public void setEditor(final String editor) {
        this.editorList.add(editor);
    }

    /**
     * Gets the bookSection’s series editor list.
     *
     * @return the book’s seriesEditorList.
     */
    public ArrayList<String> getSeriesEditorList() {
        return seriesEditorList;
    }

    /**
     * Sets the bookSection’s series editor.
     *
     * @param seriesEditor A String containing the bookSection’s seriesEditor.
     */
    public void setSeriesEditor(final String seriesEditor) {
        this.seriesEditorList.add(seriesEditor);
    }

    /**
     * Gets the bookSection’s title
     *
     * @return the book’s title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the bookSection’s title.
     *
     * @param title A String containing the bookSection’s title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the bookSection’s chapter.
     *
     * @return the book’s chapter.
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * Sets the bookSection’s chapter.
     *
     * @param chapter A String containing the bookSection’s chapter.
     */
    public void setChapter(final String chapter) {
        this.chapter = chapter;
    }

    /**
     * Gets the bookSection’s pages.
     *
     * @return the book’s pages.
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the bookSection’s pages.
     *
     * @param pages A String containing the bookSection’s pages.
     */
    public void setPages(final String pages) {
        this.pages = pages;
    }

    /**
     * Gets the bookSection’s series.
     *
     * @return the book’s series.
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the bookSection’s series.
     *
     * @param series A String containing the bookSection’s series.
     */
    public void setSeries(final String series) {
        this.series = series;
    }

    /**
     * Gets the bookSection’s publisher.
     *
     * @return the book’s publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the bookSection’s publisher.
     *
     * @param publisher A String containing the bookSection’s publisher.
     */
    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the bookSection’s volume.
     *
     * @return the book’s volume.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the bookSection’s volume.
     *
     * @param volume A String containing the bookSection’s volume.
     */
    public void setVolume(final String volume) {
        this.volume = volume;
    }

    /**
     * Gets the bookSection’s address.
     *
     * @return the book’s address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the bookSection’s address.
     *
     * @param address A String containing the bookSection’s address.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Gets the bookSection’s edition.
     *
     * @return the book’s edition.
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the bookSection’s edition.
     *
     * @param edition A String containing the bookSection’s edition.
     */
    public void setEdition(final String edition) {
        this.edition = edition;
    }

    /**
     * Gets the bookSection’s year.
     *
     * @return the book’s year.
     */
    public String getYear() { return year; }

    /**
     * Sets the bookSection’s year.
     *
     * @param year A String containing the bookSection’s year.
     */
    public void setYear(final String year) { this.year = year; }

    /**
     * Gets the bookSection’s number.
     *
     * @return the book’s number.
     */
    public String getNumber() { return number; }

    /**
     * Sets the bookSection’s number.
     *
     * @param number A String containing the bookSection’s number.
     */
    public void setNumber(final String number) { this.number = number; }

    /**
     * Gets the bookSection’s isbn.
     *
     * @return the book’s isbn.
     */
    public String getIsbn() { return isbn; }

    /**
     * Sets the bookSection’s isbn.
     *
     * @param isbn A String containing the bookSection’s isbn.
     */
    public void setIsbn(final String isbn) { this.isbn = isbn; }
}
