package ru.medcoresoft;

import java.sql.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by vdorofeyev on 4/1/14.
 */
public class Repository {
    public static void AddStudy(String PatientId, String PatientName, LocalDate PatientBirthDate,
                                String StudyInstanceUid, LocalDate StudyDate)
    {
Connection conn = GetConnection();
        String     sql = "INSERT INTO pacs.patient VALUES('"+PatientId+"','"+
                PatientName+"', '"+PatientBirthDate+"')";
   //     sql = "INSERT INTO EMPLOYEES VALUES(1, 'John Doe')";
        try (Statement stmt = conn.createStatement())
        {
            stmt.executeUpdate(sql);
        }
        catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public static Connection GetConnection()
    {
        Connection conn = null;

        try {
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/pacs",
                            "root", "P@ssw0rd");
        }
        catch (SQLException sqlex)
        {
            while (sqlex != null)
            {
                System.err.println("SQL error : "+sqlex.getMessage());
                System.err.println("SQL state : "+sqlex.getSQLState());
                System.err.println("Error code: "+sqlex.getErrorCode());
                System.err.println("Cause: "+sqlex.getCause());
                sqlex = sqlex.getNextException();
            }
        }

        return conn;
    }
}
