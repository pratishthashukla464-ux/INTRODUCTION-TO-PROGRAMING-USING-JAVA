// Name: Pratishtha Shukla
// Roll No: 2650303024
// Assignment 11 - Question 2

package Assignment13.Question2;
public class Main {
    public static void main(String[] args) {

        String word = "Java";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("Reversed: " + reverse);
    }
}
