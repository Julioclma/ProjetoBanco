import banco.BancoDoBrasil;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente(new BancoDoBrasil(1, 1));
        ContaCorrente contaCorrente2 = new ContaCorrente(new BancoDoBrasil(1, 2));

        System.out.println(contaCorrente1.getSaldo());
        contaCorrente1.deposita(200.0);
        System.out.println(contaCorrente1.getSaldo());
        contaCorrente1.saque(180.0);
        System.out.println("Conta 1 saldo:"+contaCorrente1.getSaldo());
        contaCorrente1.transferencia(contaCorrente2, 20.0);

        System.out.println("conta corrente 1 - saldo:"+contaCorrente1.getSaldo());
        System.out.println("conta corrente 2 - saldo:"+contaCorrente2.getSaldo());


        ContaPoupanca contaPoupanca = new ContaPoupanca(new BancoDoBrasil(1, 3));

    }
}