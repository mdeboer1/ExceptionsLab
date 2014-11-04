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
public class NameNotProvidedException extends IllegalArgumentException {
    private static final String MESSAGE = "You must provide a first and last name!";

    public NameNotProvidedException() {
        super(MESSAGE);
    }

    public NameNotProvidedException(String s) {
        super(MESSAGE);
    }
    
    //Add other constructors to match the IllegalArgumentClass, all must be 
    //provided for!  Missing one with string and throwable and one with just
    // throwable
    
    public NameNotProvidedException(String s, Throwable cause) {
        super(MESSAGE, cause);
    }

    public NameNotProvidedException(Throwable cause) {
        super(cause);
    }
    
//    public static void setMessage(String MESSAGE){
//        NameNotProvidedException.MESSAGE = MESSAGE;
//    }    
}
