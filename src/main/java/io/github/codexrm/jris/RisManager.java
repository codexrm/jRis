package io.github.codexrm.jris;

import lombok.NonNull;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Represents the Manager class
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class RisManager {

    private final ArrayList<BaseReference> referenceList;
    private final Export exportRis;
    private final Import importRis;

    public RisManager() {
        super();
        referenceList = new ArrayList<>();
        exportRis = new Export();
        importRis = new Import();
    }

    /**
     * Gets the RisManager’s reference list.
     *
     * @return the RisManager’s referenceList.
     */
    public ArrayList<BaseReference> getReferenceList() {
        return referenceList;
    }

    /**
     * Adds a reference to the list.
     *
     * @param reference for add to the list.
     * @since 1.0
     */
    public void addReference(@NonNull final BaseReference reference) {
        referenceList.add(reference);
    }

    /**
     * Export reference list a Ris format
     *
     * @param path A String to identify the path to the file .
     * @throws IOException
     * @since 1.0
     */
    public void exportListReference(@NonNull final String path) throws IOException {

        final Writer writer = new FileWriter(path);
        exportRis.writeValue(referenceList, writer);
    }

    /**
     * Import file reference in Ris format
     *
     * @param reader responsible for reader to the file
     * @return list with all references imported.
     * @throws IOException
     * @since 1.0
     */
    public ArrayList<BaseReference> importReferences(@NonNull final Reader reader) throws IOException {
        return importRis.readReader(reader);
    }
}
