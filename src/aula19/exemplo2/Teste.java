package aula19.exemplo2;

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Aluno a1 = new Aluno();
        System.out.println("Nome: ");
        String nome = ler.next();
        System.out.println("Sobrenome: ");
        String sobrenome = ler.next();
        Aluno a1 = new Aluno(nome, sobrenome);
        System.out.println("E-mail: ");
        a1.eMail = ler.next();
        a1.codigo = new Random().nextInt(1000,10000);
        System.out.println("Aluno "+a1.nome+" cadastrado com o código "+a1.codigo);
        System.out.println("Qual a primeira nota do "+a1.nome+": ");
        a1.n1 = ler.nextFloat();
        System.out.println("Qual a segunda nota do "+a1.nome+": ");
        a1.n2 = ler.nextFloat();
        System.out.println("O aluno "+a1.nome+" tem média "+a1.calculaMedia());
        System.out.println(" e está "+a1.obterStatus());

    }
}
