/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg02;

/**
 *
 * @author User
 */
public class Caneta {
    String modelo;  // ATRIBUTOS
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println(" uma caneta " + this.cor);
        System.out.println(" esta tampada ? "+ this.tampada);
        System.out.println("modelo: " + this.modelo);
        System.out.println("pontas " +this.ponta);
        System.out.println("carga: " + this.carga);
        
    }
    void rabiscar(){  //METODOS
     if (this.tampada == true){
         System.out.println("ERRO! nao posso rabiscar");
     } else
            System.out.println("rabiscando ");
    }
    void tampar(){
        this.tampada = true; 
        
}
    void destampar(){
        
        this.tampada=false;
        
    }
    
    }
