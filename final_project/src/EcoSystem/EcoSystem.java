/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem;

import NetWorkSystem.NetWorkSystem;
import Organization.Organization;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class EcoSystem extends Organization{
  private static EcoSystem instance;
  private ArrayList<NetWorkSystem> networkSystems;

  private EcoSystem() {
    super(null);
    networkSystems = new ArrayList<>();
  }

  public static synchronized EcoSystem getInstance() {
    if (instance == null) {
      instance = new EcoSystem();
    }
    return instance;
  }

  public ArrayList<NetWorkSystem> getNetworkSystems() {
    return networkSystems;
  }

  public void setNetworkSystems(ArrayList<NetWorkSystem> networkSystems) {
    this.networkSystems = networkSystems;
  }
  
  public NetWorkSystem createAndAddSystem() {
    NetWorkSystem ns = new NetWorkSystem();
    networkSystems.add(ns);
    return ns;
  }
  
  @Override
  public ArrayList<Role> getSupportedRole(){
      ArrayList<Role> roles = new ArrayList<>();
      roles.add(new SysAdmin());
      return roles;
  }

  
  public boolean checkUniqueUser(String username) {
    boolean isUnique = this.getUserAccountDirectory().checkUniqueUsername(username);
    return !isUnique;
  }
}
