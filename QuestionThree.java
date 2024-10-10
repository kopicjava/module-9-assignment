import java.util.HashSet;

public class QuestionThree {
    public static void main(String[] args) {
        // Creating a HashSet to store unique String elements
        HashSet<String> cities = new HashSet<>();

        // Adding elements to the HashSet
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");

        // Attempting to add duplicates
        boolean addedFirstDuplicate = cities.add("New York"); // Duplicate
        boolean addedSecondDuplicate = cities.add("Paris");   // Duplicate

        // Displaying the elements in the HashSet
        System.out.println("HashSet elements: " + cities);

        // Checking if duplicates were added
        System.out.println("Was 'New York' added again? " + addedFirstDuplicate);
        System.out.println("Was 'Paris' added again? " + addedSecondDuplicate);
    }
}
