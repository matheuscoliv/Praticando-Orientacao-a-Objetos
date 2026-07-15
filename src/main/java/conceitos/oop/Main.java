package conceitos.oop;

import conceitos.oop.praticas.temperatura.DadosAgricultura;

public class Main {
    public static void main(String[] args) {
        /*
        //Criacao de funcionarios a partir da estrutura da classe Funcionario
        //instancia (objeto especifico para representar um elemento daquele tipo com seus respectivos valores
        // ocupando espaco diferente na memoria e guardando suas respectivas caracteristicas
        Funcionario funcionarioUm = new Funcionario();
        funcionarioUm.nome = "Matheus";
        funcionarioUm.cargo = "Estagiário";
        funcionarioUm.salario = 1100;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Mohammed";
        funcionario2.cargo = "Desenvolvedor";
        funcionario2.salario = 4000;

        funcionarioUm.exibirInformacoes();
        funcionario2.exibirInformacoes();

        funcionarioUm.reajustarSalario(50);
        funcionario2.reajustarSalario(20);

        //Atividades praticas:
        //Titulo da atividade: relatório do produto:

        Produto produto1 = new Produto();
        produto1.setNome("ps5");
        produto1.setPreco(2900.50);
        produto1.setQuantidade(30);

        Produto produto2 = new Produto();
        produto2.setNome("Iphone 15");
        produto2.setPreco(3499);
        produto2.setQuantidade(70);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

        //Titulo da atividade: imprimindo resumo do livro
        Livro livro1 = new Livro();
        livro1.setTitulo("Girl, Interrupted");
        livro1.setAutor("Susanna Keysen");
        livro1.setPaginas(270);

        livro1.exibirInformacoes();
        //Titulo da atividade: zerando o saldo
        ContaDigital conta1 = new ContaDigital();
        conta1.setSaldo(1579.42);

        conta1.exibirSaldo();
        conta1.zerarSaldo();
        conta1.exibirSaldo();
         */

        //Titulo da atividade: controle de temperatura
        DadosAgricultura dados1 = new DadosAgricultura();
        dados1.setLocal("Setor Oeste");
        dados1.setTemperatura(26);

        dados1.exibirInformacoes();
        dados1.alertar();
    }
}