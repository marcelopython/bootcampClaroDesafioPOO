public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 2;

    private Cliente client;


    public Conta(Cliente client) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void infosComuns() {
        System.out.println("Cliente: "+ this.client.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", client=" + client +
                '}';
    }
}
