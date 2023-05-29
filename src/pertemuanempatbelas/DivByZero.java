package pertemuanempatbelas;

class DivByZero {

    public static void main(String args[]) {
        try {
            System.out.println(3 / 0);
            System.out.println("Please print me.");
        } catch (ArithmeticException exc) {
            //Dibagi dengan 0 -> ArithmeticException
            System.out.println(exc);
        }
        System.out.println("After exception.");
    }
}
