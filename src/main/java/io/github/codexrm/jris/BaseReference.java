package io.github.codexrm.jris;

/**
 * Represents an base reference
 *
 * @author Marynes Diaz
 * @version 1.0
 */

public class BaseReference {

    protected String note;

    public BaseReference() {
        super();
    }

    /**
     * Gets the baseReference’s notes.
     *
     * @return the baseReference’s notes.
     */
    public String getNotes() {
        return note;
    }

    /**
     * Sets the baseReference’s notes.
     *
     * @param note A String containing  the baseReference’s notes.
     */
    public void setNotes(final String note) {
        this.note = note;
    }
}
