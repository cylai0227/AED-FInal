/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class AccountDirectory {
    private ArrayList<Account> AccountList;
    
    public AccountDirectory(){
        AccountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return AccountList;
    }

    public void setAccountList(ArrayList<Account> AccountList) {
        this.AccountList = AccountList;
    }
    
    public boolean UsernameUniques(String username){
        for(Account a : this.getAccountList()){
            if(a.getUsername() == username){
                return false;
            }
        }
        return true;
    }
}
