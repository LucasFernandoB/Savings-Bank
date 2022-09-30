
import java.util.ArrayList;


public class ClassMovimentacao {
    private float juros;
    private int dia;
    private float valor;
    private String tipo;
    private float saltoTotal;

    public float getSaltoTotal() {
        return saltoTotal;
    }

    public void setSaltoTotal(float saltoTotal) {
        this.saltoTotal = saltoTotal;
    }
     ArrayList<ClassMovimentacao>listaGe;

    public String getTipo() {
        return tipo;
    }

    public ArrayList<ClassMovimentacao> getLista() {
        return listaGe;
    }

    public void setLista(ArrayList<ClassMovimentacao> lista) {
        this.listaGe = lista;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ClassMovimentacao(String tipo,float juros,int dia, float valor,float saldoTotal) {
        this.tipo = tipo;
        this.juros = juros;
        this.dia = dia;
        this.valor = valor;
        this.saltoTotal = saldoTotal;
        listaGe= new ArrayList();
    }

    public ArrayList<ClassMovimentacao> getListaCliente() {
        return listaGe;
    }

    public void setListaCliente(ArrayList<ClassMovimentacao> lista) {
        this.listaGe= lista;
    }
    
    public ClassMovimentacao()
    {
        listaGe= new ArrayList();
    }
}
