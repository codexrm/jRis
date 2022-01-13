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
    article.setTi("project of education");
    article.setDa("2008", RisMonth.MARCH);
    article.setN1("aa");
    article.setJo("Sciences and education");
    article.setVl("vol132");
    article.setIs("no3443");
    article.setSp("p1011");
    article.setAu("Jacob", "Martin-Gonzalez");
    manager.addReference(article);

    book.setTi("relations and your career");
    book.setDa("1987", RisMonth.APRIL);
    book.setN1("bb");
    book.setAu("Enrique", "Navarro-Gener");
    book.setA2("Jacob", "Martin-Gonzalez");
    book.setPb("Prencite Hall");
    book.setVl("vol35");
    book.setT2("xx7");
    book.setAd("ave67 no02");
    book.setEt("Ing Isis Perez");
    manager.addReference(book);

    section.setAu("Maria", "Fernadez-Diaz");
    section.setTi("introduction to Windows");
    section.setDa("2012");
    section.setN1("cc");
    section.setPb("Education");
    section.setVl("vol35");
    section.setT3("ja4");
    section.setAd("ave 76 no74");
    section.setEt("Ing Olga Domigz");
    section.setEp("I");
    section.setSp("1234");
    manager.addReference(section);

    thesis.setAu("Enrique", "Navarro-Gener");
    thesis.setA2("Jacob", "Martin-Gonzalez");
    thesis.setA3("Maria", "Fernadez-Diaz");
    thesis.setTi("Reference");
    thesis.setDa("2019", RisMonth.MAY);
    thesis.setN1("dd");
    thesis.setPb("Cespedes");
    thesis.setM3("phd");
    thesis.setAd("ave61");
    manager.addReference(thesis);

    conference.setAu("Roberto", "Nunnez");
    conference.setTi("The men");
    conference.setDa("2020", RisMonth.AUGUST);
    conference.setN1("ee");
    conference.setVl("vol34");
    conference.setT3("x13");
    conference.setAd("ave76,no87");
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
