package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void Status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada? " + this.tampada);

    }
    void Rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso rabiscar com a caneta tampada!!");
        }else {
            System.out.println("RABISCANDO");
        }

    }
    void Tampar(){
        this.tampada = true;
        
    }
    void Destampar(){
        this.tampada = false;
    }
    
}
