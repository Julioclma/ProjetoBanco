package banco.conta;

import banco.Banco;

public abstract class Conta implements ContaInterface {
    private Double saldo = 0.0;
    private Banco banco;

    public Conta(Banco banco) {
        this.banco = banco;
    }

    public Banco banco() {
        return this.banco;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    @Override
    public void deposita(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void saque(Double valor) {
        if (!(this.saldo < valor)) {
            this.saldo -= valor;
            return;
        }
        new Throwable("Erro ao realizar saque");
    }


}
