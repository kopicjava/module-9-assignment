import java.util.HashMap;

public class QuestionFour {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs (Integer, String)
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs to the HashMap
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");

        // Displaying the entire HashMap
        System.out.println("Students HashMap: " + students);

        // Accessing a value by its key
        String student = students.get(102);
        System.out.println("Student with ID 102: " + student);

        // Checking if a specific key exists
        if (students.containsKey(103)) {
            System.out.println("Student with ID 103 is: " + students.get(103));
        }

        // Iterating over the HashMap to access all key-value pairs
        System.out.println("All students in the HashMap:");
        for (HashMap.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Removing a key-value pair
        students.remove(104);
        System.out.println("HashMap after removing student with ID 104: " + students);
    }
}
