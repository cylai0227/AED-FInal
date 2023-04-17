/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurant;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class InsurantDirectory {
    private ArrayList<Insurant> insurantList;
    
    public InsurantDirectory(){
        this.insurantList = new ArrayList<>();
    }

    public ArrayList<Insurant> getInsurantList() {
        return insurantList;
    }

    public void setInsurantList(ArrayList<Insurant> insurantList) {
        this.insurantList = insurantList;
    }
    
}
