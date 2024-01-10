/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
public class PermanentStaff extends Employee {

    private char category;

    public PermanentStaff(String n, String t, char c) {
        super.setEmployee(n, t);
        category = c;
    }

    public double computeSalary() {
        if (category == 'A') {
            return 4000;
        } else if (category == 'B') {
            return 3000;
        } else {
            return 2000;
        }
    }
}
