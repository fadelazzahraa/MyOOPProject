package pertemuanempatbelas;

class MultipleCatch {

    public static void main(String args[]) {
        try {
            int den = Integer.parseInt(args[0]);
            System.out.println(3 / den);
        } catch (ArithmeticException exc) {
            System.out.println("Divisor was 0.");
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Missing argument.");
        }
        System.out.println("After exception.");
    }
}
