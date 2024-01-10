/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
public class ContractStaff extends Employee {

    private double sales;

    public ContractStaff(String n, String t, double s) {
        super.setEmployee(n, t);
        sales = s;
    }

    public double computeSalary() {
        return sales * 0.5 + 500;
    }
}
