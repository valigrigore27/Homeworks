import com.yourpackage.*;

/**
 In clasa Main am dat cateva exemple de locations si un exemplu de road iar mai apoi le am afisat
 */
public class Main {
    public static void main(String[] args) {

        City city1 = new City("New York City", 40.7128, -74.0060, 55555);
        City city2 = new City("San Francisco", 37.7749, 122.4194, 33333);
        Airport airport1 = new Airport("JFK Airport", 40.6413, -73.7781, 42, false);

        City newYork = new City("New York", 1, 2, 8_500_000);
        Location start = newYork;
        Location end = new City("Washington DC", 4, 5, 700_000);
        Highway road1 = new Highway("I-95", start, end, 226.9, 65, true);


        // Print the locations and roads
        System.out.println(city1);
        System.out.println(city1);
    }
}