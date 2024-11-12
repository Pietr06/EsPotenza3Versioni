/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenzaproject;

public class PotenzaProject {
    
    public static void main(String[] args) {
        
        ScanBase ScanBase1 = new ScanBase();
        ScanEsp ScanEsp1 = new ScanEsp();
        Exp Exp1 = new Exp();
        
        ScanBase1.ScanBaseFunc();
        ScanEsp1.ScanEspFunc();
        
        Exp1.ExpFunc(ScanBase1.getBase(), ScanEsp1.GetEsp());
        
        
        
    }
}
