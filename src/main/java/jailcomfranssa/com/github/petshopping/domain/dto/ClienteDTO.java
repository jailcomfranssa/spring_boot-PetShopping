package jailcomfranssa.com.github.petshopping.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.List;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório")
    @Size(min = 2, max = 100, message = "O nome do cliente deve ter entre 2 e 100 caracteres")
    private String nome;

    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve estar no formato 000.000.000-00")
    @NotBlank(message = "O CPF é obrigatório")
    private String cpf;


    private String telefone;

    @Email(message = "O email deve ser válido")
    @NotBlank(message = "O email é obrigatório")
    private String email;
    private String endereco;

    private List<Long> petIds;
    //private List<Long> compraIds;
}
