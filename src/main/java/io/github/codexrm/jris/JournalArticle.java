package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents an journalArticle Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class JournalArticle extends BaseReference {

    private final ArrayList<String> authorList;
    private String title;
    private LocalDate date;
    private String journal;
    private String volume;
    private String number;
    private String pages;


    public JournalArticle() {
        super();
        authorList = new ArrayList<>();
    }

    /**
     * Gets the journalArticle’s author list.
     *
     * @return the journalArticle’s authorList.
     */
    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    /**
     * Sets the journalArticle’s author.
     *
     * @param author An String containing the journalArticle’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the journalArticle’s title.
     *
     * @return the journalArticle’s title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the journalArticle’s title.
     *
     * @param title A String containing the journalArticle’s title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the journalArticle’s date.
     *
     * @return the journalArticle’s date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the journalArticle’s date.
     *
     * @param date A LocalDate containing the journalArticle’s date.
     */
    public void setDate(final LocalDate date) {
        this.date = date;
    }

    /**
     * Gets the journalArticle’s journal.
     *
     * @return the journalArticle’s journal.
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets the journalArticle’s journal.
     *
     * @param journal A String containing the journalArticle’s journal.
     */
    public void setJournal(final String journal) {
        this.journal = journal;
    }

    /**
     * Gets the journalArticle’s volume.
     *
     * @return the journalArticle’s volume.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the journalArticle’s volume.
     *
     * @param volume A String containing the journalArticle’s volume.
     */
    public void setVolume(final String volume) {
        this.volume = volume;
    }

    /**
     * Gets the journalArticle’s number.
     *
     * @return the journalArticle’s number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the journalArticle’s number.
     *
     * @param number A String containing the journalArticle’s number.
     */
    public void setNumber(final String number) {
        this.number = number;
    }

    /**
     * Gets the journalArticle’s pages.
     *
     * @return the journalArticle’s pages.
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the journalArticle’s pages.
     *
     * @param pages A String containing the journalArticle’s pages.
     */
    public void setPages(final String pages) {
        this.pages = pages;
    }
}
