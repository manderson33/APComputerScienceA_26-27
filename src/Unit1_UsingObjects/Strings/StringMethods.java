package Unit1_UsingObjects.Strings;

import java.util.Scanner;

/**
 * @author marilounanderson on 20/10/2026
 */
public class StringMethods {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();

        //length returns the number of characters
        System.out.println("Length of phrase: " + phrase.length());
        //returns the index of the first occurence of the character
        System.out.println("Index of space: " + phrase.indexOf(" "));
        //indexOf return -1 if character is not found
        System.out.println("Index of space: " + phrase.indexOf("x"));

        //A substring is a consecutive portion of a bigger string
        //substring methods show method over loading
        //method-over loading means two or more methods of the same name
        //but with different parameter types, or number of parameters

        //substring with one parameter, returns a smaller string from that index
        System.out.println("Last two words: " + phrase.substring(7));

        //returns the smaller string from first index to the last index - 1
        //inclusive for first index, exclusive of the second index
        System.out.println("First word: " + phrase.substring(0, 6));

        String word1 = "Cat";
        String word2 = "Bat";
        System.out.println("Is cat equal to Cat? " + word1.equals(word2));

        System.out.println("Word1 compared to word2:" + word1.compareTo(word2));






    }
}
