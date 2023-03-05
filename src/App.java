/**
 * @author
 * @version
 * @deprecated
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Comentário de Linha
        /*
         * Comentário de Bloco
         */
        int sala = 3;
        float salario = 2500.50f;
        char letra = (char)'g'; // Typecast
        boolean aprovado = false;

        int sal = (int)salario;

        Integer numero = new Integer(15);
        Float bonus = new Float(500.50);
        String nome = new String();
        Boolean presente = new Boolean(true);

        Scanner Teclado = new Scanner(System.in);


        System.out.println("Hello Word!");
        System.out.print("Não Pula Linha?\n");
        System.out.println("Não Pulou Linha.");
        System.out.printf("Print Formatado %d\n", sal);

        System.out.println("Digite o seu Nome: ");
        nome = Teclado.nextLine(); //Next Line só recebe String
        /*
         * teclado.nextInt(); // Recebe um inteiro
         * teclado.nextFloat(); //Recebe um Float
         * teclado.nextBoolean(); // Recebe um Booleano no formato true ou false
         */
        
        System.out.println("O nome é: " + nome);

        int a = 5;
        int b = 3;

        int c = a + b;
        Scanner Entrada = new Scanner(System.in);

        System.out.println(c);
        a = Entrada.nextInt();
        if(a > 4){
            System.out.println("A é maior que 4");
        } else {
            System.out.println("A é menor que 4");
        }

        switch(a){
            case 4:
                System.out.println("A é 4");
            break;
            case 3:
                System.out.println("A é 3");
            break;
            default:
                System.out.println("A não é 3 nem 4");
            break;
        }

        System.out.println((a ==3)? "A é igual a 3": "A não é igual a 3");
        
        int i = 0;
        boolean r = true;

        // while(i < 5) {
        //     System.out.println("I é igual do que: " + i);
        //     i++;
        //     r = Entrada.nextBoolean();
        // } do {
        //     System.out.println("I é igual a: " + i);
        //     i--;
        // }while(i > 0); 

        for(int j = 0; j < 5; j++) {
            if(j == 2) break;
            System.out.println("J é igual " + j);
        }

        int[] vet = {2,5,3,5,6,7};

        System.out.println(vet[2]);
        
        for(int v: vet){
            System.out.println("O vetor é: " + v);
        }

        
        Teclado.close();
        Entrada.close();
    }
}
