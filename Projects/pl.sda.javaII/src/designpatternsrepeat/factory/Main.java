package designpatternsrepeat.factory;

public class Main {
    public static void main(String[] args) {
        String text = "sample\r\ntext";

        DocumentGenerator documentGenerator = new DocumentGenerator();
        Document documentHtml =
                documentGenerator.generateDoc(text, Document.DocumentType.HTML);
        documentHtml.saveFile("fileHTML");

        Document documentTxt =
                documentGenerator.generateDoc(text, Document.DocumentType.TXT);
        documentTxt.saveFile("fileTXT");
    }
}
