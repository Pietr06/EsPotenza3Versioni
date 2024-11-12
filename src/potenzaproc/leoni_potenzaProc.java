/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenzaproc;

import java.util.Scanner;

public class leoni_potenzaProc {

    public static void main(String[] args) {
        System.out.println("inserire base: ");
        
        int base;
        int esp;
        
        leoni_potenzaProc potenza = new leoni_potenzaProc();
        
        base = potenza.ScanBase();
        esp = potenza.ScanEsp();
        potenza.Exp(base,esp);
    }
    
    int ScanBase(){
        int base;
        System.out.println("inserire base: ");
        Scanner scanner1 = new Scanner(System.in);
        base = scanner1.nextInt();
        return base;
    }
    
    int ScanEsp(){
        int esp;
        System.out.println("inserire esponente: ");
        Scanner scanner2 = new Scanner(System.in);
        esp = scanner2.nextInt();
        return esp;
    }
    
    void Exp(int base,int esp){
        int out = 1;
        
        for(int i=0;i<esp;i++){
            out = out * base;
        }
        System.out.println(base+"^"+esp+"="+out);
    }
    
}
