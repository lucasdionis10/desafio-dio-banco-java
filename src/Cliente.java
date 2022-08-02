import java.util.PrimitiveIterator;

public class Cliente {
    private String nome;
    private int anoDeCadastro;
    private int idade;
    private long cpf;
    private long rg;
    private long telefone;
    private String email;
    private String cidade;
    private String UF;

    private long CEP;
    private String rua;
    private int numeroResidencia;
    private String fonteDeRenda;
    private double rendaMediaMensal;
    private double score;
    private double valorEmprestimos;


    public String getNome() {
        return nome;
    }

    public int getAnoDeCadastro() {
        return anoDeCadastro;
    }

    public void setAnoDeCadastro(int anoDeCadastro) {
        this.anoDeCadastro = anoDeCadastro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getFonteDeRenda() {
        return fonteDeRenda;
    }

    public void setFonteDeRenda(String fonteDeRenda) {
        this.fonteDeRenda = fonteDeRenda;
    }

    public double getRendaMediaMensal() {
        return rendaMediaMensal;
    }

    public void setRendaMediaMensal(double rendaMediaMensal) {
        this.rendaMediaMensal = rendaMediaMensal;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getValorEmprestimos() {
        return valorEmprestimos;
    }

    public void setValorEmprestimos(double valorEmprestimos) {
        this.valorEmprestimos = valorEmprestimos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
