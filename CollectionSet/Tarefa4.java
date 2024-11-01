package CollectionSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tarefa4 {
    public static void main(String[] args) {
        int procurarNumero;
        Set<Integer> numeros = new HashSet<>();
        Scanner leia = new Scanner(System.in);
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
        System.out.println("Digite um número para ver se existe na lista: ");
        procurarNumero = leia.nextInt();
        if (numeros.contains(procurarNumero)){
            System.out.println("O número foi encontrado");
        }
        else{
            System.out.println("O número não foi encontrado! ");
        }
    }

}
