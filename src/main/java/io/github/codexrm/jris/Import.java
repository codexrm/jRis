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

    public ArrayList<RisEntry> readReader(Reader reader) throws IOException {

        ArrayList<RisEntry> listReference = new ArrayList<>();
        ArrayList<String[]> listString = new ArrayList<>();
        BufferedReader br = new BufferedReader(reader);
        String line;

        while ((line = br.readLine()) != null) {
            String[] partLine = validateExpression(line);
            if (partLine.length != 0) {
                String field = partLine[0].trim();
                if (field.equals("TY")) {
                    listString.add(partLine);
                    while (!line.equals("ER  - ")) {
                        line = br.readLine();
                        partLine = validateExpression(line);
                        if (partLine.length != 0) {
                            listString.add(partLine);
                        }
                    }
                    RisEntry reference = createReference(listString);
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

    private String[] validateExpression(String line) {
        Pattern pat = Pattern.compile("^[A-Z][A-Z1-9]\\s\\s-\\s.*");
        Matcher mat = pat.matcher(line);
        if (mat.matches()) {
            return line.split("-", 2);
        } else {

            return new String[0];
        }
    }

    private RisEntry createReference(ArrayList<String[]> listPartLine) {

        String field = listPartLine.get(0)[0];
        String content = listPartLine.get(0)[1];
        field = field.trim();
        content = content.trim();
        if (field.equals("TY")) {
            RisEntry reference;
            switch (content) {
                case "JOUR":
                    reference = createJour(listPartLine);
                    break;
                case "BOOK":
                    reference = createBook(listPartLine);
                    break;
                case "SECC":
                    reference = createSecc(listPartLine);
                    break;
                case "THES":
                    reference = createThes(listPartLine);
                    break;
                case "CONF":
                    reference = createConf(listPartLine);
                    break;
                default:
                    reference = null;
            }
            return reference;
        } else {
            return null;
        }
    }

    private void commonField(String field, String content, RisEntry reference) {
        switch (field) {
            case "AU":
                reference.setAuthor(content);
                break;
            case "A2":
                reference.setAuthor2(content);
                break;
            case "A3":
                reference.setAuthor3(content);
                break;
            case "A4":
                reference.setAuthor4(content);
                break;
            case "TI":
                reference.setTitle(content);
                break;
            case "PY":
                reference.setDate(content);
                break;
            case "DA":
                reference.setDate(content);
                break;
            default:
                reference.setNotes(content);
        }
    }

    private RisEntry createJour(ArrayList<String[]> listPartLine) {
        Jour article = new Jour();
        for (int i = 1; i < listPartLine.size() - 1; i++) {
            String field = listPartLine.get(i)[0];
            String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                case "A2":
                case "A3":
                case "A4":
                case "TI":
                case "PY":
                case "DA":
                case "N1":
                    commonField(field, content, article);
                    break;
                case "JO":
                    article.setJournal(content);
                    break;
                case "VL":
                    article.setVolume(content);
                    break;
                case "IS":
                    article.setNumber(content);
                    break;
                case "SP":
                    article.setPages(content);
                    break;
                default:
            }
        }
        return article;
    }

    private RisEntry createBook(ArrayList<String[]> listPartLine) {
        Book book = new Book();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                case "A2":
                case "A3":
                case "A4":
                case "TI":
                case "PY":
                case "DA":
                case "N1":
                    commonField(field, content, book);
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

    private RisEntry createSecc(ArrayList<String[]> listPartLine) {
        Secc section = new Secc();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            String content = listPartLine.get(i)[1];
            field = field.trim();

            switch (field) {
                case "AU":
                case "A2":
                case "A3":
                case "A4":
                case "TI":
                case "PY":
                case "DA":
                case "N1":
                    commonField(field, content, section);
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
                case "EP":
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

    private RisEntry createThes(ArrayList<String[]> listPartLine) {
        Thes thesis = new Thes();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            String content = listPartLine.get(i)[1];
            field = field.trim();
            switch (field) {
                case "AU":
                case "A2":
                case "A3":
                case "A4":
                case "TI":
                case "PY":
                case "DA":
                case "N1":
                    commonField(field, content, thesis);
                    break;
                case "PB":
                    thesis.setUniversity(content);
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

    private RisEntry createConf(ArrayList<String[]> listPartLine) {
        Conf proceedings = new Conf();
        for (int i = 1; i < listPartLine.size(); i++) {
            String field = listPartLine.get(i)[0];
            String content = listPartLine.get(i)[1];
            field = field.trim();
            switch (field) {
                case "AU":
                case "A2":
                case "A3":
                case "A4":
                case "TI":
                case "PY":
                case "DA":
                case "N1":
                    commonField(field, content, proceedings);
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
