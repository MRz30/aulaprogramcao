package aula21.exemploHeranca.ativt1;

import java.util.Scanner;

public class Banco {
    public  static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        String opc;
        System.out.println("acessando a conta " +c1.getIdentificador());
        System.out.println("bem vindo, "+c1.getTitular());
        do{
            System.out.println("Selecione uma opção");
            System.out.println("d - realizar um deposito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar o saldo");
            System.out.println("a - alterar a senha");
            System.out.println("e - sair");
            opc = leString("").toLowerCase();
            switch (opc){
                case "d"->{
                    float valor = leFloat("Qual valor deseja depositar");
                    c1.depositar(valor);
                    System.out.println("Deposito realizado!");
                }
                case "s"->{
                    float valor = leFloat("Qual o valor do saque");
                    if(c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo mais limite insuficientes");
                }
                case "v"-> System.out.println(c1.verifacaSaldo());
                case "a" ->{
                    String senha = leString("Qual a nova senha");
                    c1.setSenha(senha);
                }
            }
        }
        while (!opc.equals("e"));
        return c1;
    }
    public static ContaPoupanca acessaCP(ContaPoupanca c1){
        String opc;
        System.out.println("acessando a conta " +c1.getIdentificador());
        System.out.println("bem vindo, "+c1.getTitular());
        do{
            System.out.println("Selecione uma opção");
            System.out.println("d - realizar um deposito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar o saldo");
            System.out.println("a - alterar a senha");
            System.out.println("e - sair");
            opc = leString("").toLowerCase();
            switch (opc){
                case "d"->{
                    float valor = leFloat("Qual valor deseja depositar");
                    c1.depositar(valor);
                    System.out.println("Deposito realizado!");
                }
                case "s"->{
                    float valor = leFloat("Qual o valor do saque");
                    if(c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo mais limite insuficientes");
                }
                case "v"-> System.out.println(c1.verificaSaldo());
                case "a" ->{
                    String senha = leString("Qual a nova senha");
                    c1.setSenha(senha);
                }
            }
        }
        while (!opc.equals("e"));
        return c1;
    }
    public static  ContaCorrente cadastraCC(){
        String titular = leString("Qual o titular da conta");
        float limite = leFloat("Qual o limite inicial");
        String senha = leString("Qual a senha");
        ContaCorrente c1 = new ContaCorrente(titular, limite, senha);
        System.out.println("Conta cadastrada com identificador"+c1.getIdentificador());
        return c1;
    }

    public static  ContaPoupanca cadastraCP(){
        String titular = leString("Qual o titular da conta");
        float deposito = leFloat("Qual o valor a depositar");
        String senha = leString("Qual a senha");
        ContaPoupanca c1 = new ContaPoupanca(titular, deposito, senha);
        System.out.println("Conta cadastrada com identificador"+c1.getIdentificador());
        return c1;
    }
    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPoupanca[] listaCP = new ContaPoupanca[20];
        int contCC = 0;
        int contCP = 0;
        String opc;
        do{
            System.out.println("Selecione uma opção");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar conta poupança");
            System.out.println("e - sair");
            opc = leString("");
        }
        while (!opc.equals("e"));
    }
}
