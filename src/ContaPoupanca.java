public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("__________________________________________");
        System.out.println("| #####----Extrato Conta Poupança----#### |");
        System.out.println("__________________________________________");
        System.out.println("O que a gente pode fazer por você");
        System.out.println("hoje " + this.cliente.getNome() +"?");
        System.out.println("-----------------------------------------");
        imprimirDadosCliente();
        System.out.println("-----------------------------------------");
        imprimirInfosComuns();
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println("-----------------------------------------");
        imprimirDataSistema();
        System.out.println("-----------------------------------------");
        imprimirAgradecimentos();
        System.out.println("-------------~~~~~~~~~~~~~~~~-------------");
    }
}
