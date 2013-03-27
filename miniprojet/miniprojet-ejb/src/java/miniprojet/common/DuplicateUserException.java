/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet.common;

/**
 *
 * @author Phantom
 */
public class DuplicateUserException extends Exception {
    
    public DuplicateUserException() {
    }
    
    public DuplicateUserException(String message) {
        super(message);
    }
    
}
