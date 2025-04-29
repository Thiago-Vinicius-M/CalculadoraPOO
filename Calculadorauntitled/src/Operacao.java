public abstract class Operacao {
    public abstract double calcular(double num1, double num2);
}

class Divisao extends Operacao {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}

class Multiplicacao extends Operacao {
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}

class Subtracao extends Operacao {
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}

class Soma extends Operacao {
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
}
