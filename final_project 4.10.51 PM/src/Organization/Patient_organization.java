/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Patient_organization extends Organization {

    public Patient_organization() {
        Organization.OrganizationType type = getOrganizationType();
        String admin_type = type.getPATIENT();
    }
}
