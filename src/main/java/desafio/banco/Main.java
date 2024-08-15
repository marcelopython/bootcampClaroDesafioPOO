package desafio.banco;

public class Main {

    public static void main(String[] args) {

        Cliente client = new Cliente();
        client.setNome("Marcelo silva");

        IConta  cc = new ContaCorrente(client);
        IConta poupanca = new ContaPoupanca(client);

        Banco banco = new Banco("Itau");
        banco.setConta(cc);
        banco.setConta(poupanca);

        banco.getContas();
        banco.imprimirClientes();

        cc.depositar(30D);
        cc.imprimirExtrato();

        cc.transferir(5D, poupanca);
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}
