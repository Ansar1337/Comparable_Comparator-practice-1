import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        List<House> houses = new ArrayList<>();

        House largeHouse = new House(2222, 333, 2);
        House mediumHouse = new House(1000, 1111, 5);
        House smallHouse = new House(500, 2504, 3);

        houses.add(largeHouse);
        houses.add(mediumHouse);
        houses.add(smallHouse);

        // Sorting houses by their prices using Comparable
        System.out.println("Sorting houses by their prices: ");
        Collections.sort(houses);
        System.out.println(houses);

        // Sorting houses by their price, area and floor using Comparator
        while (isTrue) {
            System.out.printf("Menu: %n Enter 1 for price filter %n Enter 2 for area filter %n Enter 3 for floor filter %n Enter 0 to terminate program");
            System.out.println();
            String myString = scanner.nextLine();
            switch (myString) {
                case "1" -> {
                    Comparator<House> priceFilterComparator = new PriceFilter();
                    houses.sort(priceFilterComparator);
                    System.out.println(houses);
                }
                case "2" -> {
                    Comparator<House> areaFilter = new AreaFilter();
                    houses.sort(areaFilter);
                    System.out.println(houses);
                }
                case "3" -> {
                    Comparator<House> floorFilter = new FloorFilter();
                    houses.sort(floorFilter);
                    System.out.println(houses);
                }
                case "0" -> {
                    isTrue = false;
                    System.out.println("Program terminated!");
                }
            }
        }
    }
}