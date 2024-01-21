package io.github.codexrm.jris;

/**
 * Represents a base reference
 *
 * @author Marynés Díaz
 * @version 1.4.0
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
