public class Exercicio1{
    public static void main(String[] args){
        String produto[] = new String[10];
        produto[0]= "Amendoim";
        produto[1]= "Cana de açúcar";
        produto[2]= "Soja";
        produto[3]= "Café";
        produto[4]= "Carne";
        produto[5]= "Arroz";
        produto[6]= "Trigo";
        produto[7]= "Gasolina";
        produto[8]= "Milho";
        produto[9]= "Algodão";

        int estoque[] =new int[10];
        estoque[0]=100;
        estoque[1]=5000;
        estoque[2]=60;
        estoque[3]=20;
        estoque[4]=15;
        estoque[5]=60;
        estoque[6]=100;
        estoque[7]=7;
        estoque[8]=60;
        estoque[9]=100;


        for(int index = 0; index < produto.length; index++){
            System.out.println("O produto "+ produto[index]+" tem + "+ estoque[index]+ " unidades em estoque.");

        }

    }
}