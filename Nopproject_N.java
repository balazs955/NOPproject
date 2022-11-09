/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopproject_n;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Nopproject_N {
    public static boolean szev(int szokoev) {
    if (szokoev % 4 != 0) {
        return false;
  } else if (szokoev % 400 == 0) {
        return true;
  } else if (szokoev % 100 == 0) {
        return false;
  } else {
        return true;
  }
    }
    public static int sorrend(int num) {
      int reversed = 0;
      for(;num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      }
      return reversed;
    }
    public static void sorminta(){
        System.out.println("*************************************************");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Kérek egy évszámot: ");
        int s = myObj.nextInt();
        System.out.println("Szökőév-e ? " + szev(s));
        sorminta();
        System.out.println("Az évszám fordított sorrendje: " + sorrend(s));
    }

    
    }

}
