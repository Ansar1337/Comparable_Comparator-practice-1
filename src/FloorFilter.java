import java.util.Comparator;

public class FloorFilter implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return (o1.getFloor() > o2.getFloor() ? 1 : -1);
    }
}