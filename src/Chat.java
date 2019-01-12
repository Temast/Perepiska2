import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Chat {
    String nazvanie;
    String author;
    Date dataSozdania;
    Date dataPoslObnov;
    ArrayList<Soobch> soobchenie;


    public Chat() {
    }

    public Chat(String nazvanie, String author, Date dataSozdania) {
        this.nazvanie = nazvanie;
        this.author = author;
        this.dataSozdania = dataSozdania;
        soobchenie = new ArrayList<Soobch>();
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDataSozdania() {
        return dataSozdania;
    }

    public void setDataSozdania(Date dataSozdania) {
        this.dataSozdania = dataSozdania;
    }

    public Date getDataPoslObnov() {
        return dataPoslObnov;
    }

    public void setDataPoslObnov(Date dataPoslObnov) {
        this.dataPoslObnov = dataPoslObnov;
    }

    public ArrayList<Soobch> getSoobchenie() {
        return soobchenie;
    }

    public void setSoobchenie(ArrayList<Soobch> soobchenie) {
        this.soobchenie = soobchenie;
    }
}
