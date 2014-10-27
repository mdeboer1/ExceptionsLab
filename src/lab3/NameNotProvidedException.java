/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author mdeboer1
 */
public class NameNotProvidedException extends ArrayIndexOutOfBoundsException {
    private static String message = "You must provide a first and last name!";

    public NameNotProvidedException() {
        super(message);
    }

    public NameNotProvidedException(String s) {
        super(message);
    }
    
    public static void setMessage(String message){
        NameNotProvidedException.message = message;
    }    
}
