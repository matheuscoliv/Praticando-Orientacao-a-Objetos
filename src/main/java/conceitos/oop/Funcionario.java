package conceitos.oop;

public class Funcionario {
    String nome;

    String cargo;

    double salario;


    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s salario %.2f\n", nome, cargo, salario);;
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual/100);
        System.out.printf("Salario reajustado de %s para: %.2f\n", nome, salario);
    }
}
