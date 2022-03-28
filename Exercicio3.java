// Crie uma classe com um vetor com todos os meses do anos
// Use for para mostrar o segundo semestre
// Use for para mostrar os meses do primeiro semestre
public class Exercicio3 {
    public static void main(String[] args) {
        String meses[]={"Janeiro", "fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        System.out.println("Primeiro Semestre");
        for (int i = 0; i<(meses.length)/2; i++){
            System.out.println(meses[i]);
        }
        System.out.println("Segundo Semestre");
        for (int i = 6; i<(meses.length); i++){
            System.out.println(meses[i]);
       }
    }
    
}