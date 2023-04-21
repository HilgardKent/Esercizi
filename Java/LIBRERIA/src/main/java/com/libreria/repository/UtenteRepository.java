package com.libreria.repository;

import com.libreria.costant.URLJDBC;
import com.libreria.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository
{
    public  static List<Utente> selezionautenti()
    {
        try{
            Connection conn= DriverManager.getConnection(URLJDBC.URL,URLJDBC.USER,URLJDBC.PASSWORD);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM utente");
            List <Utente> utenteList = new ArrayList<>();

            while (rs.next())
            {
                Utente u = new Utente(rs.getString("codiceCliente"),
                        rs.getString("nomeCliente"),
                rs.getString("cognomeCliente"),
                rs.getString("numeroTelefono"));
                utenteList.add(u);
            }
            conn.close();
            return utenteList;

        }
        catch (SQLException ex)
        {
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }

}
