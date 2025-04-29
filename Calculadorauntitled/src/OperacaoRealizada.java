public class OperacaoRealizada {
    private String expressao;
    private double resultado;

    public OperacaoRealizada(String expressao, double resultado) {
        this.expressao = expressao;
        this.resultado = resultado;
    }

    public String getExpressao() {
        return expressao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
