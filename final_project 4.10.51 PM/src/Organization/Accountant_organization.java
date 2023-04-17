/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Accountant_organization extends Organization {

    public Accountant_organization() {
        Organization.OrganizationType type = getOrganizationType();
        String accountant_type = type.getACCOUNTANT();
    }
}
