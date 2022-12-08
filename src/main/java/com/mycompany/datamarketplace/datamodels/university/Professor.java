
package com.mycompany.datamarketplace.datamodels.university;

import com.mycompany.datamarketplace.datamodels.Person;

public class Professor extends Person {
    String employeeId;
    String universityName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    
    
}
