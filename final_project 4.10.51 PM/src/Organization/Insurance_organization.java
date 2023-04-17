/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Insurance_organization extends Organization {

    public Insurance_organization() {
        OrganizationType type = getOrganizationType();
        String insurance_type = type.getINSURANCE_AGENT();
    }
}
