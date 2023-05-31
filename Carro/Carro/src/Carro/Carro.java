package Carro;
public class Carro {
    String  modelo;
    String cor;
    boolean ligado;
    
    void Ligar(){
        this.ligado = true;
    }
    void Desligar(){
        this.ligado = false;
    }
    void Andar(){
        if(this.ligado == true){
            System.out.println("Estou andando");
        }else{
            System.out.println("Ligue o carro para andar");
        }
    }

   
}
