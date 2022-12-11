/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamarketplace.datamodels.company;

import com.mycompany.datamarketplace.datamodels.Person;

/**
 *
 * @author kashyabmurali
 */
public class CompanyAdmin extends Person{
    String companyId;
    Person person;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
