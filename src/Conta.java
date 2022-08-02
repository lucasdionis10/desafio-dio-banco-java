import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;


    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero ));
    }

    protected void imprimirDadosCliente(){
      System.out.println(String.format("Titular: %s", this.cliente.getNome()));
      System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
      System.out.println(String.format("RG: %s", this.cliente.getRg()));
    }

    protected void imprimirDadosCadastro() {
        System.out.println("*****************************************************");

        System.out.println("__________________________________________");
        System.out.println("| #####----Dados Cadastrais----#### |");
        System.out.println("__________________________________________");

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("RG: %s", this.cliente.getRg()));
        System.out.println(String.format("Telefone: %d", this.cliente.getTelefone()));
        System.out.println(String.format("E-mail: %s", this.cliente.getEmail()));
        System.out.println(String.format("Ano de Cadastro: %d", this.cliente.getAnoDeCadastro()));
        System.out.println(String.format("Idade: %d", this.cliente.getIdade()));
        System.out.println("---------------------------------------------------");
        System.out.println(String.format("Cidade: %s", this.cliente.getCidade()));
        System.out.println(String.format("Estado: %s", this.cliente.getUF()));
        System.out.println(String.format("CEP: %d", this.cliente.getCEP()));
        System.out.println(String.format("Rua: %s", this.cliente.getRua()));
        System.out.println(String.format("Número: %d", this.cliente.getNumeroResidencia()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(String.format("Fonte de renda: %s", this.cliente.getFonteDeRenda()));
        System.out.println(String.format("Renda média mensal: R$ %.2f", this.cliente.getRendaMediaMensal()));
        System.out.println(String.format("Score: %s", this.cliente.getScore()));
        System.out.println(String.format("Valor de empréstimos a pagar: R$ %.2f", this.cliente.getValorEmprestimos()));
        System.out.println("*****************************************************");
        System.out.println("-----------------------------------------");
        imprimirDataSistema();
        System.out.println("-------------~~~~~~~~~~~~~~~~-------------");

    }

    protected void imprimirDataSistema(){
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println(dtf2.format(LocalDateTime.now()));
    }

    protected void imprimirAgradecimentos(){
        System.out.println("Muito obrigado pela preferência ");
        System.out.println(this.cliente.getNome() + "!!");
        System.out.println("Conte sempre conosco!!");
    }

}
