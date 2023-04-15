/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Account.AccountDirectory;
import Employee.EmployeeDirectory;
import Job.Job;

/**
 *
 * @author whh
 */
public class Organization {

    private String organizationName;
    private int organizationId;
    private Job job;
    private AccountDirectory accountDirectory;
    private EmployeeDirectory employeeDirectory;
    private static int count = 0;

    public Organization() {
        this.organizationId = this.count++;
        this.organizationName = organizationName;
        this.job = new Job();
        this.accountDirectory = new AccountDirectory();
        this.employeeDirectory = new EmployeeDirectory();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    public OrganizationType getOrganizationType() {
        return new OrganizationType();
    }

    public class OrganizationType{

        public static final String ADMIN = "Admin Organization";
        public static final String DOCTOR = "Doctor Organization";
        public static final String PATIENT = "Patient Organization";
        public static final String ACCOUNTANT = "Accountant Organization";
        public static final String INSURANCE_AGENT = "Insurance Agent Organization";
        public static final String GOVERNMENT_FINANCIAL_OFFICIAL = "Government Financial Official Organization";
        public static final String GOVERNMENT_HEALTH_OFFICIAL = "Government Health Official Organization";
        public static final String PHARMACY_MANAGER = "Phmarmacy Manager Organization";

        public static String getADMIN() {
            return ADMIN;
        }

        public static String getDOCTOR() {
            return DOCTOR;
        }

        public static String getPATIENT() {
            return PATIENT;
        }

        public static String getACCOUNTANT() {
            return ACCOUNTANT;
        }

        public static String getINSURANCE_AGENT() {
            return INSURANCE_AGENT;
        }

        public static String getGOVERNMENT_FINANCIAL_OFFICIAL() {
            return GOVERNMENT_FINANCIAL_OFFICIAL;
        }

        public static String getGOVERNMENT_HEALTH_OFFICIAL() {
            return GOVERNMENT_HEALTH_OFFICIAL;
        }

        public static String getPHARMACY_MANAGER() {
            return PHARMACY_MANAGER;
        }

    }
}
