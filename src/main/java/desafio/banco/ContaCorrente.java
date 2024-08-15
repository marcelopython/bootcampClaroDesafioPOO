package desafio.banco;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato conta corrente ======");
        this.infosComuns();
    }
}
