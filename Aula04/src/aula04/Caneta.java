package aula04;

public class Caneta {

    // Atributos da classe
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // Construtor
    public Caneta(String m, float p, String c, boolean t) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampada = t;
    }

    // Getters e Setters
    public String getModelo() {
        return this.modelo; 
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    // Método para exibir o status da caneta
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + (this.tampada ? "Sim" : "Não"));
    }
}
