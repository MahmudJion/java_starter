/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printmultiple;

/**
 *
 * @author lenovo
 */
public class PrintMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printMultiple("Hello", 5);
        printMultiple("World", -1);
        printMultiple("Love", 1);
    }
    
    static void printMultiple(String str, int num){
       while(num > 0){
         System.out.print(str+" ");
         num--;
        }
    }

}
