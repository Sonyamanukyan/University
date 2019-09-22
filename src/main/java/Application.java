import models.Faculty;

import java.sql.SQLException;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        DataBase db = new DataBase("UniversityDB");
        try {
            db.getFaculties().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
