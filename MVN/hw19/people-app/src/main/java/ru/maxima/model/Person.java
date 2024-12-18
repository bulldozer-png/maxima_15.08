package ru.maxima.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;

    @NotEmpty(message = "Name can`t be empty")
    @Size(min = 2, max = 50, message = "From 2 to 50 symbols")
    private String name;

    @Min(value = 0, message = "Age must be positive")
    private int age;

    @NotEmpty(message = "Email can`t be empty")
    @Email(message = "Email must be valid")
    private String eMail;

}
