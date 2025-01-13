public class ArrayPractice 
{
  public static void main(String[] args) 
  {
    // Create an array of Strings of size 4
    String arrayItems[] = {"One", "Two",  "Three", "Four"};
    System.out.println(arrayItems[0]  + " " + arrayItems[1] + " " + arrayItems[2] + " " + arrayItems[3]);

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arrayItems[0] = "Java";
    arrayItems[1] = "C++";
    arrayItems[2] = "C#";
    arrayItems[3] = "Python";

    System.out.println(arrayItems[0] + " " + arrayItems[1] + " " + arrayItems[2] + " " + arrayItems[3]);

    // Get the value of the array at index 2
    System.out.println(arrayItems[2]);

    // Get the length of the array
    System.out.println(arrayItems.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < arrayItems.length; i++) 
    {
          System.out.println(arrayItems[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String items : arrayItems) 
    {
          System.out.println(items);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }

}
