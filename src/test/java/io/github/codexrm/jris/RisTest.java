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
    private final JournalArticle article = new JournalArticle();
    private final Book book = new Book();
    private final BookSection section = new BookSection();
    private final Thesis thesis = new Thesis();
    private final ConferenceProceedings proceedings = new ConferenceProceedings();
    private final ConferencePaper paper = new ConferencePaper();
    private final WebPage webPage = new WebPage();

    @Test
    void addReference() {

        article.setTitle("Proyecto de educacion");
        article.setYear("2003");
        article.setNotes("aa");
        article.setJournal("Ciencia y educacion");
        article.setVolume("2");
        article.setNumber("3");
        article.setPages("10");
        article.setIssn("1234-1234");
        article.setAuthor("Martin,Jacob");
        manager.addReference(article);

        book.setTitle("Relacion de las carreras");
        book.setYear("2021");
        book.setNotes("bb");
        book.setAuthor("Navarro,Enrique");
        book.setEditor("Martin,Jacob");
        book.setSerieEditor("Diaz,Camilo");
        book.setPublisher("Prencite Hall");
        book.setVolume("5");
        book.setNumber("2");
        book.setSeries("LCDT");
        book.setAddress("New York");
        book.setEdition("1");
        book.setIsbn("12396-8125");
        manager.addReference(book);

        section.setAuthor("Diaz,Maria");
        section.setEditor("Martin,Jacob");
        section.setSeriesEditor("Fernadez,Maria");
        section.setTitle("Introduccion a Windows");
        section.setYear("2012");
        section.setNotes("cc");
        section.setPublisher("Educacion");
        section.setVolume("3");
        section.setSeries("JAS");
        section.setNumber("1");
        section.setAddress("Barcelona,España");
        section.setEdition("1");
        section.setChapter("2");
        section.setPages("30");
        section.setIsbn("666658-8125");
        manager.addReference(section);

        thesis.setAuthor("Navarro,Enrique");
        thesis.setTitle("Referencias Bibliograficas");
        thesis.setYear("2019");
        thesis.setNotes("dd");
        thesis.setSchool("Universidad Agraria de La Habana");
        thesis.setType("phd");
        thesis.setAddress("Mayabeque,Cuba");
        manager.addReference(thesis);

        proceedings.setAuthor("Nunnez,Roberto");
        proceedings.setEditor("Gil,Marcos");
        proceedings.setSeriesEditor("Navarro,Luis");
        proceedings.setTitle("El hombre");
        proceedings.setYear("2020");
        proceedings.setNotes("ee");
        proceedings.setVolume("3");
        proceedings.setPublisher("Halt");
        proceedings.setNumber("1");
        proceedings.setSeries("LKJ");
        proceedings.setAddress("Guayaquil,Ecuador");
        manager.addReference(proceedings);

        paper.setAuthor("Ruben,Sanchez");
        paper.setEditor("Palacio,Gil");
        paper.setTitle("Primeface");
        paper.setYear("2021");
        paper.setNotes("gg");
        paper.setVolume("1");
        paper.setPages("20");
        paper.setAddress("Venecia,Italia");
        paper.setPublisher("Palt");
        manager.addReference(paper);

        webPage.setAuthor("Lopez,Coral");
        webPage.setTitle("Java FX");
        webPage.setYear("2020");
        webPage.setAccessYear("2023");
        webPage.setNotes("ff");
        webPage.setUrl("http://blog.buildpath.de/javafx-decouple-the-view-and-its-behavior-to-create-a-testable-ui/");
        manager.addReference(webPage);

        Assertions.assertEquals(7, manager.getReferenceList().size());

        try {
            final Path pathExportListReference = Paths.get("testFile", "export.txt");
            manager.exportListReference(pathExportListReference.toString());
            final Reader readerExport = new FileReader(pathExportListReference.toString());

            final ArrayList<BaseReference> listExport = manager.importReferences(readerExport);

            Assertions.assertEquals(7, listExport.size());

            final Path pathImportListReference = Paths.get("testFile", "importRis.txt");
            final Reader reader = new FileReader(pathImportListReference.toString());

            final ArrayList<BaseReference> list = manager.importReferences(reader);

            Assertions.assertEquals(7, list.size());

        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
