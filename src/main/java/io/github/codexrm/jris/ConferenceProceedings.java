package io.github.codexrm.jris;

import java.util.ArrayList;

/**
 * Represents a conferenceProceedings Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.4.0
 */
public class ConferenceProceedings extends BaseReference {

    private final ArrayList<String> authorList;
    private final ArrayList<String> editorList;
    private final ArrayList<String> seriesEditorList;
    private String title;
    private String year;
    private String volume;
    private String number;
    private String series;
    private String address;
    private String publisher;

    public ConferenceProceedings() {
        super();
        authorList = new ArrayList<>();
        editorList = new ArrayList<>();
        seriesEditorList = new ArrayList<>();
    }

    /**
     * Gets the conferenceProceedings’s author list.
     *
     * @return the conferenceProceedings’s authorList.
     */
    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    /**
     * Sets the conferenceProceedings’s author.
     *
     * @param author A String containing the conferenceProceedings’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the conferenceProceedings’s editor list.
     *
     * @return the conferenceProceedings’s editorList.
     */
    public ArrayList<String> getEditorList() {
        return editorList;
    }

    /**
     * Sets the conferenceProceedings’s editor.
     *
     * @param editor A String containing the conferenceProceedings’s editor.
     */
    public void setEditor(final String editor) {
        this.editorList.add(editor);
    }

    /**
     * Gets the conferenceProceedings’s series editor list.
     *
     * @return the conferenceProceedings’s seriesEditorList.
     */
    public ArrayList<String> getSeriesEditorList() {
        return seriesEditorList;
    }

    /**
     * Sets the conferenceProceedings’s series editor.
     *
     * @param seriesEditor A String containing the conferenceProceedings’s seriesEditor.
     */
    public void setSeriesEditor(final String seriesEditor) {
        this.seriesEditorList.add(seriesEditor);
    }

    /**
     * Gets the conferenceProceedings’s title.
     *
     * @return the conferenceProceedings’s title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the conferenceProceedings’s title.
     *
     * @param title A String containing the conferenceProceedings’s title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the conferenceProceedings’s volume.
     *
     * @return the conferenceProceedings’s volume.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the conferenceProceedings’s volume.
     *
     * @param volume A String containing the conferenceProceedings’s volume.
     */
    public void setVolume(final String volume) {
        this.volume = volume;
    }

    /**
     * Gets the conferenceProceedings’s series.
     *
     * @return the conferenceProceedings’s series.
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the conferenceProceedings’s series.
     *
     * @param series A String containing the conferenceProceedings’s series.
     */
    public void setSeries(final String series) {
        this.series = series;
    }

    /**
     * Gets the conferenceProceedings’s address.
     *
     * @return the conferenceProceedings’s address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the conferenceProceedings’s address.
     *
     * @param address A String containing the conferenceProceedings’s address.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Gets the conferenceProceedings’s year.
     *
     * @return the conferenceProceedings’s year.
     */
    public String getYear() { return year; }

    /**
     * Sets the conferenceProceedings’s year.
     *
     * @param year A String containing the conferenceProceedings’s year.
     */
    public void setYear(final String year) { this.year = year; }

    /**
     * Gets the conferenceProceedings’s number.
     *
     * @return the conferenceProceedings’s number.
     */
    public String getNumber() { return number; }

    /**
     * Sets the conferenceProceedings’s number.
     *
     * @param number A String containing the conferenceProceedings’s number.
     */
    public void setNumber(final String number) { this.number = number; }

    /**
     * Gets the conferenceProceedings’s publisher.
     *
     * @return the conferenceProceedings’s publisher.
     */
    public String getPublisher() { return publisher; }

    /**
     * Sets the conferenceProceedings’s publisher.
     *
     * @param publisher A String containing the conferenceProceedings’s publisher.
     */
    public void setPublisher(final String publisher) { this.publisher = publisher; }
}