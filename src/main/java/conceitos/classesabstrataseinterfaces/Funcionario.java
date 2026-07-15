package conceitos.classesabstrataseinterfaces;

public abstract class Funcionario {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    protected double salario;


    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s salario %.2f\n", nome, salario);;
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual/100);
        System.out.printf("Salario reajustado de %s para: %.2f\n", nome, salario);
    }

    public void reajustarSalario() {
        salario += 500;
        System.out.printf("Salario reajustado de %s para: %.2f\n", nome, salario);
    }

    public abstract void calcularPLR();
}

