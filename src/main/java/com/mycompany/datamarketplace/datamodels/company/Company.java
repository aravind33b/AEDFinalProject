/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamarketplace.datamodels.company;

import com.mycompany.datamarketplace.datamodels.AdditionalDetails;

/**
 *
 * @author kashyabmurali
 */
public class Company extends AdditionalDetails {
    
    String companyName;
    String companyId;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Override
    public String toString(){
        return companyName;
    }
    
    
    
}
