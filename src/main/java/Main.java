public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1,1);
            int c = calc.devide.apply(a, b); // Данный код не работает, потому что здесь мы делим на ноль (b = 0)
            calc.println.accept(c);
        }catch (ArithmeticException e){
            System.out.println("Ошибка математического характера: " + e.getMessage());
        }

    }

}



