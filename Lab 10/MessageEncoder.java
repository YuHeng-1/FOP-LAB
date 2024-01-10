/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
// interface - a class that declare abstract methods (methods without a body) and constants.
public interface MessageEncoder {
    String encode(String plainText);
    String decode(String cipherText);
}
