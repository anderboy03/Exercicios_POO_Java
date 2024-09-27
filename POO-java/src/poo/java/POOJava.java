
package poo.java;


public class POOJava {

    
    public static void main(String[] args) {
        GeladeiraP g1 = new GeladeiraP();//instanciar geladeira com atributos
        
        g1.cor = "Preta";
        g1.tamanho= 1.56f;
        g1.temperatura= 0.5f;
        g1.status();
        g1.ligar();
        g1.desligar();
        g1.gelar();
        
        
        
    }
    
}
