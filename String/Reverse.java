//Reverse a string in Java
// Example: "Hello" -> "olleH"

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

    }
}

