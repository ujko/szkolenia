package day3.generic;

import java.math.BigDecimal;

public class Calculator<T extends Number> {
    private Number result;
    private Number number;

    public Calculator(T number) {
        this.number = number;
    }

    public T add(T number2) {
        if (number instanceof Integer) {
            result = number.intValue() + number2.intValue();
            System.out.println("Instancja Integer");
        }
        if (number instanceof Double) {
            result = number.doubleValue() + number2.doubleValue();
            System.out.println("Instancja Double");
        }
        if (number instanceof BigDecimal) {
            BigDecimal a = (BigDecimal) number;
            BigDecimal b = (BigDecimal) number2;
            result = a.add(b);
            System.out.println("Instancja BigDecimal");
        }
        return (T) result;
    }

    public Number subtract(Number number2) {
        if (number instanceof Integer) {
            result = number.intValue() - number2.intValue();
            System.out.println("Instancja Integer");
        }
        if (number instanceof Double) {
            result = number.doubleValue() - number2.doubleValue();
            System.out.println("Instancja Double");
        }
        if (number instanceof BigDecimal) {
            BigDecimal a = (BigDecimal) number;
            BigDecimal b = (BigDecimal) number2;
            result = a.subtract(b);
            System.out.println("Instancja BigDecimal");
        }
        return (T) result;
    }
}
