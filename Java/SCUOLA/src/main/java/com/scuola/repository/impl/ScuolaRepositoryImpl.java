package com.scuola.repository.impl;

import com.scuola.constants.URLJDBC;
import com.scuola.model.Scuola;
import com.scuola.repository.ScuolaRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScuolaRepositoryImpl
{
    public static List<Scuola> selezionaScuole()
    {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement(); // preparo il comando (query che voglio eseguire)
            ResultSet rs = stmt.executeQuery("SELECT * FROM scuola"); // dichiaro la query
            List<Scuola> scuolaList = new ArrayList<>();

            while (rs.next())
            {
                Scuola s = new Scuola(rs.getString("codice_meccanografico"),
                        rs.getString("nome_scuola"),
                        rs.getString("indirizzo_scuola"),
                        rs.getString("tipologia_istituto"),
                        rs.getString("numero_telefono"));

                scuolaList.add(s);
            }
            conn.close();
            return scuolaList;
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

    public static Scuola inserisciScuola(Scuola scuola)
    {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement("" +
                    "INSERT INTO scuola (codice_meccanografico,nome_scuola, indirizzo_scuola,tipologia_istituto,numero_telefono) " +
                    "VALUES(?, ?, ?, ?, ?)");

            preparedStatement.setString(1, scuola.getCodiceMeccanografico());
            preparedStatement.setString(2, scuola.getNomeScuola());
            preparedStatement.setString(3, scuola.getIndirizzoScuola());
            preparedStatement.setString(4, scuola.getTipologiaIstituto());
            preparedStatement.setString(5, scuola.getNumeroTelefono());
            int row = preparedStatement.executeUpdate();
            conn.close();
            return scuola;
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

    public static Scuola modificaScuola(Scuola scuola) {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            PreparedStatement updatestatement = conn.prepareStatement("" +
                    "UPDATE scuola SET nome_scuola= ?, indirizzo_scuola=?,tipologia_istituto=?,numero_telefono=?" +
                    "WHERE codice_meccanografico = ? ");

            updatestatement.setString(1, scuola.getNomeScuola());
            updatestatement.setString(2, scuola.getIndirizzoScuola());
            updatestatement.setString(3, scuola.getTipologiaIstituto());
            updatestatement.setString(4, scuola.getNumeroTelefono());
            updatestatement.setString(5, scuola.getCodiceMeccanografico());
            int row = updatestatement.executeUpdate();
            conn.close();
            return scuola;
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

    public static Boolean eliminaScuola(String codiceMeccanografico) {
        try
        {
            Connection conn = DriverManager.getConnection(URLJDBC.URL,
                    URLJDBC.USER, URLJDBC.PASSWORD);
            Statement stmt = conn.createStatement(); // preparo il comando (query che voglio eseguire)
            PreparedStatement deletestatement = conn.prepareStatement("" +
                    "DELETE FROM scuola WHERE codice_meccanografico = ?");
            deletestatement.setString(1,codiceMeccanografico);
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
