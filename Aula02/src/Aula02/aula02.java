package Aula02;

public class aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
       //c1.ponta = 0.5; -> nao permitido, atributo privado 
        c1.carga = 50; 
        c1.tampar ();
        c1.destampar();
        c1.status();
    } 
}
