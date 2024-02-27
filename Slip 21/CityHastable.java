// Import the java.util package
import java.util.*;

// Create a class to demonstrate the hashtable
public class CityHashtable {

    // Create a main method
    public static void main(String[] args) {
        // Create a hashtable to store city name and STD code
        Hashtable<String, String> cities = new Hashtable<>();

        // Add some cities and their codes
        cities.put("Pune", "020");
        cities.put("Mumbai", "022");
        cities.put("Delhi", "011");
        cities.put("Bangalore", "080");

        // Display the details of the hashtable
        System.out.println("The hashtable contains:");
        // Get a set of key-value pairs from the hashtable
        Set<Map.Entry<String, String>> entries = cities.entrySet();
        // Loop over the set and print each pair
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Remove a city from the hashtable
        cities.remove("Delhi");

        // Search for a specific city and display the code
        String city = "Mumbai";
        String code = cities.get(city);
        if (code != null) {
            System.out.println("The STD code of " + city + " is " + code);
        } else {
            System.out.println("The city " + city + " is not found in the hashtable");
        }
    }
}
