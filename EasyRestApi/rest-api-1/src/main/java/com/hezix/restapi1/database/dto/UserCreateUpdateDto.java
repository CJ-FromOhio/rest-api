package com.hezix.restapi1.database.dto;

import com.hezix.restapi1.database.entity.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateUpdateDto {
//    private Long id;
    @NotBlank(message = "имя пользователя не должно быть пустым")
    @Size(min = 4, max = 64)
    private String username;
    @Size(min = 2, max = 64)
    @NotBlank(message = "имя не должно быть пустым")
    private String firstname;
    @Size(min = 2, max = 64)
    @NotBlank(message = "фамилия не должно быть пустым")
    private String lastname;

    private Role role;
    @Email(message = "почта введена не правельна")
    private String email;
}
