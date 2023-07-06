package com.project.cinema_city.dto.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
@Data
public class RegisterRequest {
    @Email
    private String email;
    @Size(min = 6, max = 16, message = "Length should be between 6 to 16")
    private String  password;
    @NotNull
    private String name;
    private String lastName;
    @Past
    private Date birthday; //yyyy-mm-dd
}
