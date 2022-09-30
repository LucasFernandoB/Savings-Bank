//package sistemabancario;
public class ContaBancaria {
    
    //atributos
    private String proprietario;
    private String dataCriacao;
    
    public void depositar(){
       
    }   
    public void sacar(){
        
    }
    
    public void emprestimo(){
        
    }
    public void movimentacao(){
        
    }
     
     public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    } 
    public void pedirCartao(){
        System.out.println("Cartao foi pedido ao gerente");
    }
    public void excluirConta(){
        System.out.println("SUA CONTA SERA EXLUIDA");
    }
    public void consultarConta(){
        System.out.println("Sua conta sera pesquizada");
    }
}
