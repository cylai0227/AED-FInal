/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import Employee.Employee;
import Patient.Patient;
import Role.Role;
import WorkRequest.WorkQueue;
import WorkRequest.WorkRequest;

/**
 *
 * @author whh
 */
public class Account {
    private String username;
    private String password;
    private Employee employee;
    private Patient customer;
    private WorkQueue job;
    private Role role;

    public Account() {
        this.job = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Patient getCustomer() {
        return customer;
    }

    public void setCustomer(Patient customer) {
        this.customer = customer;
    }

    public WorkQueue getJob() {
        return job;
    }

    public void setJob(WorkQueue job) {
        this.job = job;
    }



    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }

}
