package film;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();
        db.createTableFilms("Films");
    }
}
