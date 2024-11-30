package ru.maxima.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.maxima.model.Person;

import java.util.List;

@Component
public class PersonDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> getAllPeople() {
        return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person getPersonById(Long id) {
        return jdbcTemplate
                .query("SELECT * FROM person WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findFirst().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO person (name, age, email) VALUES (?, ?, ?)", person.getName(), person.getAge(), person.getEmail());
    }

    public void update(Person personFromView, Long id) {
        jdbcTemplate.update("UPDATE person SET name = ?, age = ?, email = ? WHERE id = ?",
                personFromView.getName(), personFromView.getAge(), personFromView.getEmail(), id);
    }

    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM person WHERE id = ?", id);
    }

}
