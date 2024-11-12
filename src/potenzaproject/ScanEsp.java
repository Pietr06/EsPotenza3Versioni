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
public class ScanEsp {
    private int esp;
    
    void ScanEspFunc(){
        int esp;
        System.out.println("inserire esponente: ");
        Scanner scanner2 = new Scanner(System.in);
        esp = scanner2.nextInt();
        this.esp=esp;
    }
    
    int GetEsp(){
        return this.esp;
    }
    
    
    
}
