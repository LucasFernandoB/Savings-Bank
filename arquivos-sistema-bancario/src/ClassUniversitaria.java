
public class ClassUniversitaria extends ContaBancaria{
    private int diaDeposito;
    private String faculdade;
    private String proprietario;
    private int dia,mes,ano;

    public ClassUniversitaria(int diaDeposito, String faculdade, String proprietario, int dia, int mes, int ano) {
        this.diaDeposito = diaDeposito;
        this.faculdade = faculdade;
        this.proprietario = proprietario;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    

    public int getDiaDeposito() {
        return diaDeposito;
    }

    public void setDiaDeposito(int diaDeposito) {
        this.diaDeposito = diaDeposito;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
    
    
}
