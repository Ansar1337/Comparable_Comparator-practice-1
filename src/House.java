public class House implements Comparable<House> {
    private int price;
    private int area;
    private int floor;

    public House(int price, int area, int floor) {
        this.price = price;
        this.area = area;
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", area=" + area +
                ", floor=" + floor +
                '}';
    }

    @Override
    public int compareTo(House obj) {
        return this.getPrice() - obj.getPrice();
    }
}