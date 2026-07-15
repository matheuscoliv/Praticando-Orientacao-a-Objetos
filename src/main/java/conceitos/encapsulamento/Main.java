package conceitos.encapsulamento;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Joao", 8500);
        funcionario1.exibirInformacoes();
        funcionario1.setCargo("Gerente");
        funcionario1.exibirInformacoes();
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getCargo());
        System.out.println(funcionario1.getSalario());
    }
}
