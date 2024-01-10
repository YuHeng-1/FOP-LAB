/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author JY
 */
public class SubstitutionCipher implements MessageEncoder {

    private String inputFile, outputFile;
    private int shift;

    public SubstitutionCipher(String in, String out, int s) {
        inputFile = in;
        outputFile = out;
        shift = s;
    }

    public void encoding() {
        String cipher;
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            Scanner in = new Scanner(new FileInputStream(inputFile));
            while (in.hasNextLine()) {
                cipher = encode(in.nextLine());
                out.println(cipher);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public void decoding() {
        String plain;
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            Scanner in = new Scanner(new FileInputStream(inputFile));
            while (in.hasNextLine()) {
                plain = decode(in.nextLine());
                out.println(plain);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public String encode(String s) {
        String temp = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = (char) ((int) s.charAt(i) + shift);
            temp += Character.toString(c);
        }
        return temp;
    }

    public String decode(String s) {
        String temp = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = (char) ((int) s.charAt(i) - shift);
            temp += Character.toString(c);
        }
        return temp;
    }
}
