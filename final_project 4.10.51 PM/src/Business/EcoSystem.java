/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import NetWorkSystem.NetWorkSystem;
import Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class EcoSystem extends Organization{
    public static EcoSystem ecoSystem;
    private ArrayList<NetWorkSystem> networkSystem;
    
        static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
            return ecoSystem;
        }
        return ecoSystem;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public ArrayList<NetWorkSystem> getNetworkSystem() {
        return networkSystem;
    }

    public void setNetworkSystem(ArrayList<NetWorkSystem> networkSystem) {
        this.networkSystem = networkSystem;
    }

}
