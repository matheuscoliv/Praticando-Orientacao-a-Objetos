package conceitos.herança;

import conceitos.encapsulamento.Funcionario;
import conceitos.herança.classes.Desenvolvedor;
import conceitos.herança.classes.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Mario", 15000);
        gerente.reajustarSalario();
        ((Gerente)gerente).setBonus(1000);
        gerente.exibirInformacoes();

        Funcionario dev = new Desenvolvedor("Matheus", 5000, "BackEnd");
        dev.exibirInformacoes();
        dev.reajustarSalario(5);
    }
}
