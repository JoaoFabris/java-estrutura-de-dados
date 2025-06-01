//Em um sistema de segurança, números primos são utilizados como base para a criptografia. 
//Escreva um programa que encontre e exiba todos os números primos entre 1 e 100, ajudando a equipe de segurança a selecionar números para esse propósito.

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 100:");
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
