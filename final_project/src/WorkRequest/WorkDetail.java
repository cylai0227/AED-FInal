/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

/**
 *
 * @author whh
 */
public class WorkDetail {
    private double workPrice;
    private double workNum;
    private String workType;
    
    public WorkDetail(){
        this.workPrice = workPrice;
        this.workNum = workNum;
        this.workType = workType;
    }

    public double getWorkPrice() {
        return workPrice;
    }

    public void setWorkPrice(double workPrice) {
        this.workPrice = workPrice;
    }

    public double getWorkNum() {
        return workNum;
    }

    public void setWorkNum(double workNum) {
        this.workNum = workNum;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
    
}
