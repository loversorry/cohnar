package lesson2;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();
//        db.createTable("books", "id INT PRIMARY KEY, name VARCHAR(30), author VARCHAR(30), quantity VARCHAR(30)");
//        db.createTable("authors", "id INT PRIMARY KEY, name VARCHAR(30), surname VARCHAR(30)");
//        db.createTable("accounts", "id INT PRIMARY KEY, name VARCHAR(30), surname VARCHAR(30), email VARCHAR(40)");
//        db.createTable("quantity", "id INT PRIMARY KEY, name VARCHAR(30), zhanri VARCHAR(10)");
//
//        db.addValue("books", "1, 'Путешествие на Мальдивы', 'Оля Бузова', '100'");
//        db.addValue("books", "2, 'Голуби Лас-Вегаса', 'Николай Басков', '50'");
//        db.addValue("books", "3, 'Дачники Людочки', 'Люда Котик', '68'");
//        db.addValue("books", "4, 'Как стать нефором', 'Даня Нефор', '25'");
//        db.addValue("books", "5, 'История Соника', 'Ник Уилсон', '15'");
//        db.addValue("books", "6, 'Как лечить осталость из-за игр', 'Галина Николаевна', '11'");
//        db.addValue("books", "7, 'Тленность бытия', 'Альбина Сунова', '98'");
//        db.addValue("books", "8, 'Как стать тикитокером', 'Нина Николаевна', '35'");
//        db.addValue("books", "9, 'Как понравится человеку', 'Бьянка Цензори', '59'");
//        db.addValue("books", "10, 'Готовка для мужчин', 'Лина Феминистова', '10'");
//
//        db.addValue("authors", "1, 'Оля','Бузова'");
//        db.addValue("authors", "2, 'Россия','Петрова'");
//        db.addValue("authors", "3, 'София','Лирова'");
//        db.addValue("authors", "4, 'Люда','Котик'");
//        db.addValue("authors", "5, 'Нина','Николаевна'");
//        db.addValue("authors", "6, 'Бьянка','Цензори'");
//        db.addValue("authors", "7, 'Даня','Нефор'");
//        db.addValue("authors", "8, 'Мэди','Малинова'");
//        db.addValue("authors", "9, 'Кира','Шуров'");
//        db.addValue("authors", "10, 'Ник','Уилсон'");
//
//        db.addValue("accounts", "1, 'Фина','Рисова', 'finochkarisova@gmail.com'");
//        db.addValue("accounts", "2, 'Дмитрий','Нагиев', 'dimochkanagiev@gmail.com'");
//        db.addValue("accounts", "3, 'Луиза', 'Кулова', 'luziuwu123@gmail.com'");
//        db.addValue("accounts", "4, 'Рина', 'Мудрая', 'rinalove@gmail.com'");
//        db.addValue("accounts", "5, 'Руины', 'Рима', 'ruinalok@gmail.com'");
//        db.addValue("accounts", "6, 'Любительница', 'Книг', 'ilovebook@gmail.com'");
//        db.addValue("accounts", "7, 'Ляля', 'Малышева', 'lyalyapupi@gmail.com'");
//        db.addValue("accounts", "8, 'Книгоман', 'Мира', 'evgeniyzhukov@gmail.com'");
//        db.addValue("accounts", "9, 'Раиса', 'Генова', 'raisagena@gmail.com'");
//        db.addValue("accounts", "10, 'Дин', 'Вул', 'dimdinlon@gmail.com'");
//
//        db.addValue("quantity", "1, 'Оля Бузова','реализм'");
//        db.addValue("quantity", "2, 'Николай Басков','трагедия'");
//        db.addValue("quantity", "3, 'Дачники Людочки','научное'");
//        db.addValue("quantity", "4, 'Как стать нефором','научное'");
//        db.addValue("quantity", "5, 'История Соника','фантастика'");
//        db.addValue("quantity", "6, 'Как лечить осталость из-за игр','научное'");
//        db.addValue("quantity", "7, 'Тленность бытия','научное'");
//        db.addValue("quantity", "8, 'Как стать тикиток','повсед'");
//        db.addValue("quantity", "9, 'Как понравится человеку','повсед'");
//        db.addValue("quantity", "10, 'Готовка для мужчин','научное'");
        db.selectTable3("quantity");
    }
}

