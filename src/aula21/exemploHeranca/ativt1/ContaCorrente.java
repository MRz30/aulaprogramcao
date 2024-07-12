package aula21.exemploHeranca.ativt1;

public class ContaCorrente extends Conta{
    private float limite;
    public ContaCorrente(String titular, float limite, String senha){
        super(titular,senha);
        this.limite = limite;
    }
    public boolean sacar (float valor){
        if (saldo+limite>=valor){
            saldo-=valor;
            return true;

        }
        return false;
    }
    public String verifacaSaldo(){
        String retorno = String.format("Seu saldo atual é de R$.2f\n",saldo);
        if (saldo>0)
            retorno+=String.format("Seu saldo atual é de R$.2f\n",limite);
        else
            retorno+=String.format("Seu saldo atual é de R$.2f\n",limite+saldo);
        return retorno;
    }
}
