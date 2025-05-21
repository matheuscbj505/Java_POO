package Aula02;

public class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    int km_rodados;
    boolean vendido;

    void status () {
        System.out.println ("O carro da marca " + this.marca);
        System.out.println ("Modelo " + this.modelo);
        System.out.println ("Ano " + this.ano); 
        System.out.println ("Cor " + this.cor);
        System.out.println ("Km rodados " + this.km_rodados);
    }

    void vendido () {
        if (vendido == true) {
            System.out.println ("O carro já está vendido");          
        } else {
            System.out.println ("O carro está a venda");
        }
    }
}
