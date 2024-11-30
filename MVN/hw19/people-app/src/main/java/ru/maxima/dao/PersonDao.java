package ru.maxima.dao;

import org.springframework.stereotype.Component;
import ru.maxima.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {

    private static Long NEXT_ID = 0L;

    private final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final String USER = "postgres";
    private final String PASSWORD = "postgres";

    private Connection connection;

    {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Person> getAllPeople() {

        List<Person> allPeople = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getLong("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEMail(resultSet.getString("email"));
                allPeople.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allPeople;
    }

    public Person getPersonById(Long id) {

        Person person = null;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM person WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                person = new Person();
                person.setId(resultSet.getLong("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEMail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

    public void save(Person person) {

        Long max = getAllPeople().stream()
                .map(p -> p.getId())
                .max(Long::compareTo)
                .orElse(null);

        try {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO person (id, name, age, email) VALUES(" +
                    ++max +
                    ", '" + person.getName() + "', " + person.getAge() +
                    ", '" + person.getEMail() + "')";

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Person personFromForm, Long id) {

        String sql = "UPDATE person SET name = ?, age = ?, email = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, personFromForm.getName());
            statement.setInt(2, personFromForm.getAge());
            statement.setString(3, personFromForm.getEMail());
            statement.setLong(4, id);
            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

//        try { поругалась GPTшка
//            Statement statement = connection.createStatement();
//            String sql = "UPDATE person SET " +
//                    "name = " + personFromForm.getName() + ", " +
//                    "age = " + personFromForm.getAge() + ",  " +
//                    "email = " + personFromForm.getEMail()+" " +
//                    "WHERE id = " + id;
//
//            statement.executeUpdate(sql);
//
//        }

//        Person person = getPersonById(id); старый вариант
//        person.setName(personFromForm.getName());
//        person.setAge(personFromForm.getAge());
//        person.setEMail(personFromForm.getEMail());
    }

    public void delete(Long id) {

        String sql = "DELETE FROM person WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

//        allPeople.removeIf(person -> person.getId().equals(id));
    }
}
