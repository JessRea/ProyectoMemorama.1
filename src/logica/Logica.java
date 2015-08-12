/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Random;


public class Logica {
    
    public int[] getCardNumbers() {
        
        int[] numbers = new int[12];
        int count = 0;
        
        while(count < 12) {
            Random r = new Random();
            int na = r.nextInt(6) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
            
}
