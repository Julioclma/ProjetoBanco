package banco.conta;

import banco.Banco;

public class ContaCorrente extends Conta {

    private Banco banco;

    public ContaCorrente(Banco banco) {
        super(banco);
    }

    public void transferencia(Conta conta, Double valor) {
        if (conta.banco().getCode() == this.banco().getCode() && (valor <= this.getSaldo())) {
            this.transfere(conta, valor);
        }
    }

    private void transfere(Conta conta, Double valor) {
        this.saque(valor);
        conta.deposita(valor);

    }

}
