package com.wasim.linkup.dto;



import lombok.Data;

@Data
public class RegisterRequestDTO {

    private String username;
    private String email;
    private String password;
}
