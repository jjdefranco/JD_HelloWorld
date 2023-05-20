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
    public void printWordBackwords(String word) {
        
        private String varStr;

    public String getVarStr() {
        return varStr;
    }

    public void setVarStr(String varStr) {
        this.varStr = varStr;
    }

        // Verify there is at least 1 parameter
        if (word.length() < 1)
        {
                System.out.println("Need to provide 1 word as a parameter.");
                return;
        }

            // Creating array of string length
            String str = word;
        String[] arr = new String[str.length()];
        
        // Add a comment.

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
