import java.util.ArrayList;

public class QuestionTwo {
    public static void main(String[] args) {
        // Creating an ArrayList to store Integer elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Displaying the elements of the ArrayList
        System.out.println("Elements in the ArrayList: " + numbers);

        // Adding more elements to demonstrate dynamic resizing
        numbers.add(50);
        numbers.add(60);

        // Displaying the elements after adding more
        System.out.println("Elements after adding more: " + numbers);

        // Accessing elements using a loop
        System.out.println("Accessing elements using a loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        // Accessing elements using an enhanced for loop
        System.out.println("Accessing elements using an enhanced for loop:");
        for (Integer number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}
