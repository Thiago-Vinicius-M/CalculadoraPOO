public class Calculadora {

    public double calcular(String expressao) {
        expressao = tratarEntrada(expressao);

        if (expressao.contains("+")) {
            return executarOperacao(expressao, new Soma(), "\\+");
        } else if (expressao.contains("-")) {
            return executarOperacao(expressao, new Subtracao(), "-");
        } else if (expressao.contains("*")) {
            return executarOperacao(expressao, new Multiplicacao(), "\\*");
        } else if (expressao.contains("/")) {
            return executarOperacao(expressao, new Divisao(), "/");
        } else {
            throw new IllegalArgumentException("Operação inválida.");
        }
    }

    public String tratarEntrada(String expressao) {
        return expressao.replace(" ", "").replace(",", ".");
    }

    private double executarOperacao(String expressao, Operacao operacao, String operadorRegex) {
        String[] partes = expressao.split(operadorRegex);

        if (partes.length != 2) {
            throw new IllegalArgumentException("Expressão inválida. Use o formato: número operador número");
        }

        double num1 = Double.parseDouble(partes[0]);
        double num2 = Double.parseDouble(partes[1]);
        return operacao.calcular(num1, num2);
    }
}
