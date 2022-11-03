import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class BeanTest {

    public static void main(String[] args) {
        Album album1 = new Album(1, "The Doors", "The Doors", LocalDate.of(1996, 11, 19), 20, "Rock");
        Album album2 = new Album(2, "Tupac", "All eyez on me", LocalDate.of(1999, 5, 26), 25, "Hip-Hop");

        Author author1 = new Author(1, "John", "Doe");
        Author author2 = new Author(2, "Jane", "Doe");

        Quote quote1 = new Quote(1, "Don't Panic", author1);
        Quote quote2 = new Quote(2, "Don't Stress", author2);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quoteItem : quotes){
            System.out.println(quoteItem.getContent());
            System.out.println(quoteItem.getAuthor().getFirstName() + " " + quoteItem.getAuthor().getLastName());
        }
    }

}
