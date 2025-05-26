//Você é responsável por calcular o desempenho dos alunos em uma avaliação. 
//Crie uma matriz (array) com as notas dos alunos em uma prova e encontre a maior nota da turma, exibindo-a ao final.

public class ex5 {
    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.5, 92.0, 88.5}; // array of student grades
        int highestIndex = 0; // variable to hold the index of the highest grade
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("The highest grade in the class is: " + grades[highestIndex]); // print the highest grade
    }
}
