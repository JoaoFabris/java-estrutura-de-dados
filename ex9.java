import java.util.ArrayList;
import java.util.List;

public class ex9 {
    static class Pessoa {
        private String nome;
        private int idade;
        private String endereco;

        // Construtor
        public Pessoa(String nome, int idade, String endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        // Getters e setters
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getEndereco() {
            return endereco;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco;
        }
    }

    public static void main(String[] args) {
        List<Pessoa> clientes = new ArrayList<>();


        Pessoa cliente1 = new Pessoa("João", 30, "Rua A, 123");
        Pessoa cliente2 = new Pessoa("Maria", 25, "Rua B, 456");

        clientes.add(cliente1);
        clientes.add(cliente2);


        for (Pessoa cliente : clientes) {
            System.out.println(cliente);
        }
    }
}