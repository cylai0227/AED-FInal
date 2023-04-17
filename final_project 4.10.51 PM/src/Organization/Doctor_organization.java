/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Doctor_organization extends Organization{
        public Doctor_organization(){
        OrganizationType type = getOrganizationType();
        String doctor_type = type.getDOCTOR();
    }
}
