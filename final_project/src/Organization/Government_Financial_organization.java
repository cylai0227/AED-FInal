/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

/**
 *
 * @author whh
 */
public class Government_Financial_organization extends Organization {

    public Government_Financial_organization() {
        OrganizationType type = getOrganizationType();
        String government_financial_type = type.getGOVERNMENT_FINANCIAL_OFFICIAL();
    }
}
