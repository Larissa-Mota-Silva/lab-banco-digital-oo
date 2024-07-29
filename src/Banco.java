import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
        }
    }

    public void listarContas() {
        System.out.println("=== Lista de Contas ===");
        for (Conta conta : contas) {
            System.out.println(String.format("Agencia: %d, Numero: %d, Titular: %s",
                    conta.getAgencia(), conta.getNumero(), conta.getCliente().getNome()));
        }
    }
}
