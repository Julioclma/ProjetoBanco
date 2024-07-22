package banco;

public abstract class Banco {

    private int code;
    private int conta;
    public Banco(int code, int conta){
        this.code = code;
        this.conta = conta;
    }

    public int getCode(){
        return this.code;
    }
    public int getConta(){
        return this.conta;
    }


}
