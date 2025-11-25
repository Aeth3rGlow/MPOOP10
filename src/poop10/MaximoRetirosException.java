/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author aeth3rglow
 */
public class MaximoRetirosException extends Exception {

    public MaximoRetirosException() {
        super("Se ha excedido el número máximo de retiros (3)");
    }

    public MaximoRetirosException(String message) {
        super(message);
    }
}
