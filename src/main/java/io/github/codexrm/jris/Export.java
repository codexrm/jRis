package io.github.codexrm.jris;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Export {

    public Export() {
        // Do nothing
    }

    public void writeValue(ArrayList<RisEntry> listReference, Writer writer) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for (RisEntry entry : listReference) {
            identifyType(entry, bufferedWriter);
        }
        closeFile(bufferedWriter);
    }

    private void identifyType(RisEntry reference, BufferedWriter bufferedWriter) throws IOException {


        if (reference instanceof Jour) {
            writeJour((Jour) reference, bufferedWriter);
        } else {
            if (reference instanceof Book) {
                writeBook((Book) reference, bufferedWriter);
            } else {
                if (reference instanceof Secc) {
                    writeSecc((Secc) reference, bufferedWriter);
                } else {
                    if (reference instanceof Thes) {
                        writeThes((Thes) reference, bufferedWriter);
                    } else {
                        if (reference instanceof Conf) {
                            writeConf((Conf) reference, bufferedWriter);
                        }
                    }
                }
            }
        }
    }

    private void commonField(RisEntry reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.newLine();
        if (reference.getAuthor() != null) {
            bufferedWriter.write("AU  - " + reference.getAuthor());
            bufferedWriter.newLine();
        }
        if (reference.getAuthor2() != null) {
            bufferedWriter.write("A2  - " + reference.getAuthor2());
            bufferedWriter.newLine();
        }
        if (reference.getAuthor3() != null) {
            bufferedWriter.write("A3  - " + reference.getAuthor3());
            bufferedWriter.newLine();
        }
        if (reference.getAuthor4() != null) {
            bufferedWriter.write("A4  - " + reference.getAuthor4());
            bufferedWriter.newLine();
        }
        if (reference.getTitle() != null) {
            bufferedWriter.write("TI  - " + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.da != null) {
            if (reference instanceof Secc) {
                String[] da = reference.da.split("/");
                bufferedWriter.write("PY  - " + da[0].strip());
            } else {
                bufferedWriter.write("DA  - " + reference.da);
            }
            bufferedWriter.newLine();
        }
        if (reference.getNotes() != null) {
            bufferedWriter.write("N1  - " + reference.getNotes());
            bufferedWriter.newLine();
        }
    }

    private void closeReference(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("ER  - ");
        bufferedWriter.newLine();
    }

    private void closeFile(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.close();
    }

    private void writeJour(Jour reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - JOUR");
        commonField(reference, bufferedWriter);

        if (reference.getJournal() != null) {
            bufferedWriter.write("JO  - " + reference.getJournal());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write("VL  - " + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getNumber() != null) {
            bufferedWriter.write("IS  - " + reference.getNumber());
            bufferedWriter.newLine();
        }
        if (reference.getPages() != null) {
            bufferedWriter.write("SP  - " + reference.getPages());
        }
        closeReference(bufferedWriter);
    }

    private void writeBook(Book reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - BOOK");
        bufferedWriter.newLine();

        if (reference.getPublisher() != null) {
            bufferedWriter.write("PB  - " + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write("VL  - " + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write("AD  - " + reference.getAddress());
            bufferedWriter.newLine();
        }
        if (reference.getEdition() != null) {
            bufferedWriter.write("ET  - " + reference.getEdition());
            bufferedWriter.newLine();
        }
        if (reference.getSerie() != null) {
            bufferedWriter.write("T2  - " + reference.getSerie());
        }
        closeReference(bufferedWriter);
    }

    private void writeSecc(Secc reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - SECC");
        bufferedWriter.newLine();

        if (reference.getPublisher() != null) {
            bufferedWriter.write("PB  - " + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write("VL  - " + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write("AD  - " + reference.getAddress());
            bufferedWriter.newLine();
        }
        if (reference.getEdition() != null) {
            bufferedWriter.write("ET  - " + reference.getEdition());
            bufferedWriter.newLine();
        }
        if (reference.getSerie() != null) {
            bufferedWriter.write("T3  - " + reference.getSerie());
            bufferedWriter.newLine();
        }
        if (reference.getChapter() != null) {
            bufferedWriter.write("EP  - " + reference.getChapter());
            bufferedWriter.newLine();
        }
        if (reference.getPages() != null) {
            bufferedWriter.write("SP  - " + reference.getPages());
        }
        closeReference(bufferedWriter);
    }

    private void writeThes(Thes reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - THES");
        commonField(reference, bufferedWriter);

        if (reference.getUniversity() != null) {
            bufferedWriter.write("PB  - " + reference.getUniversity());
            bufferedWriter.newLine();
        }
        if (reference.getThesisType() != null) {
            bufferedWriter.write("M3  - " + reference.getThesisType());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write("AD  - " + reference.getAddress());
        }
        closeReference(bufferedWriter);
    }

    private void writeConf(Conf reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - CONF");
        commonField(reference, bufferedWriter);

        if (reference.getVolume() != null) {
            bufferedWriter.write("VL  - " + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getSerie() != null) {
            bufferedWriter.write("T3  - " + reference.getSerie());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write("AD  - " + reference.getAddress());
        }
        closeReference(bufferedWriter);
    }
}
