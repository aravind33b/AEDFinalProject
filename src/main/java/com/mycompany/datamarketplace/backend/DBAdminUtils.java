    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.datamarketplace.backend;

    import com.mycompany.datamarketplace.datamodels.community.Community;
    import com.mycompany.datamarketplace.datamodels.community.CommunityAdmin;
    import com.mycompany.datamarketplace.datamodels.company.CompanyAdmin;
    import com.mycompany.datamarketplace.datamodels.government.GovernmentAdmin;
    import com.mycompany.datamarketplace.datamodels.company.Company;
    import com.mycompany.datamarketplace.datamodels.government.Country;
    import com.mycompany.datamarketplace.datamodels.misc.SupportAdmin;
    import com.mycompany.datamarketplace.datamodels.university.*;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.ArrayList;

    /**
     *
     * @author kashyabmurali
     */
    public class DBAdminUtils {
        public static Connection createConnection(){

            Connection con=null;
            final String DB_URL ="jdbc:mysql://localhost:3306/test_aed";
            final String DB_USER = "root";
            final String DB_PASSWD = "Kashyab@19";
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
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

        public Boolean createAdminBasedOnRoles(String companyName, String city, String country, String companyId, String officialEmail, String officialPhone, String tableName) {
            Boolean isSuccess = false;
                try{
                    System.out.println("In DB");
                    System.out.println("Your role is" + tableName);
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "INSERT INTO `test_aed`.`"+tableName+"` (`company_id`, `company_name`, `city`, `country`, `email`, `phone`) VALUES ('"+companyId+"', '"+companyName+"', '"+city+"', '"+country+"', '"+officialEmail+"', '"+officialPhone+"')";
                    statement.executeUpdate(query);
                    isSuccess = true;
                }
                catch(Exception e){
                    System.out.println(e);
                }

                return isSuccess;    
        }

        //Create a Support Admin 
        public Boolean createSupportAdmin(String firstName, String lastName, String supportEmail, String supportPass, String tableName) {
            Boolean isSuccess = false;
                try{
                    System.out.println("In DB");
                    System.out.println("Your role is");
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "INSERT INTO `test_aed`.`"+tableName+"` (`first_name`, `last_name`,`email`, `password`) VALUES ('"+firstName+"', '"+lastName+"', '"+supportEmail+"', '"+supportPass+"')";
                    statement.executeUpdate(query);
                    isSuccess = true;
                }
                catch(Exception e){
                    System.out.println(e);
                }

                return isSuccess;   
        }

        public Boolean checkIfSupportEmailIsUnique(String supportEmail, String role) {
            Boolean isUnique = true;
            try{
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM `"+role+"` ";
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                String email = rs.getString("email");
                if(supportEmail.equalsIgnoreCase(email)){
                    isUnique = false;
                    }
                }
            }
            catch(Exception e){
                System.out.println("Error at unique check" + e);
            }
            return isUnique;
        }

         public ArrayList<SupportAdmin> retrieveAllSupportAdminDetails() {
            ArrayList<SupportAdmin> companyList = new ArrayList<>();
            SupportAdmin supportAdmin = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM support_admin";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            supportAdmin = new SupportAdmin();
                            supportAdmin.setFirstName(rs.getString("first_name"));
                            supportAdmin.setLastName(rs.getString("last_name"));
                            supportAdmin.setEmail(rs.getString("email"));
                            supportAdmin.setPassword(rs.getString("password"));
                            companyList.add(supportAdmin);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;  
         }

        public SupportAdmin retrieveSupportAdminDetails(String supportEmail, String tableName) {
            SupportAdmin supportAdmin = null;
            try {
                String companyIdentity = "";

                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "SELECT * FROM support_admin";
                System.out.println(queryToExecute);

                ResultSet rs = statement.executeQuery(queryToExecute);

                while(rs.next()){
                    companyIdentity = rs.getString("email");

                    if (companyIdentity.equalsIgnoreCase(supportEmail)){
                            supportAdmin = new SupportAdmin();
                            supportAdmin.setFirstName(rs.getString("first_name"));
                            supportAdmin.setLastName(rs.getString("last_name"));
                            supportAdmin.setEmail(rs.getString("email"));
                            supportAdmin.setPassword(rs.getString("password"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return supportAdmin;
           }


        public Boolean checkIfIdIsUnique(String commonId, String role) {
            Boolean isUnique = true;
            System.out.println(role);
                if(role.equalsIgnoreCase("company") || role.equalsIgnoreCase("university")){
                    try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM `"+role+"` ";
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        String idNumber = rs.getString("company_id");
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
                else if(role.equalsIgnoreCase("country")){
                    try{
                        Connection conn = createConnection();
                        Statement statement = conn.createStatement();
                        String query = "SELECT * FROM `"+role+"` ";
                        ResultSet rs = statement.executeQuery(query);

                        while(rs.next()){
                            String ctryName = rs.getString("country_name");
                            if(ctryName.equalsIgnoreCase(commonId)){
                                isUnique = false;
                            }
                        }
                    }

                    catch(Exception e){
                        System.out.println("Error at unique check" + e);
                    }
                }
                else if(role.equalsIgnoreCase("developer_community")){
                    try{
                        Connection conn = createConnection();
                        Statement statement = conn.createStatement();
                        String query = "SELECT * FROM `"+role+"` ";
                        ResultSet rs = statement.executeQuery(query);

                        while(rs.next()){
                            String ctryName = rs.getString("country_name");
                            if(ctryName.equalsIgnoreCase(commonId)){
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

        public Company retrieveCompanyDetails(String companyId, String tableName) {
            Company company = null;
            try {
                String companyIdentity = "";

                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "SELECT * FROM "+tableName;
                System.out.println(queryToExecute);

                ResultSet rs = statement.executeQuery(queryToExecute);

                while(rs.next()){
                    companyIdentity = rs.getString("company_id");

                    if (companyIdentity.equalsIgnoreCase(companyId)){
                        company = new Company();
                        company.setCompanyId(rs.getString("company_id"));
                        company.setCompanyName(rs.getString("company_name"));
                        company.setCity(rs.getString("city"));
                        company.setCountry(rs.getString("country"));
                        company.setOfficialEmail(rs.getString("email"));
                        company.setOfficialPhone(rs.getString("phone"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return company;
        }

        public ArrayList<Company> retrieveAllCompanyDetails() {
            ArrayList<Company> companyList = new ArrayList<>();
            Company company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM COMPANY";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new Company();
                            company.setCompanyId(rs.getString("company_id"));
                            company.setCompanyName(rs.getString("company_name"));
                            company.setCity(rs.getString("city"));
                            company.setCountry(rs.getString("country"));
                            company.setOfficialEmail(rs.getString("email"));
                            company.setOfficialPhone(rs.getString("phone"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;    
        }

        public void deleteCompany(String companyIdToBeDeleted) {
        try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "DELETE from company where company_id ='"+companyIdToBeDeleted+"'";
                statement.execute(queryToExecute);
                System.out.println(queryToExecute);

            } catch (Exception e) {
                System.out.println(e);
            }    
        }

        public void deleteSupportAdmin(String email) {
            try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "DELETE from support_admin where email ='"+email+"'";
                statement.execute(queryToExecute);
                System.out.println(queryToExecute);

            } catch (Exception e) {
                System.out.println(e);
            } 
        }

        public ArrayList<University> retrieveAllUniversityDetails() {
            ArrayList<University> companyList = new ArrayList<>();
            University company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM UNIVERSITY";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new University();
                            company.setUniversityId(rs.getString("company_id"));
                            company.setUniversityName(rs.getString("company_name"));
                            company.setCity(rs.getString("city"));
                            company.setCountry(rs.getString("country"));
                            company.setOfficialEmail(rs.getString("email"));
                            company.setOfficialPhone(rs.getString("phone"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;    
        }

        public University retrieveUniversityDetails(String companyId, String tableName) {
            University company = null;
            try {
                String companyIdentity = "";

                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "SELECT * FROM "+tableName;
                System.out.println(queryToExecute);

                ResultSet rs = statement.executeQuery(queryToExecute);

                while(rs.next()){
                    companyIdentity = rs.getString("company_id");

                    if (companyIdentity.equalsIgnoreCase(companyId)){
                        company = new University();
                        company.setUniversityId(rs.getString("company_id"));
                        company.setUniversityName(rs.getString("company_name"));
                        company.setCity(rs.getString("city"));
                        company.setCountry(rs.getString("country"));
                        company.setOfficialEmail(rs.getString("email"));
                        company.setOfficialPhone(rs.getString("phone"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return company;
        }

        public void deleteUniversity(String companyIdToBeDeleted) {
            try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "DELETE from university where company_id ='"+companyIdToBeDeleted+"'";
                statement.execute(queryToExecute);
                System.out.println(queryToExecute);

            } catch (Exception e) {
                System.out.println(e);
            }    
        }

        public Boolean createCountryForGovt(String countryNameForGovt, String tableName) {
            Boolean isSuccess = false;
                try{
                    System.out.println("In DB");
                    System.out.println("Your role is" + tableName);
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "INSERT INTO `test_aed`.`"+tableName+"` (`country_name`) VALUES ('"+countryNameForGovt+"')";
                    statement.executeUpdate(query);
                    isSuccess = true;
                }
                catch(Exception e){
                    System.out.println(e);
                }

                return isSuccess;    
        }

        public ArrayList<Country> retrieveAllCountryDetails() {
            ArrayList<Country> companyList = new ArrayList<>();
            Country company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM COUNTRY";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new Country();
                            company.setCountryName(rs.getString("country_name"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;  
        }

        public Country retrieveCountryDetails(String countryNameForGovt, String tableName) {
            Country company = null;
            try {
                String companyIdentity = "";

                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "SELECT * FROM "+tableName;
                System.out.println(queryToExecute);

                ResultSet rs = statement.executeQuery(queryToExecute);

                while(rs.next()){
                    companyIdentity = rs.getString("country_name");

                    if (companyIdentity.equalsIgnoreCase(countryNameForGovt)){
                        company = new Country();
                        company.setCountryName(rs.getString("country_name"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return company;
        }

        public void deleteCountry(String companyIdToBeDeleted) {
            try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "DELETE from country where country_name ='"+companyIdToBeDeleted+"'";
                statement.execute(queryToExecute);
                System.out.println(queryToExecute);

            } catch (Exception e) {
                System.out.println(e);
            } 
        }

        public ArrayList<Community> retrieveAllDeveloperCommunity() {
            ArrayList<Community> companyList = new ArrayList<>();
            Community company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM DEVELOPER_COMMUNITY";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new Community();
                            company.setCommunityName(rs.getString("community_name"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;
        }

        public Boolean createCommunity(String countryNameForGovt, String tableName) {
            Boolean isSuccess = false;
                try{
                    System.out.println("In DB");
                    System.out.println("Your role is" + tableName);
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "INSERT INTO `test_aed`.`"+tableName+"` (`community_name`) VALUES ('"+countryNameForGovt+"')";
                    statement.executeUpdate(query);
                    isSuccess = true;
                }
                catch(Exception e){
                    System.out.println(e);
                }

            return isSuccess;
        }

        public Community retrieveCommunityDetails(String countryNameForGovt, String tableName) {
            Community company = null;
            try {
                String companyIdentity = "";

                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "SELECT * FROM "+tableName;
                System.out.println(queryToExecute);

                ResultSet rs = statement.executeQuery(queryToExecute);

                while(rs.next()){
                    companyIdentity = rs.getString("community_name");

                    if (companyIdentity.equalsIgnoreCase(countryNameForGovt)){
                        company = new Community();
                        company.setCommunityName(rs.getString("community_name"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return company;
        }

        public void deleteCommunity(String companyIdToBeDeleted) {
             try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String queryToExecute = "DELETE from developer_community where community_name ='"+companyIdToBeDeleted+"'";
                statement.execute(queryToExecute);
                System.out.println(queryToExecute);

            } catch (Exception e) {
                System.out.println(e);
            } 
        }

        public Boolean checkIfInstituionExists(String institution, String parentTable) {
            Boolean isUnique = false;
            if(parentTable.equalsIgnoreCase("university")){
                try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String query = "SELECT * FROM `"+parentTable+"` where company_name ='"+institution+"'";
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    String email = rs.getString("company_name");
                    if(institution.equalsIgnoreCase(email)){
                        isUnique = true;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
            }
            
            else if(parentTable.equalsIgnoreCase("company")){
                try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String query = "SELECT * FROM `"+parentTable+"` where company_name ='"+institution+"'";
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    String email = rs.getString("company_name");
                    if(institution.equalsIgnoreCase(email)){
                        isUnique = true;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
            }
            
            else if(parentTable.equalsIgnoreCase("developer_community")){
                try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String query = "SELECT * FROM `"+parentTable+"` where community_name ='"+institution+"'";
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    String email = rs.getString("community_name");
                    if(institution.equalsIgnoreCase(email)){
                        isUnique = true;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
            }
            
            else if(parentTable.equalsIgnoreCase("country")){
                try{
                Connection conn = createConnection();
                Statement statement = conn.createStatement();
                String query = "SELECT * FROM `"+parentTable+"` where country_name ='"+institution+"'";
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    String email = rs.getString("country_name");
                    if(institution.equalsIgnoreCase(email)){
                        isUnique = true;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at unique check" + e);
                }
            }
            
            return isUnique;
            }
        
        public CommunityAdmin checkIfCommAdminRoleExists(String email, String pass, String parentTable) {
            CommunityAdmin commAdminObj = null;
                try{
                    
                    String mailId = "";
                    String passwrd = "";

                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM "+parentTable+" where email = '"+email+"' and password = '"+pass+"'";
                    System.out.println(query);
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        mailId = rs.getString("email");
                        passwrd = rs.getString("password");
                        
                        if(email.equalsIgnoreCase(mailId) && passwrd.equalsIgnoreCase(pass)){

                            commAdminObj = new CommunityAdmin();
                            commAdminObj.setEmail(rs.getString("email"));
                            commAdminObj.setPassword(rs.getString("password"));
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at data check" + e);
                }
                
            return commAdminObj;
            }
        
        public CompanyAdmin checkIfCompAdminRoleExists(String email, String pass, String parentTable) {
            CompanyAdmin compAdminObj = null;
                try{
                    
                    String mailId = "";
                    String passwrd = "";

                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM "+parentTable+" where email = '"+email+"' and password = '"+pass+"'";
                    System.out.println(query);
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        mailId = rs.getString("email");
                        passwrd = rs.getString("password");
                        
                        if(email.equalsIgnoreCase(mailId) && passwrd.equalsIgnoreCase(pass)){

                            compAdminObj = new CompanyAdmin();
                            compAdminObj.setEmail(rs.getString("email"));
                            compAdminObj.setPassword(rs.getString("password"));
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at data check" + e);
                }
                
            return compAdminObj;
            }
        
        public GovernmentAdmin checkIfGovtAdminRoleExists(String email, String pass, String parentTable) {
            GovernmentAdmin govtAdminObj = null;
                try{
                    
                    String mailId = "";
                    String passwrd = "";

                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM "+parentTable+" where email = '"+email+"' and password = '"+pass+"'";
                    System.out.println(query);
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        mailId = rs.getString("email");
                        passwrd = rs.getString("password");
                        
                        if(email.equalsIgnoreCase(mailId) && passwrd.equalsIgnoreCase(pass)){

                            govtAdminObj = new GovernmentAdmin();
                            govtAdminObj.setEmail(rs.getString("email"));
                            govtAdminObj.setPassword(rs.getString("password"));
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at data check" + e);
                }
                
            return govtAdminObj;
            }

        public UniversityAdmin checkIfUniAdminRoleExists(String email, String pass, String parentTable) {
            UniversityAdmin uniAdminObj = null;
                try{
                    
                    String mailId = "";
                    String passwrd = "";

                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM "+parentTable+" where email = '"+email+"' and password = '"+pass+"'";
                    System.out.println(query);
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        mailId = rs.getString("email");
                        passwrd = rs.getString("password");
                        
                        if(email.equalsIgnoreCase(mailId) && passwrd.equalsIgnoreCase(pass)){

                            uniAdminObj = new UniversityAdmin();
                            uniAdminObj.setEmail(rs.getString("email"));
                            uniAdminObj.setPassword(rs.getString("password"));
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at data check" + e);
                }
                
            return uniAdminObj;
            }
        
        public SupportAdmin checkIfSupportAdminRoleExists(String email, String pass, String parentTable) {
            SupportAdmin supportAdminObj = null;
                try{
                    
                    String mailId = "";
                    String passwrd = "";

                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "SELECT * FROM "+parentTable+" where email = '"+email+"' and password = '"+pass+"'";
                    System.out.println(query);
                    ResultSet rs = statement.executeQuery(query);

                    while(rs.next()){
                        mailId = rs.getString("email");
                        passwrd = rs.getString("password");
                        
                        if(email.equalsIgnoreCase(mailId) && passwrd.equalsIgnoreCase(pass)){

                            supportAdminObj = new SupportAdmin();
                            supportAdminObj.setEmail(rs.getString("email"));
                            supportAdminObj.setPassword(rs.getString("password"));
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Error at data check" + e);
                }
                
            return supportAdminObj;
            }
        
        public Boolean createDifferentAdminRoles(String adminEmail, String adminPass, String institution, String tableName, String parentTable) {
             Boolean isSuccess = false;
             
               try{
                    System.out.println("In DB");
                    System.out.println("Your role is" + tableName);
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String query = "INSERT INTO `test_aed`.`"+tableName+"` (`email`, `password`, `institution_name`) VALUES ('"+adminEmail+"', '"+adminPass+"', '"+institution+"')";
                    statement.executeUpdate(query);
                    isSuccess = true;
                }
                catch(Exception e){
                    System.out.println(e);
                }  
            return isSuccess;
        }





    }
