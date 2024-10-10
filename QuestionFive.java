public class QuestionFive {

    public static void main(String[] args) {
        // Using the generic method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array elements:");
        printArrayElements(intArray);

        // Using the generic method with String array
        String[] strArray = {"Apple", "Banana", "Orange"};
        System.out.println("\nString array elements:");
        printArrayElements(strArray);

        // Using the generic method with Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("\nDouble array elements:");
        printArrayElements(doubleArray);
    }

    public static <T> void printArrayElements(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
