public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("__________________________________________");
        System.out.println("| ****----Extrato Conta Corrente----**** |");
        System.out.println("__________________________________________");
        System.out.println("O que a gente pode fazer por você");
        System.out.println("hoje, " + this.cliente.getNome() +"?");
        System.out.println("-----------------------------------------");
        imprimirDadosCliente();
        System.out.println("-----------------------------------------");
        imprimirInfosComuns();
        System.out.println(String.format("Saldo anterior: R$ %.2f", this.saldo));
        System.out.println(String.format("Desconto do empréstimo: - R$ %.2f", this.cliente.getValorEmprestimos()));
        System.out.println(String.format("Saldo atual: R$ %.2f", (this.saldo - this.cliente.getValorEmprestimos())));
        System.out.println("-----------------------------------------");
        imprimirDataSistema();
        System.out.println("-----------------------------------------");
        imprimirAgradecimentos();
        System.out.println("-------------~~~~~~~~~~~~~~~~-------------");
    }
}
