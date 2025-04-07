public class Funcionario {
    //Atributos
    String nome;
    String cargo;
    double salarioBase;
    int horasExtras;

    //Construtor
    Funcionario(String nome, String cargo, double salarioBase, int horasExtras) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    //Métodos
    public void exibirDados() {
        System.out.println("\nNome: " + this.nome );
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salarioBase);
        System.out.println("Horas Extras: " + this.horasExtras);
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
