/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class PersonProfile {
    private String name, gender, dob;

    public PersonProfile(String a, String b, String c) {
        name = a;
        gender = b;
        dob = c;
    }

    public void display() {
        System.out.println("Full Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Date of Birth :" + dob);
    }

}
