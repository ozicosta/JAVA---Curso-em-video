package aula02;
public class App {
    public static void main(String[] args) throws Exception {
       Caneta caneta1 = new Caneta();
       caneta1.cor = "Azul";
       caneta1.modelo = "Bic";
       caneta1.ponta = 0.5f;
       caneta1.Tampar();
       caneta1.Rabiscar();
    // caneta1.Status();
    }
}
