import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            // Entrada de dados
            System.out.println("Cadastro de Funcionario\n");
            System.out.print("Digite o nome do funcionario: ");
            String nome = ler.nextLine();
            System.out.print("Digite o cargo do funcionario: ");
            String cargo = ler.nextLine();
            System.out.print("Digite o salario base do funcionario: ");
            double salarioBase = ler.nextDouble();
            System.out.print("Digite o numero de horas extras do funcionario: ");
            int horasExtras = ler.nextInt();

            // Criando departamentos
            Departamento dep1 = new Departamento("Recursos Humanos", 101);
            Departamento dep2 = new Departamento("Financeiro", 102);
            Departamento dep3 = new Departamento("TI", 103);

            // Criando funcionários com departamentos
            Funcionario f1 = new Funcionario(nome, cargo, salarioBase, horasExtras, dep1);
            Funcionario f2 = new Funcionario("Maria", "Gerente", 5000, 10, dep2);
            Funcionario f3 = new Funcionario("Joao", "Analista", 3000, 5, dep3);

            // Exibindo dados dos funcionários
            f1.exibirDados();
            f1.calcularSalario();
            f1.reajustarSalario(10);
            f1.registrarHorasExtras(5);
            f1.exibirDados();

            f2.exibirDados();
            f2.calcularSalario();
            f2.reajustarSalario(15);
            f2.registrarHorasExtras(3);
            f2.exibirDados();

            f3.exibirDados();
            f3.calcularSalario();
            f3.reajustarSalario(20);
            f3.registrarHorasExtras(2);
            f3.exibirDados();
        }
    }
}
