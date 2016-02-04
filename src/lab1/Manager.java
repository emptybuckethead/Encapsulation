/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chad Cochrane
 */
public class Manager {
    private Employee employee;
 
        public void newEmployee(String firstName, String lastName, String ssn){
            Employee employee = new Employee();
            employee.firstName = "Peter";
            employee.getLastName() = "Piper";
            employee.ssn = "333-1234";
        }
        
        public void getEmployeeStatus(){
            return employee.getStatus();
        }

}
