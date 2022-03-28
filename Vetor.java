import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor{
    public static void main(String[] args){
        List<String> produtos = new ArrayList<>();
        List<Integer> estoque = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Produtos novos para estoque:");

        for(int i = 0; i < 10; i++){
            System.out.print(i+1 + "º Produto: ");
            produtos.add(input.nextLine());
            System.out.print("N - Estoque: ");
            estoque.add(input.nextInt());

            input.nextLine();
            
            System.out.println("");
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Produtos com estoque maior que 10:");

        for(int i = 0; i < 10; i++){
            if(estoque.get(i) >= 10){
                System.out.println("O estoque de " + produtos.get(i) + " é : " + estoque.get(i));
            }
        }
        input.close();
    }
}