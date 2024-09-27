/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.java;

/**
 *
 * @author User
 */
public class GeladeiraP {//atributos
    String cor;
    float tamanho;
    boolean ligar;
     float temperatura;
     void status(){
         System.out.println(" uma cor " + this.cor);
         System.out.println(" Tamanho " + this.tamanho);
         System.out.println("Ligar ? " + this.ligar);
         System.out.println(" Ta temperatura ? " + this.temperatura);
         
         
         
     }
     void gelar(){//metodos
         if (this.ligar == true){
             System.out.println("Esta gelando");
         }else{
             System.out.println("Esta quente");
         }
     }
     
     void ligar(){//metodos
         
     }
     
     void desligar(){//metodos
         
     }
     
    
}
