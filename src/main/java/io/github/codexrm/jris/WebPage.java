package io.github.codexrm.jris;

import java.util.ArrayList;

/**
 * Represents a webPage Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.4.0
 */
public class WebPage extends BaseReference  {

    private final ArrayList<String> authorList;
    private String title;
    private String year;
    private String accessYear;
    private String url;

    public WebPage() {
        super();
        authorList = new ArrayList<>();
    }

    /**
     * Gets the webPage’s author list.
     *
     * @return the webPage’s authorList.
     */
    public ArrayList<String> getAuthorList() { return authorList; }

    /**
     * Sets the webPage’s author.
     *
     * @param author A String containing the webPage’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the webPage’s title.
     *
     * @return the webPage’s title.
     */
    public String getTitle() { return title; }

    /**
     * Sets the webPage’s title.
     *
     * @param title A String containing the webPage’s title.
     */
    public void setTitle(final String title) { this.title = title; }

    /**
     * Gets the webPage’s year.
     *
     * @return the webPage’s year.
     */
    public String getYear() { return year; }

    /**
     * Sets the webPage’s year.
     *
     * @param year A String containing the webPage’s year.
     */
    public void setYear(final String year) { this.year = year; }

    /**
     * Gets the webPage’s accessYear.
     *
     * @return the webPage’s accessYear.
     */
    public String getAccessYear() { return accessYear; }

    /**
     * Sets the webPage’s accessYear.
     *
     * @param accessYear A LocalDate containing the webPage’s accessYear.
     */
    public void setAccessYear(final String accessYear) { this.accessYear = accessYear; }

    /**
     * Gets the webPage’s url.
     *
     * @return the webPage’s url.
     */
    public String getUrl() { return url; }

    /**
     * Sets the webPage’s url.
     *
     * @param url A String containing the webPage’s url.
     */
    public void setUrl(final String url) { this.url = url; }
}
