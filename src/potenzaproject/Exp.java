/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package potenzaproject;

/**
 *
 * @author Ospite1
 */
public class Exp {
    
    void ExpFunc(int base,int esp){
        int out = 1;
        
        for(int i=0;i<esp;i++){
            out = out * base;
        }
        System.out.println(base+"^"+esp+"="+out);
    }
    
}
