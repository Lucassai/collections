package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        int procurarNumero;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        /*
        Seria para criar os 10 números em ordem.
        for(int i=1 ; i<=10 ; i++){
            numeros.add(i);
        }*/

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para ser encontrado na lista: ");
        procurarNumero = leia.nextInt();
        if (numeros.contains(procurarNumero)){
            System.out.println("O número foi encontrado!");
            System.out.println("O número "+procurarNumero+" está localizado na posição "+ numeros.indexOf(procurarNumero)+"!");
        }
        else {
            System.out.println("O número não foi encontrado!");
        }
    }
}
