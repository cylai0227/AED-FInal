/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Pharmacy_organization extends Organization{
        public Pharmacy_organization(){
        OrganizationType type = getOrganizationType();
        String pharmacy_type = type.getPHARMACY_MANAGER();
    }
}
