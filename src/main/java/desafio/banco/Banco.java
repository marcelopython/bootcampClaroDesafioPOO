package desafio.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String name;
    private List<IConta> contas = new ArrayList<>();

    public Banco(String name) {
        this.name = name;
    }

    public void getContas() {
        System.out.println(contas);
    }

    public void imprimirClientes() {
        for (IConta conta : this.contas) {
            System.out.println(conta.getClient().getNome());
        }
    }

    public void setConta(IConta conta) {
        this.contas.add(conta);
    }


}
