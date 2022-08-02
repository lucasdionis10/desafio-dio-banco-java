import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Cliente lucas = new Cliente();

        lucas.setNome("Lucas Dionísio Machado Martins");
        lucas.setIdade(18);
        lucas.setCpf(1234567899);
        lucas.setRg(987654321);
        lucas.setAnoDeCadastro(2018);
        lucas.setEmail("desafio@dio.com.br");
        lucas.setTelefone(999999999);
        lucas.setCEP(123456789);
        lucas.setCidade("Acapulco");
        lucas.setUF("SP");
        lucas.setRua("Rua da Mudança de Carreira");
        lucas.setNumeroResidencia(0);
        lucas.setFonteDeRenda("Dev Santander");
        lucas.setRendaMediaMensal(10000);
        lucas.setValorEmprestimos(5000);
        lucas.setScore(900);


        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(lucas);

        cc.saldo = 300;

        cc.imprimirExtrato();
        //cp.imprimirExtrato();
        //cc.imprimirDadosCadastro();

    }
}
