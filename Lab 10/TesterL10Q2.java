/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
public class TesterL10Q2 {

    public static void main(String[] args) {
        SubstitutionCipher a = new SubstitutionCipher("data.txt", "cipher.txt", 6);
        SubstitutionCipher b = new SubstitutionCipher("cipher.txt", "newplain.txt", 6);
        a.encoding();
        b.decoding();
    }

}
