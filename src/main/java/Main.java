import org.example.Human;
import org.example.Market;

public class Main {
    public static void main(String[] args) {
        Human name = new Human();
        name.setName("SERGEY POLO");
        Market market = new Market();
        market.update(name);
    }
}
