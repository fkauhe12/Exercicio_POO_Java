public class Departamento {
    String nome;
    int codigo;

    // Construtor
    Departamento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
    }
}
