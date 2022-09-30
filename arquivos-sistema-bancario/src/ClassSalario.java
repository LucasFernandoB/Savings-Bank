
public class ClassSalario extends ContaBancaria {
    private String proprietario;
    private int inicio;
    private float valorSalario;
    private int diaPagamento;
    private String profissao;

    public String getProprietario() {
        return proprietario;
    }

    public ClassSalario(String proprietario, int inicio, float valorSalario, int diaPagamento, String profissao) {
        this.proprietario = proprietario;
        this.inicio = inicio;
        this.valorSalario = valorSalario;
        this.diaPagamento = diaPagamento;
        this.profissao = profissao;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public float getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(float valorSalario) {
        this.valorSalario = valorSalario;
    }

    public int getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(int diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
}
