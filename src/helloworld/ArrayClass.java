/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author joede
 */
public class ArrayClass {
    public void printWordBackwords(String word)) {

        // Verify there is at least 1 parameter
        if (args.length < 1)
        {
                System.out.println("Need to provide 1 word as a parameter.");
                return;
        }

            // Creating array of string length
            String str = args[0];
        String[] arr = new String[str.length()];
        str

        // Copy character by character into array
        // Index an array from 0 as the first up to 1 less than the length.
        for (int i = 0; i < str.length(); i++) {
          arr[i] = str.substring(i,1);
        }

        // Printing the character array
        for (int i = str.length()-1; i > 0; i--) {
          System.out.println(arr[i]);
        }
    }
    
}
