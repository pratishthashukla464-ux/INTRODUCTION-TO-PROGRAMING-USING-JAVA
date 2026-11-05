// Name: Pratishtha Shukla
// Roll No: 2650303024
// Assignment 11 - Question 2

package Assignment15.Question2;
public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
            sb.append(",");
        }

        // Remove the last comma
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
