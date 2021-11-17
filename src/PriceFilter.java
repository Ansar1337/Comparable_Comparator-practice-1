import java.util.Comparator;

public class PriceFilter implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return (o1.getPrice() > o2.getPrice() ? 1 : -1);
    }
}