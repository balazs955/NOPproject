/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // year to be checked
    Scanner bill = new Scanner(System.in);
    System.out.println("Adj meg egy évszámot: ");
    int szokoev = bill.nextInt();
    
    // szökőév-e
    if (szokoev % 400 == 0) {
    } 
    else if (szokoev % 100 == 0) {
      System.out.println(szokoev + " nem szökőév.");
    } 
    else if (szokoev% 4 == 0) {
      
    } 
    else {
     System.out.println(szokoev + "  nem szökőév.");
    }
  }   
    
    
        
}
    


