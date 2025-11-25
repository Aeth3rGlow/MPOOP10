/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author aeth3rglow
 */
public class DepositoMaximoException extends Exception {

    public DepositoMaximoException() {
        super("Monto excede el límite de $20,000");
    }

    public DepositoMaximoException(String message) {
        super(message);
    }
}
