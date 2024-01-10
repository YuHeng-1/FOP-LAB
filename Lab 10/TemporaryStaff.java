/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
public class TemporaryStaff extends Employee {

    private double hour;

    public TemporaryStaff(String n, String t, double h) {
        super.setEmployee(n, t);
        hour = h;
    }

    public double computeSalary() {
        return hour * 15;
    }
}
