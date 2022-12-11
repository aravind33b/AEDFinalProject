/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamarketplace.backend;

import static com.mycompany.datamarketplace.backend.DBAdminUtils.createConnection;
import static com.mycompany.datamarketplace.backend.DBUtils.createConnection;
import com.mycompany.datamarketplace.datamodels.Person;
import com.mycompany.datamarketplace.datamodels.community.Community;
import com.mycompany.datamarketplace.datamodels.community.Developer;
import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyQuestions;
import com.mycompany.datamarketplace.datamodels.feature.survey.SurveyResponses;
import com.mycompany.datamarketplace.datamodels.university.Professor;
import com.mycompany.datamarketplace.datamodels.university.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kashyabmurali
 */
public class DBFeaturesUtils {
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
        ResultSet resultSet=statement.executeQuery("SELECT * from test_table");
        while(resultSet.next()){
            System.out.println(resultSet.getString("test_name"));
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public Boolean createSurvey(String surveyTitle, String surveyQuestion1, String surveyQuestion2, String surveyQuestion3, String surveyQuestion4, String surveyQuestion5, String owner) {
        Boolean isSuccess = false;
        try{
            System.out.println("In Survey Creation DB");
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String query = "INSERT INTO `test_aed`.`survey_questions` (`email`, `q1`, `q2`, `q3`, `q4`, `q5`, `survey_title`) VALUES ('"+owner+"', '"+surveyQuestion1+"', '"+surveyQuestion2+"', '"+surveyQuestion3+"', '"+surveyQuestion4+"', '"+surveyQuestion5+"', '"+surveyTitle+"')";
            statement.executeUpdate(query);
            isSuccess = true;
            System.out.print(query);
 
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return isSuccess;
    }

    public ArrayList<SurveyQuestions> retrieveAllSurveyList() {
        ArrayList<SurveyQuestions> companyList = new ArrayList<>();
            SurveyQuestions company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM survey_questions";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new SurveyQuestions();
                            company.setSurveyTitle(rs.getString("survey_title"));
                            company.setQuestion1(rs.getString("q1"));
                            company.setQuestion2(rs.getString("q2"));
                            company.setQuestion3(rs.getString("q3"));
                            company.setQuestion4(rs.getString("q4"));
                            company.setQuestion5(rs.getString("q5"));
                            company.setOwner(rs.getString("email"));
                            company.setSurveyId(rs.getInt("survey_id"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;
    }

    public Boolean createAnswer(int surveyId, String answerGiver, String answer1, String answer2, String answer3, String answer4, String answer5) {
        Boolean isSuccess = false;
        try{
            System.out.println("In Answer Creation DB");
            Connection conn = createConnection();
            Statement statement = conn.createStatement();
            String query = "INSERT INTO `test_aed`.`survey_answers` (`survey_id`, `email`, `q1`, `q2`, `q3`, `q4`, `q5`) VALUES ('"+surveyId+"', '"+answerGiver+"', '"+answer1+"', '"+answer2+"', '"+answer3+"', '"+answer4+"', '"+answer5+"')";
            statement.executeUpdate(query);
            isSuccess = true;
            System.out.print(query);
 
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return isSuccess;
    }

    public ArrayList<SurveyResponses> retrieveAllSurveyAnswers() {
        ArrayList<SurveyResponses> companyList = new ArrayList<>();
            SurveyResponses company = null;
                try{
                    Connection conn = createConnection();
                    Statement statement = conn.createStatement();
                    String queryToExecute = "SELECT * FROM survey_questions";
                    System.out.println(queryToExecute);

                    ResultSet rs = statement.executeQuery(queryToExecute);

                    while(rs.next()){
                            company = new SurveyResponses();
                            company.setQuestion1(rs.getString("q1"));
                            company.setQuestion2(rs.getString("q2"));
                            company.setQuestion3(rs.getString("q3"));
                            company.setQuestion4(rs.getString("q4"));
                            company.setQuestion5(rs.getString("q5"));
                            company.setResponderEmail(rs.getString("email"));
                            company.setSurveyId(rs.getInt("survey_id"));
                            companyList.add(company);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            return companyList;
    }

}
