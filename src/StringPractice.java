import java.util.ArrayList;
import java.util.List;

public class StringPractice 
{
  public static void main(String[] args) 
  {
    // Create a string with at least 5 characters and assign it to a variable
    String stringPractice = "Coding";
    System.out.println(stringPractice);

    // Find the length of the string
    System.out.println(stringPractice.length());

    // Concatenate (add) two strings together and reassign the result
    stringPractice = stringPractice + " Java";
    System.out.println(stringPractice);

    // Find the value of the character at index 3
    System.out.println(stringPractice.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(stringPractice.contains("Java"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < stringPractice.length(); i++) 
    {
          System.out.println(stringPractice.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> listStrings = new ArrayList<String>();
    System.out.println(listStrings);

    // Add multiple strings to the List (OK to do one-by-one)
    listStrings.add(stringPractice);
    listStrings.add("Coding C++");
    listStrings.add("Coding C#");
    listStrings.add("Coding Python");

    System.out.println(listStrings);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String comp = listStrings.toString();
    System.out.println(comp);

    // Check whether two strings are equal
    System.out.println(comp.equals(listStrings.toString()));
    System.out.println(listStrings.toString().equals(comp));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }

}
