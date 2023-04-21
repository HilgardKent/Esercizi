package com.example.esempiodb.repository;

public class Personarepository {

    public class JDBCExample {
        static final String DB_URL = "jdbc:mysql://localhost/";
        static final String USER = "root";
        static final String PASS = "Svsw2022";
        static  final  String QUERY = "SELECT ";

        public static void main(String[] args) {
            // Open a connection
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("ID: " + rs.getInt("id"));
                    System.out.print(", nome: " + rs.getInt("nome"));
                    System.out.print(", cognome: " + rs.getString("cognome"));
                    System.out.println(", email " + rs.getString("email"));
                }
}
