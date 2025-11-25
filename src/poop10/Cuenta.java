/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author aeth3rglow
 */
public class Cuenta {
    private double saldo;
    private int numRetiros = 0;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println(getSaldo());
    }

    public void depositarSaldo(double monto) throws DepositoMaximoException {
        if (monto > 20000) {
            throw new DepositoMaximoException();
        }
        saldo += monto;
        System.out.println("Depositando: " + monto);
        System.out.println("Saldo actual: " + saldo);
    }

    public void retirarSaldo(double monto) throws SaldoInsuficienteException, MaximoRetirosException {
        if (numRetiros >= 3) {
            throw new MaximoRetirosException();
        }
        if (saldo < monto) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= monto;
            numRetiros++;
            System.out.println("Retirando: " + monto);
            System.out.println("Saldo actual: " + saldo);
        }
    }

}
