package io.github.codexrm.jris;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RisTest {
    private final RisManager manager = new RisManager();
    private final JournalArticle article = new JournalArticle();
    private final Book book = new Book();
    private final BookSection section = new BookSection();
    private final Thesis thesis = new Thesis();
    private final ConferenceProceedings conference = new ConferenceProceedings();

    @Test
    void addReference() {
        article.setTitle("project of education");
        article.setDate(LocalDate.of(2008, 3, 1));
        article.setNotes("aa");
        article.setJournal("Sciences and education");
        article.setVolume("vol132");
        article.setNumber("no3443");
        article.setPages("p1011");
        article.setAuthor("Martin-Gonzalez,Jacob");
        manager.addReference(article);

        book.setTitle("relations and your career");
        book.setDate(LocalDate.of(1987, 4, 1));
        book.setNotes("bb");
        book.setAuthor("Navarro-Gener,Enrique");
        book.setEditor("Martin-Gonzalez,Jacob");
        book.setSerieEditor("Diaz,Camilo");
        book.setPublisher("Prencite Hall");
        book.setVolume("vol35");
        book.setSerie("xx7");
        book.setAddress("ave67 no02");
        book.setEdition("I");
        manager.addReference(book);

        section.setAuthor("Fernadez-Diaz,Maria");
        section.setEditor("Martin-Gonzalez,Jacob");
        section.setSeriesEditor("Fernadez-Diaz,Maria");
        section.setTitle("introduction to Windows");
        section.setDate(LocalDate.of(2012, 1, 1));
        section.setNotes("cc");
        section.setPublisher("Education");
        section.setVolume("vol35");
        section.setSerie("ja4");
        section.setAddress("ave 76 no74");
        section.setEdition("II");
        section.setChapter("I");
        section.setPages("1234");
        manager.addReference(section);

        thesis.setAuthor("Navarro-Gener,Enrique");
        thesis.setTitle("Reference");
        thesis.setDate(LocalDate.of(2019, 5, 1));
        thesis.setNotes("dd");
        thesis.setSchool("Cespedes");
        thesis.setThesisType("phd");
        thesis.setAddress("ave61");
        manager.addReference(thesis);

        conference.setAuthor("Nunnez,Roberto");
        conference.setEditor("Gil,Marcos");
        conference.setSeriesEditor("Navarro,Luis");
        conference.setTitle("The men");
        conference.setDate(LocalDate.of(2020, 8, 1));
        conference.setNotes("ee");
        conference.setVolume("vol34");
        conference.setSerie("x13");
        conference.setAddress("ave76,no87");
        manager.addReference(conference);

        Assertions.assertEquals(5, manager.getListReference().size());

        try {
            final Path pathExportListReference = Paths.get("testFile", "export.txt");
            manager.exportListReference(pathExportListReference.toString());
            final Reader readerExport = new FileReader(pathExportListReference.toString());

            final ArrayList<BaseReference> listExport = manager.importReferences(readerExport);

            Assertions.assertEquals(5, listExport.size());

            final Path pathImportListReference = Paths.get("testFile", "importRis.txt");
            final Reader reader = new FileReader(pathImportListReference.toString());

            final ArrayList<BaseReference> list = manager.importReferences(reader);

            Assertions.assertEquals(5, list.size());

        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
