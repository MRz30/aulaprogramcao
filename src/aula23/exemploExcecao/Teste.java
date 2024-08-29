package aula23.exemploExcecao;

public class Teste {
    public static void main(String[] args) {
        Exemplo2 e1 = new Exemplo2();
        try{
            e1.divide(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Não foi possivel dividir");
        }
    }
}
