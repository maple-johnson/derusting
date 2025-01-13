import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListPractice 
{


  public static void main(String[] args) 
  {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> listContainer = new ArrayList<String>();
    System.out.println(listContainer);
    
    // Add 3 elements to the list (OK to do one-by-one)
    listContainer.add("One");
    listContainer.add("Two");
    listContainer.add("Three");
    System.out.println(listContainer);

    // Print the element at index 1
    System.out.println(listContainer.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    listContainer.set(1, "New");
    System.out.println(listContainer);

    // Insert a new element at index 0 (the length of the list will change)
    listContainer.addFirst("Sky");
    System.out.println(listContainer);

    // Check whether the list contains a certain string
    System.out.println(listContainer.contains("New"));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < listContainer.size(); i++) 
    {
          System.out.println("Index: " + listContainer.indexOf(listContainer.get(i)) + " & Value: " + listContainer.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(listContainer);
    System.out.println(listContainer);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    String listItems = "";
    
    for (Object item : listContainer) 
    {
          System.out.println(item);
          listItems += (item + " ");
    }

    System.out.println(listItems);

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }

}