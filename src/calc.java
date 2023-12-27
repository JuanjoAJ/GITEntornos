import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUno, numDos;
        String op;
        System.out.println("Introduzca primer número");
        numUno = scanner.nextInt();
        System.out.println("Introduzca segundo número");
        numDos = scanner.nextInt();
        System.out.println("Selecciona la operación matemática: \n\n \t+ \t\t- \t\tx \t\t/");
        op = scanner.next();


        switch (op) {
            case "+":

                System.out.printf("La suma entre %d y %d da un resultado de %d", numUno, numDos, suma(numUno, numDos));
                break;

            case "-":

                System.out.printf("La resta entre %d y %d da un resultado de %d", numUno, numDos, resta(numUno, numDos));
                break;

            case "x":
                System.out.printf("La multiplicación entre %d y %d da un resultado de %d", numUno, numDos, mult(numUno, numDos));
                break;

            case "/":
                if (numUno == 0 || numDos == 0) {
                    System.out.println("La siento la división no puede ser entre 0");
                    break;
                } else {
                    System.out.printf("La división entre %d y %d da un resultado de %.2f", numUno, numDos, div(numUno, numDos));
                    break;
                }

            default:
                System.out.println("Lo siento, esa operación aún no la tenemos contemplada");
                break;
        }
    }

    public static int suma(int nUno, int nDos){
        return nUno+nDos;
    }

    public static int resta(int n1, int n2){
        return n1-n2;
    }

    public static int mult(int n1, int n2){
        return n1*n2;
    }

    public static int div(int n1, int n2){
        return n1/n2;

    }
}