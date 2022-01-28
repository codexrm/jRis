package io.github.codexrm.jris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Import {

    public Import() {
        // Do nothing
    }

    public ArrayList<BaseReference> readReader(final Reader reader) throws IOException {

        final ArrayList<BaseReference> listReference = new ArrayList<>();
        final ArrayList<String[]> listString = new ArrayList<>();
        final BufferedReader br = new BufferedReader(reader);
        String line;

        while ((line = br.readLine()) != null) {
            String[] partLine = validateExpression(line);
            if (partLine.length != 0) {
                final String field = partLine[0].trim();
                if (field.equals("TY")) {
                    listString.add(partLine);
                    while (!line.equals("ER  - ")) {
                        line = br.readLine();
                        partLine = validateExpression(line);
                        if (partLine.length != 0) {
                            listString.add(partLine);
                        }
                    }
                    final BaseReference reference = createReference(listString);
                    if (reference != null) {
                        listReference.add(reference);
                    }
                    listString.clear();
                }
            }
        }
        br.close();
        return listReference;
    }

    private String[] validateExpression(final String line) {
        final Pattern pat = Pattern.compile("^[A-Z][A-Z1-9]\\s\\s-\\s.*");
        final Matcher mat = pat.matcher(line);
        if (mat.matches()) {
            return line.split("-", 2);
        } else {

            return new String[0];
        }
    }

    private BaseReference createReference(final ArrayList<String[]> listPartLine) {

        String field = listPartLine.get(0)[0];
        String content = listPartLine.get(0)[1];
        field = field.trim();
        content = content.trim();
        if (field.equals("TY")) {
            final BaseReference reference;
            switch (content) {
                case "ABST":
                case "INPR":
                case "JFULL":
                case "JOUR":
                    reference = createJournal(listPartLine);
                    break;
                case "BOOK":
                    reference = createBook(listPartLine);
                    break;
                case "CHAP":
                    reference = createBookSection(listPartLine);
                    break;
                case "THES":
                    reference = createThesis(listPartLine);
                    break;
                case "CONF":
                    reference = createConferenceProceedings(listPartLine);
                    break;
                default:
                    reference = null;
            }
            return reference;
        } else {
            return null;
        }
    }

    private BaseReference createJournal(final ArrayList<String[]> listPartLine) {
        final JournalArticle journal = new JournalArticle();
        for (int i = 1; i < listPartLine.size() - 1; i++) {
            String field = listPartLine.get(i)[0];
            final String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                    journal.setAuthor(content);
                    break;
                case "TI":
                    journal.setTitle(content);
                    break;
                case "PY":
                case "DA":
                    journal.setDate(content);
                    break;
                case "N1":
                    journal.setNotes(content);
                    break;
                case "T2":
                    journal.setJournal(content);
                    break;
                case "VL":
                    journal.setVolume(content);
                    break;
                case "C7":
                    journal.setNumber(content);
                    break;
                case "M2":
                    journal.setPages(content);
                    break;
                default:
            }
        }
        return journal;
    }

    private BaseReference createBook(final ArrayList<String[]> listPartLine) {
        final Book book = new Book();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            final String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                    book.setAuthor(content);
                    break;
                case "A2":
                    book.setSerieEditor(content);
                    break;
                case "A3":
                    book.setEditor(content);
                    break;
                case "TI":
                    book.setTitle(content);
                    break;
                case "PY":
                case "DA":
                    book.setDate(content);
                    break;
                case "N1":
                    book.setNotes(content);
                    break;
                case "PB":
                    book.setPublisher(content);
                    break;
                case "VL":
                    book.setVolume(content);
                    break;
                case "T2":
                    book.setSerie(content);
                    break;
                case "AD":
                    book.setAddress(content);
                    break;
                case "ET":
                    book.setEdition(content);
                    break;
                default:
            }
        }
        return book;
    }

    private BaseReference createBookSection(final ArrayList<String[]> listPartLine) {
        final BookSection section = new BookSection();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            final String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                    section.setAuthor(content);
                    break;
                case "A2":
                    section.setEditor(content);
                    break;
                case "A3":
                    section.setSeriesEditor(content);
                    break;
                case "TI":
                    section.setTitle(content);
                    break;
                case "PY":
                    section.setDate(content);
                    break;
                case "N1":
                    section.setNotes(content);
                    break;
                case "PB":
                    section.setPublisher(content);
                    break;
                case "VL":
                    section.setVolume(content);
                    break;
                case "T3":
                    section.setSerie(content);
                    break;
                case "AD":
                    section.setAddress(content);
                    break;
                case "ET":
                    section.setEdition(content);
                    break;
                case "SE":
                    section.setChapter(content);
                    break;
                case "SP":
                    section.setPages(content);
                    break;
                default:
            }
        }
        return section;
    }

    private BaseReference createThesis(final ArrayList<String[]> listPartLine) {
        final Thesis thesis = new Thesis();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            final String content = listPartLine.get(i)[1];
            field = field.trim();
            switch (field) {
                case "AU":
                    thesis.setAuthor(content);
                    break;
                case "TI":
                    thesis.setTitle(content);
                    break;
                case "PY":
                case "DA":
                    thesis.setDate(content);
                    break;
                case "N1":
                    thesis.setNotes(content);
                    break;
                case "PB":
                    thesis.setSchool(content);
                    break;
                case "M3":
                    thesis.setThesisType(content);
                    break;
                case "AD":
                    thesis.setAddress(content);
                    break;
                default:
            }
        }
        return thesis;
    }

    private BaseReference createConferenceProceedings(final ArrayList<String[]> listPartLine) {
        final ConferenceProceedings proceedings = new ConferenceProceedings();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            final String content = listPartLine.get(i)[1];
            field = field.trim();
            switch (field) {
                case "AU":
                    proceedings.setAuthor(content);
                    break;
                case "A2":
                    proceedings.setEditor(content);
                    break;
                case "A3":
                    proceedings.setSeriesEditor(content);
                    break;
                case "TI":
                    proceedings.setTitle(content);
                    break;
                case "PY":
                case "DA":
                    proceedings.setDate(content);
                    break;
                case "N1":
                    proceedings.setNotes(content);
                    break;
                case "VL":
                    proceedings.setVolume(content);
                    break;
                case "T3":
                    proceedings.setSerie(content);
                    break;
                case "AD":
                    proceedings.setAddress(content);
                    break;
                default:
            }
        }
        return proceedings;
    }
}
