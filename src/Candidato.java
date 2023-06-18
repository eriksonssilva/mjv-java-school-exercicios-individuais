import java.util.Date;

public class Candidato {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    //private Candidato.Sexo Sexo;
    private Sexo sexo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private long telefone;
    private long celular;
    private boolean celularWhats;
    private String profissao;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    private Double pretencaoMinima;
    private Double pretencaoMaxima;
    private String habilidades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public boolean isCelularWhats() {
        return celularWhats;
    }

    public void setCelularWhats(boolean celularWhats) {
        this.celularWhats = celularWhats;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Double getPretencaoMinima() {
        return pretencaoMinima;
    }

    public void setPretencaoMinima(Double pretencaoMinima) {
        this.pretencaoMinima = pretencaoMinima;
    }

    public Double getPretencaoMaxima() {
        return pretencaoMaxima;
    }

    public void setPretencaoMaxima(Double pretencaoMaxima) {
        this.pretencaoMaxima = pretencaoMaxima;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Candidato(String nome, String cpf, Date dataNascimento, Sexo sexo,
                     String logradouro, String numero, String complemento, String bairro,
                     String cidade, String estado, String email, long telefone, long celular,
                     boolean celularWhats, String profissao, String empresa, Double salario,
                     boolean empregoAtual, Double pretencaoMinima, Double pretencaoMaxima, String habilidades) {

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhats = celularWhats;
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.pretencaoMinima = pretencaoMinima;
        this.pretencaoMaxima = pretencaoMaxima;
        this.habilidades = habilidades;

    }

}