public class ReverseStringArray {

    public static void main(String[] args) {
        String[] array = {"Hello", "World", "Java", "Programming"};
        System.out.println("Original array: " + java.util.Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder(array[i]);
            sb.reverse();
            array[i] = sb.toString();
        }
        System.out.println("Reversed array: " + java.util.Arrays.toString(array));
    }
}
