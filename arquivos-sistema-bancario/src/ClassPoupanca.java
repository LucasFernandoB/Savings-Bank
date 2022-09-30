
public class ClassPoupanca extends ContaBancaria{
    private float depositoMensal;
    private int diaDeposito;
    private float valorInicialDepositado;

    public float getDepositoMensal() {
        return depositoMensal;
    }

    public void setDepositoMensal(float depositoMensal) {
        this.depositoMensal = depositoMensal;
    }

    public int getDiaDeposito() {
        return diaDeposito;
    }

    public void setDiaDeposito(int diaDeposito) {
        this.diaDeposito = diaDeposito;
    }

    public float getValorInicialDepositado() {
        return valorInicialDepositado;
    }

    public void setValorInicialDepositado(float valorInicialDepositado) {
        this.valorInicialDepositado = valorInicialDepositado;
    }
    
}
