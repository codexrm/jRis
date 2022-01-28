package io.github.codexrm.jris;


import lombok.NonNull;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class RisManager {

    private final ArrayList<BaseReference> listReference;
    private final Export exportRis;
    private final Import importRis;

    public RisManager() {
        super();
        listReference = new ArrayList<>();
        exportRis = new Export();
        importRis = new Import();
    }

    public ArrayList<BaseReference> getListReference() {
        return listReference;
    }

    public void addReference(@NonNull final BaseReference reference) {
        listReference.add(reference);
    }


    public void exportListReference(@NonNull final String path) throws IOException {
        final Writer writer = new FileWriter(path);
        exportRis.writeValue(listReference, writer);
    }

    public ArrayList<BaseReference> importReferences(@NonNull final Reader reader) throws IOException {
        return importRis.readReader(reader);
    }
}
