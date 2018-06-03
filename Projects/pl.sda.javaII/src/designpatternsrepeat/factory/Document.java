package designpatternsrepeat.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document {
    private String text;
    private DocumentType documentType;

    public Document(String text, DocumentType documentType) {
        this.text = text;
        this.documentType = documentType;
    }

    public void saveFile(String file) {
        String outputFile = "C:\\Projects\\pl.sda.javaII\\" +
                "src\\designpatternsrepeat\\factory\\" + file + documentType.extension;
        File f = new File(outputFile);
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    enum DocumentType {
        TXT(".txt"), HTML(".html");
        private String extension;

        DocumentType(String extension) {
            this.extension = extension;
        }
    }
}
