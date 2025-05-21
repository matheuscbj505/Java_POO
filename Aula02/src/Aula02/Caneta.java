package Aula02;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status () {
        
        System.out.println ("Uma caneta " + this.cor);
        System.out.println ("Modelo " + this.modelo);
        System.out.println ("Ponta " + this.ponta);
        System.out.println ("Carga " + this.carga);
        System.out.println ("Está tampada? " + this.tampada);

    }

    public void rabiscar () {
        if (tampada == true) {
            System.out.println ("Nao posso rabiscar");
        } else {
            System.out.println ("Estou rabiscando");
        }
    }

    protected void tampar () {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;
    }

}
