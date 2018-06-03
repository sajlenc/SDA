package designpatternsrepeat.factory;

import static designpatternsrepeat.factory.Document.*;

public class DocumentGenerator {
    Document generateDoc(String text, DocumentType type){
        Document document = null;
        switch (type){
            case HTML:
                document = new HtmlDocument(text);
                break;
            case TXT:
                document = new TxtDocument(text);
                break;
        }
        return document;
    }
}
