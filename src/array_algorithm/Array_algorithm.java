
package array_algorithm;

import java.util.Scanner;

/**
 *
 * @author supre
 */
public class Array_algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String myWord = sc.nextLine();
        
        char[] letters = new char[myWord.length()]; 
        
        for(int i=0;i<letters.length;i++){
            letters[i] = myWord.charAt(i);
        }
        System.out.println("printing in reverse");

        for(int i=letters.length-1;i>=0;i--){
            System.out.println(letters[i]);
        }
        

    }
    
}
