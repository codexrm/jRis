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
        if (reference.getAu() != null) {
            bufferedWriter.write("AU  - " + reference.getAu());
            bufferedWriter.newLine();
        }
        if (reference.getA2() != null) {
            bufferedWriter.write("A2  - " + reference.getA2());
            bufferedWriter.newLine();
        }
        if (reference.getA3() != null) {
            bufferedWriter.write("A3  - " + reference.getA3());
            bufferedWriter.newLine();
        }
        if (reference.getA4() != null) {
            bufferedWriter.write("A4  - " + reference.getA4());
            bufferedWriter.newLine();
        }
        if (reference.getTi() != null) {
            bufferedWriter.write("TI  - " + reference.getTi());
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
        if (reference.getN1() != null) {
            bufferedWriter.write("N1  - " + reference.getN1());
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

        if (reference.getJo() != null) {
            bufferedWriter.write("JO  - " + reference.getJo());
            bufferedWriter.newLine();
        }
        if (reference.getVl() != null) {
            bufferedWriter.write("VL  - " + reference.getVl());
            bufferedWriter.newLine();
        }
        if (reference.getIs() != null) {
            bufferedWriter.write("IS  - " + reference.getIs());
            bufferedWriter.newLine();
        }
        if (reference.getSp() != null) {
            bufferedWriter.write("SP  - " + reference.getSp());
        }
        closeReference(bufferedWriter);
    }

    private void writeBook(Book reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - BOOK");
        bufferedWriter.newLine();

        if (reference.getPb() != null) {
            bufferedWriter.write("PB  - " + reference.getPb());
            bufferedWriter.newLine();
        }
        if (reference.getVl() != null) {
            bufferedWriter.write("VL  - " + reference.getVl());
            bufferedWriter.newLine();
        }
        if (reference.getAd() != null) {
            bufferedWriter.write("AD  - " + reference.getAd());
            bufferedWriter.newLine();
        }
        if (reference.getEt() != null) {
            bufferedWriter.write("ET  - " + reference.getEt());
            bufferedWriter.newLine();
        }
        if (reference.getT2() != null) {
            bufferedWriter.write("T2  - " + reference.getT2());
        }
        closeReference(bufferedWriter);
    }

    private void writeSecc(Secc reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - SECC");
        bufferedWriter.newLine();

        if (reference.getPb() != null) {
            bufferedWriter.write("PB  - " + reference.getPb());
            bufferedWriter.newLine();
        }
        if (reference.getVl() != null) {
            bufferedWriter.write("VL  - " + reference.getVl());
            bufferedWriter.newLine();
        }
        if (reference.getAd() != null) {
            bufferedWriter.write("AD  - " + reference.getAd());
            bufferedWriter.newLine();
        }
        if (reference.getEt() != null) {
            bufferedWriter.write("ET  - " + reference.getEt());
            bufferedWriter.newLine();
        }
        if (reference.getT3() != null) {
            bufferedWriter.write("T3  - " + reference.getT3());
            bufferedWriter.newLine();
        }
        if (reference.getEp() != null) {
            bufferedWriter.write("EP  - " + reference.getEp());
            bufferedWriter.newLine();
        }
        if (reference.getSp() != null) {
            bufferedWriter.write("SP  - " + reference.getSp());
        }
        closeReference(bufferedWriter);
    }

    private void writeThes(Thes reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - THES");
        commonField(reference, bufferedWriter);

        if (reference.getPb() != null) {
            bufferedWriter.write("PB  - " + reference.getPb());
            bufferedWriter.newLine();
        }
        if (reference.getM3() != null) {
            bufferedWriter.write("M3  - " + reference.getM3());
            bufferedWriter.newLine();
        }
        if (reference.getAd() != null) {
            bufferedWriter.write("AD  - " + reference.getAd());
        }
        closeReference(bufferedWriter);
    }

    private void writeConf(Conf reference, BufferedWriter bufferedWriter) throws IOException {

        bufferedWriter.write("TY  - CONF");
        commonField(reference, bufferedWriter);

        if (reference.getVl() != null) {
            bufferedWriter.write("VL  - " + reference.getVl());
            bufferedWriter.newLine();
        }
        if (reference.getT3() != null) {
            bufferedWriter.write("T3  - " + reference.getT3());
            bufferedWriter.newLine();
        }
        if (reference.getAd() != null) {
            bufferedWriter.write("AD  - " + reference.getAd());
        }
        closeReference(bufferedWriter);
    }
}
