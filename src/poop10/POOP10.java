/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author aeth3rglow
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = a / b;

        System.out.println("El valor obtenido es: " + c);

        int[] arreglo = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arreglo[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            x.printStackTrace();
        }

        try {
            for (int i = 0; i <= arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            x.printStackTrace();
        }

        double x = 5;
        double y = 0;

        try {
            double w = dividir(x, y);
            System.out.println("El resultado es: " + w);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Cuenta cuenta1 = new Cuenta();
        try {
            cuenta1.depositarSaldo(20000); 
            cuenta1.consultarSaldo();
            cuenta1.retirarSaldo(500);
            cuenta1.retirarSaldo(300);
            cuenta1.retirarSaldo(300);
        } catch (SaldoInsuficienteException | MaximoRetirosException | DepositoMaximoException e) {
            System.out.println("Error en operación bancaria: " + e.getMessage());
        }

        System.out.println("--- Pruebas de Excepciones ---");

        // Prueba Deposito Maximo
        try {
            System.out.println("Intentando depositar $25,000...");
            cuenta1.depositarSaldo(25000);
        } catch (DepositoMaximoException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        // Prueba Maximo Retiros
        try {
            System.out.println("Intentando realizar 4to retiro...");
            cuenta1.retirarSaldo(100); 
        } catch (MaximoRetirosException | SaldoInsuficienteException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

    }

    public static double dividir(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("División por cero");
        }
        return x / y;
    }

}
