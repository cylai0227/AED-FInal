/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Admin_organization extends Organization{
    public Admin_organization(){
        OrganizationType type = getOrganizationType();
        String admin_type = type.getADMIN();
    }
}
