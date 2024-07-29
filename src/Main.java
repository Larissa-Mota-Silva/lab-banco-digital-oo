public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        
        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton);
        
        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        banco.adicionarCliente(venilton);
        banco.adicionarCliente(maria);

        banco.adicionarConta(ccVenilton);
        banco.adicionarConta(poupancaVenilton);
        banco.adicionarConta(ccMaria);
        banco.adicionarConta(poupancaMaria);

        ccVenilton.depositar(100);
        ccVenilton.transferir(50, poupancaVenilton);

        ccMaria.depositar(200);
        ccMaria.transferir(100, poupancaMaria);

        banco.listarClientes();
        banco.listarContas();

        ccVenilton.imprimirExtrato();
        poupancaVenilton.imprimirExtrato();
        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
    }
}
