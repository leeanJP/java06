package sol;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class LibTest {
    public static void main(String[] args) {
        String rtnStr = "";
        String url = "https://leeans-dev-book.gitbook.io/docs/lecture/java/section4./class";
        try {
            Document doc = Jsoup.connect(url).timeout(10 * 1000).post();
            Element body = doc.body();
            rtnStr = body.text();
            System.out.println(rtnStr);
        } catch (IOException e1) {
            System.out.println("Error Occurrence" + e1.getMessage());
        }

    }
}
