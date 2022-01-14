package io.github.codexrm.jris;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class RisManager {

    private final ArrayList<RisEntry> listReference;
    private Export exportRis;
    private Import importRis;

    public RisManager() {
        super();
        listReference = new ArrayList<>();
        exportRis = new Export();
        importRis = new Import();
    }

    public ArrayList<RisEntry> getListReference() {
        return listReference;
    }

    public void addReference(RisEntry reference) {
        listReference.add(reference);
    }

    public Export getExportRis() {
        return exportRis;
    }

    public void setExportRis(Export exportRis) {
        this.exportRis = exportRis;
    }

    public Import getImportRis() {
        return importRis;
    }

    public void setImportRis(Import importRis) {
        this.importRis = importRis;
    }

    public void exportListReference(String path) throws IOException {
        Writer writer = new FileWriter(path);
        exportRis.writeValue(listReference, writer);
    }

    public ArrayList<RisEntry> importReferences( Reader reader) throws IOException {
        return importRis.readReader(reader);
    }
}
