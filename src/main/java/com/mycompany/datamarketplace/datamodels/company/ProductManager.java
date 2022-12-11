
package com.mycompany.datamarketplace.datamodels.company;

import com.mycompany.datamarketplace.datamodels.Person;

public class ProductManager extends Person {
    Person person;
    String companyId;
    String companyName;
    String employeeId;
    

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
     @Override
    public String toString(){
        return employeeId;
    }
    
}
