public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
    }
    //collaboator 1
    public static int subtract(int a, int b) {
    return a - b;
}
//collaborator 2
public static int multiply(int a, int b) {
    return a * b;
}
//collaborator 3
public static int divide(int a, int b) {
    return a / b;
}
// collaborator 4
public static int modulo(int a, int b) {
    return a % b;
}


}
