
import java.util.ArrayList;

public class Cliente {

//    public Cliente() {
//         listaClient= new ArrayList();
//    }
    
    //atributos
    private long cpfCliente,telefone;
    private double salario;
    private String profissao,email,cargo,estado,bairro,nomeCliente,endereco,cidade;
    private int numero;
     ArrayList<Cliente>listaClient;
     

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente(String nomeCliente,long cpfCliente, long telefone, String email, String endereco) {
        this.cpfCliente = cpfCliente;
        this.telefone = telefone;
        this.email = email;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        listaClient= new ArrayList();
    }

   
    
    
    //referências a objetos associados
    private Gerente gerente;//fazer relacionar com as outras classes em asociacao simples bidirecional
    //private ContaBancaria conta;
        
    //métodos
    public void atualizarSenha(){
        System.out.println("Senha atualizada com sucesso!");
    }
    
    public void cadastrarComputador(){
        System.out.println("Cadastro realizado com sucesso!");
    }
    
    public void pedirEmprestimo(){
        System.out.println("Pedido de Empréstimo!");       
        this.gerente.iniciarPedidoEmprestimo();
    } 
    
    public void pedirCartao(){
        System.out.println("Pedido de Cartão!");       
        this.gerente.iniciarPedidoCartao();
    }
    
    //métodos especiais

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public long getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(long cpf) {
        this.cpfCliente= cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    } 
}
