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
public class Moto {
    String cor;
    String modelo;
    int ano;
    boolean farol;
    
    void status(){
        System.out.println("A cor da moto e " + this.cor);
        System.out.println(" O modelo da moto é " + this.modelo);
        System.out.println(" O ano da moto é " + this.ano);
        System.out.println("O farol esta ligada ? " + this.farol);
        
    }
    void ligar(){
        this.farol=true;
    }
    
    void desligado(){
        this.farol=false;
        
    }
}
