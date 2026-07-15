package conceitos.encapsulamento;

public class Funcionario {
    private String nome;

    private String cargo;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    private double salario;


    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s salario %.2f\n", nome, cargo, salario);;
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual/100);
        System.out.printf("Salario reajustado de %s para: %.2f\n", nome, salario);
    }
}
