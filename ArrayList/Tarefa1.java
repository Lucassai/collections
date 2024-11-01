package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {

        List<String> cores = new ArrayList<>();
        Scanner leia= new Scanner(System.in);
        System.out.println("Escolha 5 cores");

        while(cores.size()<5){
            System.out.println("Digite a "+(cores.size()+1) +"º cor");
        cores.add(leia.next());
        }
        System.out.println(cores);
        cores.sort(null);
        System.out.println(cores);
    }
}
