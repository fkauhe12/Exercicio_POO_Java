public class Funcionario {
    //Atributos
    String nome;
    String cargo;
    double salarioBase;
    int horasExtras;
    Departamento departamento; 
    

    //Construtor
    Funcionario(String nome, String cargo, double salarioBase, int horasExtras, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.departamento = departamento;
    }
    //Métodos
    public void exibirDados() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salarioBase);
        System.out.println("Horas Extras: " + this.horasExtras);
        if (departamento != null) {
            System.out.println("Departamento:");
            departamento.exibirInfo(); // Exibe informações do departamento
        } else {
            System.out.println("Departamento: Não atribuído");
        }
    }

    public double calcularSalario() {
        salarioBase += (horasExtras * 50);
        System.out.println("Salario com horas extras: " + salarioBase);
        return salarioBase;
    }

    public void reajustarSalario(double percentual) {
        salarioBase += (salarioBase * percentual / 100);
        System.out.println("Salario reajustado: " + salarioBase);
    }
    
    public void registrarHorasExtras(int horas) {
        this.horasExtras += horas;
        System.out.println("Horas extras registradas: " + this.horasExtras);
    }
}
