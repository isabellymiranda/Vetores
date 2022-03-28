//Importe o Pacote Scanner
import java.util.Scanner;
//Declare a Classe e Inicie o Corpo
public class Exercicio2 {
/** Crie uma Classe que leia:
 um Numero Inteiro "n"
 Leia o nome dos Funcionários em um vetor "funcionario" com o tamanho n.
 Imprima o nome dos funcionários
 *  */ 
    public static void main(String[] args) {
        //Crie um objeto chamado sc para receber dados do usuário via teclado
        Scanner sc=new Scanner (System.in);
        int n = 5;
        String funcionario[]=new String[n];
        //estrutura de repeticção para nome de cada valor do vetor "n"
        for(int index = 0; index< funcionario.length;index++){
            System.out.println("Digite o nome do Funcionário :");
            //adicionar nomes que foram digitados 
            funcionario[index]=sc.next();
        }
        for(int index = 0; index< funcionario.length;index++){
            System.out.println(funcionario[index]);
        }
        sc.close();


    }
    
}
