/**
Crie uma classe que leia essas informações em 3 vetores
Após ler, mostre os produtos EX: ”10317485 – Saca de Soja – R$ 189,99”
Após Exibir os produtos, acrescente R$ 20,00 no preço dos produtos que o preço for maior que R$ 120,00
Mostre Todos os produtos novamente.
 */
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo[]=new int[5];
        String nome[]=new String[5];
        double preco []=new double[5];
        for(int i = 0; i < preco.length; i++){
            System.out.println("Digite o Código do produto");
            codigo[i]=sc.nextInt();
            System.out.println("Digite o Nome do produto");
            nome[i]=sc.next();
            System.out.println("Digite o Preço do produto");
            preco[i]=sc.nextDouble();
        }
        for(int i = 0;i < preco.length;i++) {
            System.out.println("Código:" +codigo[i]);
            System.out.println("Nome:" +nome[i]);
            if (preco[i]>120){
                System.out.println("Preço:" +(preco[i]+20));
            }
            else {
             System.out.println("Preço:" +preco[i]);
                }
        
        }
        sc.close();
    }
}
