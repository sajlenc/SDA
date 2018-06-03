package designpatternsrepeat.factory;

public class TxtDocument extends Document {
    public TxtDocument(String text) {
        super(text, DocumentType.TXT);
    }
}
