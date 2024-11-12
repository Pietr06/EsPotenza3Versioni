/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenzaimp;

import java.util.Scanner;

public class leoni_potenzaImp {

    public static void main(String[] args) {
        int base;
        int esp;
        int out;
        
        System.out.println("inserire base: ");
        Scanner scanner1 = new Scanner(System.in);
        base = scanner1.nextInt();
        
        System.out.println("inserire esponente: ");
        Scanner scanner2 = new Scanner(System.in);
        esp = scanner1.nextInt();
        
        out = base;
        for(int i=1;i<esp;i++){
            out = out * base;
        }
        System.out.println(base+"^"+esp+"="+out);
    }
    
}
