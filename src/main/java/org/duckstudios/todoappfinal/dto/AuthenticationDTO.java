package org.duckstudios.todoappfinal.dto;

public class AuthenticationDTO {
    public String email;
    public String password;

    public AuthenticationDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
