public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(22, 10));
        System.out.println(intsCalc.mult(10, 23));
        System.out.println(intsCalc.div(36, 5.25));
        System.out.println(intsCalc.pow(2, 10));
    }
}