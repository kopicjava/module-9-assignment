import java.util.ArrayList;

public class QuestionOne{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0)); // Accessing by index
        System.out.println("All fruits: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Banana"); // Remove by value
        System.out.println("After removing Banana: " + fruits);

        // Removing an element by index
        fruits.remove(1); // Remove the element at index 1
        System.out.println("After removing the element at index 1: " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Current size of the ArrayList: " + fruits.size());
    }
}
