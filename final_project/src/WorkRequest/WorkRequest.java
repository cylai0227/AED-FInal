/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Account.Account;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public abstract class WorkRequest {
    static int workId;
    private String message;
    private Account sender;
    private Account receiver;
    private ArrayList<WorkDetail> workDetail;
    
    public WorkRequest(){
        workId++;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.workDetail = new ArrayList<>();
    }

    public ArrayList<WorkDetail> getWorkDetail() {
        return workDetail;
    }

    public void setWorkDetail(ArrayList<WorkDetail> workDetail) {
        this.workDetail = workDetail;
    }

    public static int getWorkId() {
        return workId;
    }

    public static void setWorkId(int workId) {
        WorkRequest.workId = workId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(workId);
    }
}
