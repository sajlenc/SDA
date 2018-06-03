package designpatternsrepeat.factory;

public class HtmlDocument extends Document {
    public HtmlDocument(String text) {
        super(parseForHtml(text), DocumentType.HTML);
    }

    private static String parseForHtml(String text) {
        return text
                .replaceAll("\r\n", "<br>")
                .replaceAll("\n", "<br>");
    }
}
