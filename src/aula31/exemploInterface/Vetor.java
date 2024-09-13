package aula31.exemploInterface;

/**
 * Classe que representa uma lista de elementos
 * @author mathe
 * @version 1
 * @since 1
 */
public class Vetor  implements Lista {
    private  String[] elementos;
    private  int tamanho;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Metodo que permite adicionar um elemento no final da lista
     * @param elemento elemento que sera adicionado
     */
    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    /**
     * Metodo que remove o ultimo elemento da lista
     * @return elemento que foi removido
     */
    @Override
    public String remove() {
        if(tamanho>0) {
            return elementos[--tamanho];
        }
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        String resultado = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                resultado += elementos[i] + ", ";
            }
            resultado += elementos[tamanho - 1];

        }
        resultado += "]";
        return resultado;
    }
}
