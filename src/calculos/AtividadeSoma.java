package calculos;

import java.util.Scanner;

public class AtividadeSoma {
    public static void main(String[] args){

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o primeiro valor: ");
        int x = leitor.nextInt();

        System.out.println("Digite o segundo valor: " );
        int y = leitor.nextInt();

        int resultado = x + y;

        System.out.println("Soma: " + resultado);


    }
}
