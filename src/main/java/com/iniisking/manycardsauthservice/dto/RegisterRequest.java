package com.iniisking.manycardsauthservice.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    private String Email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?]).*$",
                    message = "Password must contain at one uppercase letter, one number and one symbol"
    )
    private String Password;

    @NotBlank(message = "Phone number is required")
    @Pattern(
            regexp = "^(\\+234|0)[7-9][0-1]\\d{8}$",
            message = "Phone number must be exactly 10 digits"
    )
    private String phonNumber;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    @Pattern(
            regexp = "^[A-Za-z]+$",
            message = "First name must contain only letters"
    )
    private String firstName;

    @NotBlank(message = "Other name is required")
    @Size(min = 2, max = 50, message = "Other name must be between 2 and 50 characters")
    @Pattern(
            regexp = "^[A-Za-z]+$",
            message = "Other name must contain only letters"
    )
    private String otherName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    @Pattern(
            regexp = "^[A-Za-z]+$",
            message = "Last name must contain only letters"
    )
    private String lastName;
}
