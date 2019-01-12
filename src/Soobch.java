import java.util.Date;

public class Soobch {
    Date data;
    String text;
    String author;

    public Soobch() {
    }

    public Soobch(Date data, String text, String author) {
        this.data = data;
        this.text = text;
        this.author = author;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
