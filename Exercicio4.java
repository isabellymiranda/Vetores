/**
Crie uma classe que leia um vetor inteiro de 5 posições:
Após ler o vetor, mostre a quantidade de números ímpares.
Após ler o vetor, mostre a quantidade de números pares.
 */
import java.util.Random;
public class Exercicio4 {
    public static void main(String[] args) {
        // Nuemeros aleatórios
        Random random = new Random();
        int numero []= {random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)};

        for (int index = 0; index < numero.length; index++){
            if(numero[index]%2==0){ 
            System.out.println("Pares :");
            System.out.println(numero[index]);
        } 
        else{
            System.out.println("Impares :");
        System.out.println(numero[index]);
         } 
       }
    }         
}

              
            

