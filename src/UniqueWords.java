/* Project: Lab 2
* Class: UniqueWords.java
* Author: Shanti Wright
* Date: September 30, 2024
* This program counts the number of unique strings in a list
*/
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	public static int countUnique(ArrayList<String> list) {
        HashSet<String> unique = new HashSet<>(list);//Declares hashSet
        return unique.size();//Return # of unique elements
    }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
