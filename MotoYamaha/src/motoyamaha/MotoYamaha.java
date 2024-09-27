/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motoyamaha;

/**
 *
 * @author User
 */
public class MotoYamaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moto m1 = new Moto();
        
        m1.cor="laranja";
        m1.ano=2020;
        m1.farol=false;
        m1.modelo="factor150";
        m1.status();
    }
    
}
