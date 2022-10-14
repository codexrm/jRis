package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents an webPage Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class WebPage extends BaseReference  {

    private final ArrayList<String> authorList;
    private String title;
    private LocalDate date;
    private LocalDate accessDate;
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
     * Gets the webPage’s date.
     *
     * @return the webPage’s date.
     */
    public LocalDate getDate() { return date; }

    /**
     * Sets the webPage’s date.
     *
     * @param date A LocalDate containing the webPage’s date.
     */
    public void setDate(final LocalDate date) { this.date = date; }

    /**
     * Gets the webPage’s accessDate.
     *
     * @return the webPage’s accessDate.
     */
    public LocalDate getAccessDate() { return accessDate; }

    /**
     * Sets the webPage’s accessDate.
     *
     * @param accessDate A LocalDate containing the webPage’s accessDate.
     */
    public void setAccessDate(final LocalDate accessDate) { this.accessDate = accessDate; }

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
