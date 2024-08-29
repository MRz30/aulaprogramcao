package aula19.exemplo1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual o nome: ");
        p1.nome = ler.next();
        System.out.println("Qual o sobrenome "+p1.nome+": ");
        p1.sobrenome = ler.next();
        System.out.println("Qual a idade do/a "+p1.nome+": ");
        p1.idade = ler.nextInt();
        System.out.println("Qual a altura do/a "+p1.nome+": ");
        p1.altura = ler.nextInt();
        System.out.println(p1.obterDados());
    }
}
