import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> Mulheres = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome (ou 'sair' para encerrar ):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println(("digite o sexo (M/F)"));
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                Mulheres.add(nome);
            } else {
                System.out.println("opeção ivalida");
            }
        }
        scanner.close();

        System.out.println("\nLista de Homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }
        System.out.println("\nLista de Mulheres:");
        for (String mulher : Mulheres) {
            System.out.println(mulher);
        }
    }
}