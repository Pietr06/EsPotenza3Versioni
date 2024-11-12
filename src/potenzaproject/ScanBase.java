/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package potenzaproject;

import java.util.Scanner;

/**
 *
 * @author Ospite1
 */
public class ScanBase {
    private int base;
    
    void ScanBaseFunc(){
        int base;
        System.out.println("inserire base: ");
        Scanner scanner1 = new Scanner(System.in);
        base = scanner1.nextInt();
       this.base=base;
    }
    
    int getBase(){
        return this.base;
    }
    
}
