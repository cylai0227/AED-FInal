/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Government_health_organization extends Organization {

    public Government_health_organization() {
        OrganizationType type = getOrganizationType();
        String government_health_type = type.getGOVERNMENT_HEALTH_OFFICIAL();
    }
}
