
package com.mycompany.datamarketplace.datamodels.university;

import com.mycompany.datamarketplace.datamodels.Person;

public class Student extends Person{

    String studentId;
    String universityName;
    Person person;
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
