package io.github.codexrm.jris;

import java.io.*;
import java.util.ArrayList;

/**
 * Represents the class in charge of exporting the reference list to ris format
 *
 * @author Marynes Diaz
 * @version 1.0
 */
public class Export {

    private static final String TI = "TI  - ";
    private static final String DA = "DA  - ";
    private static final String VL = "VL  - ";
    private static final String AD = "AD  - ";
    private static final String PB = "PB  - ";
    private static final String PY = "PY  - ";

    public Export() {
        // Do nothing
    }

    /**
     * Write the values of the reference to the ris format
     *
     * @param listReference a list with all reference types to export
     * @param writer responsible for writing to the file
     * @throws IOException
     * @since 1.0
     */
    public void writeValue(final ArrayList<BaseReference> listReference, final Writer writer) throws IOException {

        final BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for (final BaseReference entry : listReference) {
            identifyType(entry, bufferedWriter);
        }
        closeFile(bufferedWriter);
    }

    private void identifyType(final BaseReference reference, final BufferedWriter bufferedWriter) throws IOException {

        switch (reference.getClass().getSimpleName()) {
            case "JournalArticle":
                writeJournal((JournalArticle) reference, bufferedWriter);
                break;
            case "Book":
                writeBook((Book) reference, bufferedWriter);
                break;
            case "BookSection":
                writeBookSection((BookSection) reference, bufferedWriter);
                break;
            case "Thesis":
                writeThesis((Thesis) reference, bufferedWriter);
                break;
            case "ConferenceProceedings":
                writeConferenceProceedings((ConferenceProceedings) reference, bufferedWriter);
                break;
            case "ConferencePaper":
                writeConferencePaper((ConferencePaper) reference, bufferedWriter);
                break;
            case "WebPage":
                writeWebPage((WebPage) reference, bufferedWriter);
                break;
            default:
        }

    }

    private void commonField(final BaseReference reference, final BufferedWriter bufferedWriter) throws IOException {

        if (reference.getNotes() != null) {
            bufferedWriter.newLine();
            bufferedWriter.write("N1  - " + reference.getNotes());
            bufferedWriter.newLine();
        }
    }

    private void closeReference(final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.newLine();
        bufferedWriter.write("ER  - ");
        bufferedWriter.newLine();
    }

    private void closeFile(final BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.close();
    }

    private void writePersonList(final ArrayList<String> personList, final BufferedWriter bufferedWriter, final String field) throws IOException {

        for (final String person : personList) {
            if (person != null) {
                switch (field) {
                    case "AU":
                        bufferedWriter.write("AU  - " + person);
                        bufferedWriter.newLine();
                        break;
                    case "A2":
                        bufferedWriter.write("A2  - " + person);
                        bufferedWriter.newLine();
                        break;
                    default:
                        bufferedWriter.write("A3  - " + person);
                        bufferedWriter.newLine();
                }

            }
        }
    }

    private void writeJournal(final JournalArticle reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - JOUR");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getJournal() != null) {
            bufferedWriter.write("T2  - " + reference.getJournal());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write(VL + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getNumber() != null) {
            bufferedWriter.write("C7  - " + reference.getNumber());
            bufferedWriter.newLine();
        }
        if (reference.getIssn() != null) {
            bufferedWriter.write("SN  - " + reference.getIssn());
            bufferedWriter.newLine();
        }
        if (reference.getPages() != null) {
            bufferedWriter.write("SP  - " + reference.getPages());
        }
        closeReference(bufferedWriter);
    }

    private void writeBook(final Book reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - BOOK");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");
        writePersonList(reference.getEditorList(), bufferedWriter, "A3");
        writePersonList(reference.getListSerieEditor(), bufferedWriter, "A2");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getPublisher() != null) {
            bufferedWriter.write(PB + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write(VL + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getNumber() != null) {
            bufferedWriter.write( "NV  - " + reference.getNumber());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write(AD + reference.getAddress());
            bufferedWriter.newLine();
        }
        if (reference.getEdition() != null) {
            bufferedWriter.write("ET  - " + reference.getEdition());
            bufferedWriter.newLine();
        }
        if (reference.getIsbn() != null) {
            bufferedWriter.write("SN  - " + reference.getIsbn());
            bufferedWriter.newLine();
        }
        if (reference.getSeries() != null) {
            bufferedWriter.write("T2  - " + reference.getSeries());
        }
        closeReference(bufferedWriter);
    }

    private void writeBookSection(final BookSection reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - CHAP");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");
        writePersonList(reference.getEditorList(), bufferedWriter, "A2");
        writePersonList(reference.getSeriesEditorList(), bufferedWriter, "A3");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getPublisher() != null) {
            bufferedWriter.write(PB + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getNumber() != null) {
            bufferedWriter.write("IS  - " + reference.getNumber());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write(VL + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write(AD + reference.getAddress());
            bufferedWriter.newLine();
        }
        if (reference.getEdition() != null) {
            bufferedWriter.write("ET  - " + reference.getEdition());
            bufferedWriter.newLine();
        }
        if (reference.getSeries() != null) {
            bufferedWriter.write("T3  - " + reference.getSeries());
            bufferedWriter.newLine();
        }
        if (reference.getChapter() != null) {
            bufferedWriter.write("SE  - " + reference.getChapter());
            bufferedWriter.newLine();
        }
        if (reference.getIsbn() != null) {
            bufferedWriter.write("SN  - " + reference.getIsbn());
            bufferedWriter.newLine();
        }
        if (reference.getPages() != null) {
            bufferedWriter.write("SP  - " + reference.getPages());
        }
        closeReference(bufferedWriter);
    }

    private void writeThesis(final Thesis reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - THES");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getSchool() != null) {
            bufferedWriter.write(PB + reference.getSchool());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getType() != null) {
            bufferedWriter.write("M3  - " + reference.getType());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write(AD + reference.getAddress());
        }
        closeReference(bufferedWriter);
    }

    private void writeConferenceProceedings(final ConferenceProceedings reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - CONF");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");
        writePersonList(reference.getEditorList(), bufferedWriter, "A2");
        writePersonList(reference.getSeriesEditorList(), bufferedWriter, "A3");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write("C2  - "  + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write(VL + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getPublisher() != null) {
            bufferedWriter.write(PB + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getNumber() != null) {
            bufferedWriter.write("NV  - " + reference.getNumber());
            bufferedWriter.newLine();
        }
        if (reference.getSeries() != null) {
            bufferedWriter.write("T3  - " + reference.getSeries());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write(AD + reference.getAddress());
        }
        closeReference(bufferedWriter);
    }
    
    private void writeConferencePaper(final ConferencePaper reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - CPAPER");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");
        writePersonList(reference.getEditorList(), bufferedWriter, "A2");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getVolume() != null) {
            bufferedWriter.write(VL + reference.getVolume());
            bufferedWriter.newLine();
        }
        if (reference.getPublisher() != null) {
            bufferedWriter.write(PB + reference.getPublisher());
            bufferedWriter.newLine();
        }
        if (reference.getAddress() != null) {
            bufferedWriter.write(AD + reference.getAddress());
            bufferedWriter.newLine();
        }
        if (reference.getPages() != null) {
            bufferedWriter.write("SP  - " + reference.getPages());
        }
        closeReference(bufferedWriter);
    }

    private void writeWebPage(final WebPage reference, final BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - ELEC");
        commonField(reference, bufferedWriter);
        writePersonList(reference.getAuthorList(), bufferedWriter, "AU");

        if (reference.getTitle() != null) {
            bufferedWriter.write(TI + reference.getTitle());
            bufferedWriter.newLine();
        }
        if (reference.getYear() != null) {
            bufferedWriter.write(PY + reference.getYear());
            bufferedWriter.newLine();
        }
        if (reference.getAccessYear() != null) {
            bufferedWriter.write(VL + reference.getAccessYear());
            bufferedWriter.newLine();
        }

        if (reference.getUrl() != null) {
            bufferedWriter.write("UR  - " + reference.getUrl());
        }
        closeReference(bufferedWriter);
    }
}
