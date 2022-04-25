import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int menorNumero = 0;
        int maiorNumero = 0;
        int somaTotal = 0;
        int somaPar =0;

        Scanner texto = new Scanner(System.in);
        int[] intArray = new int[10];

        System.out.println("Digite 10 numeros inteiros para a formação do programa!");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Digite o " + (i+1) + " número da array:");
            intArray[i] = texto.nextInt();

            if (i == 0){
                maiorNumero = i;
                menorNumero = i;
            }

            if (intArray[i] < menorNumero){
                menorNumero = intArray[i];
            } else if (intArray[i] > maiorNumero) {
                maiorNumero = intArray[i];
            }

            if (intArray[i] % 2 == 0) {
                somaPar += intArray[i];
            }
        }

        for (int i = 0; i < intArray.length; i++){
            somaTotal += intArray[i];
        }



        System.out.println("O menor valor da Array é de: " + menorNumero);
        System.out.println("O maior valor da Array é de: " + maiorNumero);
        System.out.println("A soma total da Array é de: " + somaTotal);
        System.out.println("A soma total dos números pares da Array é de: " + somaPar);


        texto.close();

    }
}