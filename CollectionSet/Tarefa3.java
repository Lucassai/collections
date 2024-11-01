package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.O programa deverá
// solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na
// Collection Set. Em seguida, faça o que se pede:

public class Tarefa3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();
        //Entrada de dados do usuário:
        System.out.println("Digite 10 números não repetidos");
        while(numeros.size()<10){
            System.out.println("Digite o "+(numeros.size()+1)+"º número");
            numeros.add(leia.nextInt());
        }
        System.out.println(numeros);
        Iterator<Integer> iNumeros = numeros.iterator();


       for (int i = 0 ; i>10 ; i++ ){
            
        }
    }
}
