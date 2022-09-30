
import java.util.ArrayList;
import java.util.Scanner;


public class Gerente {
    
    //atributos
    private String nome;
    private String funcao;
    private String salario;
    private int cod;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    private long cpf;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    //referências aos objetos associados
    private Cliente[] cliente;
    ArrayList<Cliente>listaCliente;

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    public Gerente()
    {
        listaCliente= new ArrayList();
    }
    
    public Gerente( int codigo, long cpf , String nome, String funcao ,String salario)
    {
       this.nome= nome;
       this.cpf= cpf;
       this.funcao= funcao;
       this.codigo= codigo;
       this.salario= salario;
       listaCliente= new ArrayList();
    }
    //métodos
    public void iniciarPedidoEmprestimo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pedido de empréstimo solicitado!");
      
        System.out.println("Deseja liberar emprestimo? 1-sim, 2-não");
        int op = entrada.nextInt();
        if (op == 1){
            //gerente libera emprestimo
            this.liberarEmprestimo();
        }else{
            System.out.println("Emprestimo não autorizado!");
        }
    }
   // public void inserir
    
    public void iniciarPedidoCartao(){
        System.out.println("Pedido de cartão solicitado!");
    }
    
    private void liberarEmprestimo(){
        System.out.println("Empréstimo liberado!");
    }
    
    private void liberarCartao(){
        System.out.println("Cartão liberado!");
    }
    
    //métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Cliente[] getClientes() {
        return cliente;
    }

    public void setClientes(Cliente[] clientes) {
        this.cliente = clientes;
    }
    
    public void excluir(int codigo)
    {
        System.out.println("Cliente excluido");
        
    }

    
}
