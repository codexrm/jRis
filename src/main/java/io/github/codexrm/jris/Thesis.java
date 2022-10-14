package io.github.codexrm.jris;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents a thesis Reference
 * Please see the {@link io.github.codexrm.jris.BaseReference}
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class Thesis extends BaseReference {

    private final ArrayList<String> authorList;
    private String title;
    private LocalDate date;
    private String school;
    private String type;
    private String address;

    public Thesis() {
        super();
        authorList = new ArrayList<>();
    }

    /**
     * Gets the thesis’s author list.
     *
     * @return the thesis’s authorList.
     */
    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    /**
     * Sets the thesis’s author.
     *
     * @param author A String containing the thesis’s author.
     */
    public void setAuthor(final String author) {
        this.authorList.add(author);
    }

    /**
     * Gets the thesis’s title.
     *
     * @return the thesis’s title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the thesis’s title.
     *
     * @param title A String containing the thesis’s title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the thesis’s date.
     *
     * @return the thesis’s date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the thesis’s date.
     *
     * @param date A LocalDate containing the thesis’s date.
     */
    public void setDate(final LocalDate date) {
        this.date = date;
    }

    /**
     * Gets the thesis’s school.
     *
     * @return the thesis’s school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the thesis’s school.
     *
     * @param school A String containing the thesis’s school.
     */
    public void setSchool(final String school) {
        this.school = school;
    }

    /**
     * Gets the thesis’s type.
     *
     * @return the thesis’s type.
     */
    public String getThesisType() {
        return type;
    }

    /**
     * Sets the thesis’s type.
     *
     * @param type A String containing the thesis’s type.
     */
    public void setThesisType(final String type) {
        this.type = type;
    }

    /**
     * Gets the thesis’s address.
     *
     * @return the thesis’s address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the thesis’s address.
     *
     * @param address A String containing the thesis’s address.
     */
    public void setAddress(final String address) {
        this.address = address;
    }
}
