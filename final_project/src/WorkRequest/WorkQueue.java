/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class WorkQueue {
    ArrayList<WorkRequest> workList;
    
    public WorkQueue(){
        this.workList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkList() {
        return workList;
    }

    public void setWorkList(ArrayList<WorkRequest> workList) {
        this.workList = workList;
    }
        
}
