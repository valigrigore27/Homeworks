import java.util.*;

import com.yourpackage.*;

/**
 * In aceasta clasa vom descrie o instanta a problemei.(pt subpunctul 1)
 * Am luat doua seturi una pentru locations si una pentru roads, am facut pentru fiecare
 * dintre acestea cate un getter apoi am facut cate o metoda pentru fiecare pentru a vedea daca exista deja locatia sau drumul pe care vreau sa l adaug.(subpunctul2?)
 * Pentru a determina daca instanta problemei este valida am creat o metoda pentru a verific anumite caracteristici in cadrul locatiilor si a drumurilor. De exemplu la locatii sa nu am coordonate negative (prin absurd)
 */
public class Problem {

    private Set<Location> locations;
    private Set<Road> roads;

    public Problem() {
        this.locations = new HashSet<>();
        this.roads = new HashSet<>();
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public Set<Road> getRoads() {
        return roads;
    }

    public void addLocation(Location location) {
        if (locations.contains(location)) {
            System.out.println("Location already exists.");
        }
        locations.add(location);
    }

    public void addRoad(Road road) {
        if (roads.contains(road)) {
            System.out.println("Road already exists.");
        }
        roads.add(road);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problem problem = (Problem) o;
        return Objects.equals(locations, problem.locations) && Objects.equals(roads, problem.roads);
    }

    public boolean isValidInstance() {
        // Check for duplicate location names and invalid coordinates
        for (Location location : locations) {
            if (location.getX() < 0 || location.getY() < 0) {
                return false;
            }
        }

        // Check for duplicate road names, missing locations, and invalid road properties
        for (Road road : roads) {
            if (!locations.contains(road.getStart()) || !locations.contains(road.getEnd()) || road.getLength() <= 0 || road.getSpeedLimit() <= 0) {
                return false;
            }
        }
        return true;
    }

    public String bestRoute(Location location1, Location location2) {
        double minimumLength = 100_000_000;
        for (Road road : roads) {
            if (road.getStart() == location1 && road.getEnd() == location2 && road.getLength() < minimumLength)
                minimumLength = road.getLength();
        }
        for (Road road : roads) {
            if (road.getLength() == minimumLength)
              return road.getName();
        }
        return null;
    }

    public static void main(String[] args) {
        Problem problem = new Problem();

        //LOCATIONS

        City city = new City("New York City", 40.7128, 74.0060, 8336817);
        Airport airport = new Airport("John F. Kennedy Airport", 40.6413, 73.7781, 128, true);

        //ROADS

        Location start = new City("New York", 1, 2, 8_500_000);
        Location end = new City("Washington DC", 4, 5, 700_000);
        Highway highway = new Highway("I-95", start, end, 226.9, 65, true);
        Highway highway1 = new Highway("A2", start, end, 500, 65, true);

        if (problem.isValidInstance() == true) {
            System.out.println("The problem's instance is valid.");

            System.out.println(problem.bestRoute(start,end));

            problem.addLocation(city);
            problem.addLocation(airport);
            problem.addRoad(highway);

            System.out.println("Locations:");
            for (Location location : problem.getLocations()) {
                System.out.println(location);
            }

            System.out.println("Roads:");
            for (Road road : problem.getRoads()) {
                System.out.println(road);
            }
        } else {
            System.out.println("The problem's instance is NOT valid.");
        }


    }
}