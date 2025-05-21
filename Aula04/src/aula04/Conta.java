package aula04;

public class Conta {

    // atributos 
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // construtor -> define o dono da conta 
    public Conta(String d) {
        this.dono = d;
        this.status = false;
    }

    // abre a conta recebendo o tipo e a conta recebe um número ID 
    public void abrirConta(String t) {
        // torna a conta ativa
        this.status = true;
        
        // recebe o tipo de conta a ser aberta 
        this.tipo = t;

        if (this.tipo.equals("cc")) {
            this.numConta = 141324;
            this.saldo = 100.0f;
        } else if (this.tipo.equals("cp")) {
            this.numConta = 141325;
            this.saldo = 150.0f;
        } 
    }

    // fecha a conta 
    public void fecharConta() {
        this.status = false;
        System.out.println("Conta finalizada com sucesso!");
    }

    public void sacar(float s) {
        if (this.status) {
            if (s <= this.saldo) {
                this.saldo -= s;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta não ativa!");
        }
    }

    public void depositar(float s) {
        if (this.status) {
            this.saldo += s;
        } else {
            System.out.println("Conta não ativa!");
        }
    }

    public void pagarMensalidade() {
        if (this.status) {
            if (this.tipo.equals("cc")) {
                this.saldo -= 12.00f;
            } else if (this.tipo.equals("cp")) {
                this.saldo -= 20.00f;
            }
        } else {
            System.out.println("Conta não ativa!");
        }
    }

    // status da conta
    public void dados() {
        if (this.status) {
            System.out.println("Número da conta: " + this.numConta);
            System.out.println("Tipo da conta: " + this.tipo);
            System.out.println("Dono da conta: " + this.dono);
            System.out.println("Saldo da conta: " + this.saldo);
        } else {
            System.out.println("Conta não ativa!");
        }
    }
}
