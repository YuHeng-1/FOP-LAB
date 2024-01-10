/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author JY
 */
public class TesterL10Q1 {
    public static void main(String[] args) {
       
        PermanentStaff p=new PermanentStaff("Tan","Permanent",'A');
        ContractStaff c=new ContractStaff("Amy","Contract",3000);
        TemporaryStaff t=new TemporaryStaff("Jason","Temporary",30);
        
        // compute salary
        p.setSalary(p.computeSalary());
        c.setSalary(c.computeSalary());
        t.setSalary(t.computeSalary());
        
        p.display();
        c.display();
        t.display();
    }
}
