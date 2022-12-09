
package com.mycompany.datamarketplace.backend;

import com.mycompany.datamarketplace.datamodels.Person;
import com.mycompany.datamarketplace.datamodels.community.Developer;
import com.mycompany.datamarketplace.datamodels.university.Professor;
import com.mycompany.datamarketplace.datamodels.university.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kashyabmurali
 */
public class DBUtils {
    public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/test_aed";
        final String DB_USER = "root";
        final String DB_PASSWD = "Kashyab@19";
        //final String DB_PASSWD = "Ramanujar@27";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("DB connection not success");
        }
        try
         {
            
            con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println(e);
            }
        return con;
    }
    
    public static void main(String args[]){
        try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * from test_table");
        while(resultSet.next()){
            System.out.println(resultSet.getString("test_name"));
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public Boolean insertValuesBasedOnRoles(String firstName, String lastName, String email, String password, String gender, int age, String universityName, String studentId, String employeeId, String generalId, String role, int phoneNumber) {
        Boolean isSuccess = false;
        try{
            System.out.println("In DB");
            System.out.println("Your role is" + role);
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            //String query = "INSERT INTO `test_aed`.`student` (`student_id`, `university_id`, `first_name`, `last_name`, `age`, `gender`, `phoneNumber`, `email`) VALUES ('"+studentId+"', '"+employeeId+"', '"+firstName+"', '"+lastName+"', '"+age+"', '"+gender+"', '"+email+"', '"+password+"')";
            //String query = "INSERT INTO `test_aed`.`student` (`student_id`, `university_id`, `first_name`, `last_name`, `age`, `gender`, `email`, `password`, `university_name` ) VALUES ('"+studentId+"', '"+employeeId+"', '"+firstName+"', '"+lastName+"', '"+age+"', '"+gender+"', '"+email+"', '"+password+"', '"+universityName+"')";
            String query = "INSERT INTO `test_aed`.`"+role+"` (`general_id`, `student_id`, `professor_id`, `first_name`, `last_name`, `age`, `gender`,`phoneNumber`, `email`, `password`, `university_name` ) VALUES ('"+generalId+"', '"+studentId+"', '"+employeeId+"', '"+firstName+"', '"+lastName+"', '"+age+"', '"+gender+"', '"+phoneNumber+"', '"+email+"', '"+password+"', '"+universityName+"')";
            statement.executeUpdate(query);
            isSuccess = true;
           
                  
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return isSuccess;
    }

    public Boolean checkIfEmailIsUnique(String email, String role) {
        Boolean isUnique = true;
        
        try{
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM `"+role+"` ";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                String emailId = rs.getString(email);
                if(emailId.equalsIgnoreCase(email)){
                    isUnique = false;
                }
            }
        }
        
        catch(Exception e){
            System.out.println("Error at unique check" + e);
        }
        
        return isUnique;
        }

    public Boolean checkIfIdIsUnique(String commonId, String role) {
        Boolean isUnique = true;
            if(role.equalsIgnoreCase("developer")){
                try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String query = "SELECT * FROM `"+role+"` ";
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    String idNumber = rs.getString("student_id");
                    if(idNumber.equalsIgnoreCase(commonId)){
                        isUnique = false;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
                return isUnique;
            }
            else{
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM `"+role+"` ";
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        String idNumber = rs.getString(role+"_id");
                        if(idNumber.equalsIgnoreCase(commonId)){
                            isUnique = false;
                        }
                    }
                }

                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
            }
        
        return isUnique;    
    }

    public Student checkIfStudentUserExists(String emailId, String pword, String role) {
        Student student = null;
        try {
            String mailId = "";
            String pass = "";
            
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String queryToExecute = "SELECT * FROM "+role;
            System.out.println(queryToExecute);
            
            ResultSet rs = statement.executeQuery(queryToExecute);
            
            while(rs.next()){
                mailId = rs.getString("email");
                pass = rs.getString("password");
                
                
                if (mailId.equalsIgnoreCase(emailId) && pass.equals(pword)){
                    student = new Student();
                    student.setStudentId(rs.getString("student_id"));
                    student.setFirstName(rs.getString("first_name"));
                    student.setLastName(rs.getString("last_name"));
                    student.setAge(rs.getInt("age"));
                    student.setGender(rs.getString("gender"));
                    student.setPhoneNumber(rs.getInt("phoneNumber"));
                    student.setEmail(rs.getString("email"));
                    student.setPassword(rs.getString("password"));
                    student.setUniversityName(rs.getString("university_name"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return student;
    }

    public Professor checkIfProfessorUserExists(String emailId, String pword, String role) {
        Professor professor = null;
        try {
            String mailId = "";
            String pass = "";
            
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String queryToExecute = "SELECT * FROM "+role;
            System.out.println(queryToExecute);
            
            ResultSet rs = statement.executeQuery(queryToExecute);
            
            while(rs.next()){
                mailId = rs.getString("email");
                pass = rs.getString("password");
                
                
                if (mailId.equalsIgnoreCase(emailId) && pass.equals(pword)){
                    professor = new Professor();
                    professor.setEmployeeId(rs.getString("professor_id"));
                    professor.setFirstName(rs.getString("first_name"));
                    professor.setLastName(rs.getString("last_name"));
                    professor.setAge(rs.getInt("age"));
                    professor.setGender(rs.getString("gender"));
                    professor.setPhoneNumber(rs.getInt("phoneNumber"));
                    professor.setEmail(rs.getString("email"));
                    professor.setPassword(rs.getString("password"));
                    professor.setUniversityName(rs.getString("university_name"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return professor;
    }

    public Person checkIfUserExists(String emailId, String pword, String role) {
       Person person = null;
        try {
            String mailId = "";
            String pass = "";
            
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String queryToExecute = "SELECT * FROM "+role;
            System.out.println(queryToExecute);
            
            ResultSet rs = statement.executeQuery(queryToExecute);
            
            while(rs.next()){
                mailId = rs.getString("email");
                pass = rs.getString("password");
                
                
                if (mailId.equalsIgnoreCase(emailId) && pass.equals(pword)){
                    person = new Person();
                    person.setSocialId(rs.getString("general_id"));
                    person.setFirstName(rs.getString("first_name"));
                    person.setLastName(rs.getString("last_name"));
                    person.setAge(rs.getInt("age"));
                    person.setGender(rs.getString("gender"));
                    person.setPhoneNumber(rs.getInt("phoneNumber"));
                    person.setEmail(rs.getString("email"));
                    person.setPassword(rs.getString("password"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return person; 
    }

    public Developer checkIfDeveloperUserExists(String emailId, String pword, String role) {
        Developer dev = null;
        try {
            String mailId = "";
            String pass = "";
            
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String queryToExecute = "SELECT * FROM "+role;
            System.out.println(queryToExecute);
            
            ResultSet rs = statement.executeQuery(queryToExecute);
            
            while(rs.next()){
                mailId = rs.getString("email");
                pass = rs.getString("password");
                
                if (mailId.equalsIgnoreCase(emailId) && pass.equals(pword)){
                    dev = new Developer();
                    dev.setSocialId(rs.getString("general_id"));
                    dev.setFirstName(rs.getString("first_name"));
                    dev.setLastName(rs.getString("last_name"));
                    dev.setAge(rs.getInt("age"));
                    dev.setGender(rs.getString("gender"));
                    dev.setPhoneNumber(rs.getInt("phoneNumber"));
                    dev.setEmail(rs.getString("email"));
                    dev.setPassword(rs.getString("password"));
                    dev.setCommunityName(rs.getString("university_name"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return dev; 
    }
}
