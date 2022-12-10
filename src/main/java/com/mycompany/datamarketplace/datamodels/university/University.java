
package com.mycompany.datamarketplace.datamodels.university;

import com.mycompany.datamarketplace.datamodels.AdditionalDetails;

/**
 *
 * @author kashyabmurali
 */
public class University extends AdditionalDetails{
    String universityName;
    String universityId;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
    
    @Override
    public String toString(){
        return universityName;
    }
}
