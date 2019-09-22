import models.Faculty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private String name;
    private Connection connection;

    public DataBase(String name) {
        this.name = name;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:1995/" + this.name, "postgres", "spacedementia1995");
            System.out.println("Connected!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Faculty> getFaculties() throws SQLException {
        List<Faculty> faculties = new ArrayList<Faculty>();
        PreparedStatement statement = connection.prepareStatement("select * from Faculty;");
        ResultSet facultyResultSet = statement.executeQuery();
        while(facultyResultSet.next()) {
            int faculty_id = facultyResultSet.getInt("Faculty_id");
            String name = facultyResultSet.getString("Name");
            faculties.add(new Faculty(faculty_id, name));
        }
        return faculties;
    }


}
