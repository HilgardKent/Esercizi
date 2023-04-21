package com.scuola.repository.impl;

import com.scuola.constants.URLJDBC;
import com.scuola.model.Scuola;
import com.scuola.model.Studente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepositoryImpl {
    public static List<Studente> selezionaStudente()
    {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement(); // preparo il comando (query che voglio eseguire)
            ResultSet rs = stmt.executeQuery("SELECT * FROM studente"); // dichiaro la query
            List<Studente> studenteList = new ArrayList<>();

            while (rs.next())
            {
                Studente s = new Studente(rs.getString("matricola_studente"),
                        rs.getString("nome_studente"),
                        rs.getString("cognome_studente"),
                        rs.getString("cf_studente"),
                        rs.getString("cellulare_studente"));

                studenteList.add(s);
            }
            conn.close();
            return studenteList;
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return new ArrayList<>();
    }

    public static Studente inserisciStudente(Studente studente)
    {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement("" +
                    "INSERT INTO studente (matricola_studente,nome_studente, cognome_studente,cf_studente,cellulare_studente) " +
                    "VALUES(?, ?, ?, ?, ?)");

            preparedStatement.setString(1, studente.getMatricola());
            preparedStatement.setString(2, studente.getNomeStudente());
            preparedStatement.setString(3, studente.getCognomeStudente());
            preparedStatement.setString(4, studente.getCfStudente());
            preparedStatement.setString(5, studente.getCfStudente());
            int row = preparedStatement.executeUpdate();
            conn.close();
            return studente;
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Studente modificaStudente(Studente studente) {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            PreparedStatement updatestatement = conn.prepareStatement("" +
                    "UPDATE studente SET nome_studente= ?, cognome_studente=?,cf_studente=?,cellulare_studente=?" +
                    "WHERE matricola_studente = ? ");

            updatestatement.setString(1, studente.getNomeStudente());
            updatestatement.setString(2, studente.getCognomeStudente());
            updatestatement.setString(3, studente.getCfStudente());
            updatestatement.setString(4, studente.getCellulareStudente());
            updatestatement.setString(5, studente.getMatricola());
            int row = updatestatement.executeUpdate();
            conn.close();
            return studente;
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return null;
    }

    public static Boolean eliminaStudente(String matricola) {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement(); // preparo il comando (query che voglio eseguire)
            PreparedStatement deletestatement = conn.prepareStatement("" +
                    "DELETE FROM studente WHERE matricola_studente = ?");
            deletestatement.setString(1,matricola);
            deletestatement.executeUpdate();
            conn.close();
            return true;
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return null;
    }
}
