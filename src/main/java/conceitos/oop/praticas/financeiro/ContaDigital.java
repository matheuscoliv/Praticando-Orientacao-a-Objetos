package conceitos.oop.praticas.financeiro;

public class ContaDigital {
    private double saldo;

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void zerarSaldo() {
        saldo = 0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
