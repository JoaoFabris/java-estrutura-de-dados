//Desenvolva um sistema completo de gerenciamento de estoque para uma loja. Permita que o usuário adicione, remova e 
//atualize itens no estoque, usando classes para representar os produtos e listas para organizar os itens cadastrados. Esse sistema ajudará na administração dos produtos disponíveis para venda.


import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    int codigo;
    String nome;
    double preco;
    int quantidade;
    
    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}

public class ex10 {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        estoque.add(new Produto(1, "Camiseta", 29.90, 50));
        estoque.add(new Produto(2, "Calça", 89.90, 30));
        
        int opcao = 0;
        do {
            System.out.println("\n=== GERENCIAMENTO DE ESTOQUE ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Preço: R$");
                    double preco = scanner.nextDouble();
                    
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    
                    estoque.add(new Produto(codigo, nome, preco, quantidade));
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                    
                case 2:
                    System.out.print("Digite o código do produto a remover: ");
                    int codigoRemover = scanner.nextInt();
                    
                    boolean removido = false;
                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).codigo == codigoRemover) {
                            estoque.remove(i);
                            removido = true;
                            break;
                        }
                    }
                    
                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Digite o código do produto a atualizar: ");
                    int codigoAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    
                    Produto produtoParaAtualizar = null;
                    for (Produto p : estoque) {
                        if (p.codigo == codigoAtualizar) {
                            produtoParaAtualizar = p;
                            break;
                        }
                    }
                    
                    if (produtoParaAtualizar != null) {
                        System.out.print("Novo nome: ");
                        produtoParaAtualizar.nome = scanner.nextLine();
                        
                        System.out.print("Novo preço: R$");
                        produtoParaAtualizar.preco = scanner.nextDouble();
                        
                        System.out.print("Nova quantidade: ");
                        produtoParaAtualizar.quantidade = scanner.nextInt();
                        
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n=== PRODUTOS EM ESTOQUE ===");
                    if (estoque.isEmpty()) {
                        System.out.println("Não há produtos no estoque.");
                    } else {
                        for (Produto p : estoque) {
                            System.out.println(p);
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 5);
        
        scanner.close();
    }
}