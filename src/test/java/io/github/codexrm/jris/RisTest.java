package io.github.codexrm.jris;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RisTest {
    private final RisManager manager = new RisManager();
    Jour article = new Jour();
    Book book = new Book();
    Secc section = new Secc();
    Thes thesis = new Thes();
    Conf conference = new Conf();

    @Test
    void addReference() {
        article.setTitle("project of education");
        article.setDate("2008", RisMonth.MARCH);
        article.setNotes("aa");
        article.setJournal("Sciences and education");
        article.setVolume("vol132");
        article.setNumber("no3443");
        article.setPages("p1011");
        article.setAuthor("Jacob", "Martin-Gonzalez");
        manager.addReference(article);

        book.setTitle("relations and your career");
        book.setDate("1987", RisMonth.APRIL);
        book.setNotes("bb");
        book.setAuthor("Enrique", "Navarro-Gener");
        book.setAuthor2("Jacob", "Martin-Gonzalez");
        book.setPublisher("Prencite Hall");
        book.setVolume("vol35");
        book.setSerie("xx7");
        book.setAddress("ave67 no02");
        book.setEdition("Ing Isis Perez");
        manager.addReference(book);

        section.setAuthor("Maria", "Fernadez-Diaz");
        section.setTitle("introduction to Windows");
        section.setDate("2012");
        section.setNotes("cc");
        section.setPublisher("Education");
        section.setVolume("vol35");
        section.setSerie("ja4");
        section.setAddress("ave 76 no74");
        section.setEdition("Ing Olga Domigz");
        section.setChapter("I");
        section.setPages("1234");
        manager.addReference(section);

        thesis.setAuthor("Enrique", "Navarro-Gener");
        thesis.setAuthor2("Jacob", "Martin-Gonzalez");
        thesis.setAuthor3("Maria", "Fernadez-Diaz");
        thesis.setTitle("Reference");
        thesis.setDate("2019", RisMonth.MAY);
        thesis.setNotes("dd");
        thesis.setUniversity("Cespedes");
        thesis.setThesisType("phd");
        thesis.setAddress("ave61");
        manager.addReference(thesis);

        conference.setAuthor("Roberto", "Nunnez");
        conference.setTitle("The men");
        conference.setDate("2020", RisMonth.AUGUST);
        conference.setNotes("ee");
        conference.setVolume("vol34");
        conference.setSerie("x13");
        conference.setAddress("ave76,no87");
        manager.addReference(conference);

        Assertions.assertEquals(5, manager.getListReference().size());

        try {
            Path pathExportListReference = Paths.get("testFile", "export.txt");
            manager.exportListReference(pathExportListReference.toString());
            Reader readerExport = new FileReader(pathExportListReference.toString());

            ArrayList<RisEntry> listExport = manager.importReferences(readerExport);

            Assertions.assertEquals(5, listExport.size());

            Path pathImportListReference = Paths.get("testFile", "importRis.txt");
            Reader reader = new FileReader(pathImportListReference.toString());

            ArrayList<RisEntry> list = manager.importReferences(reader);

            Assertions.assertEquals(5, list.size());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
