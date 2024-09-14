package jailcomfranssa.com.github.petshopping.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {

    private Long id;

    @NotNull(message = "O nome do pet é obrigatório")
    private String nome;

    @NotNull(message = "O tipo é obrigatório")
    private String animal;

    @NotNull(message = "A raça é obrigatório")
    private String raca;

    @NotNull(message = "A data de Nascimento do animal é obrigatório")
    private String dataNascimento;
    private Long clienteId;  // Substituindo cliente por seu ID
    //private List<Long> agendamentoIds;  // Substituindo agendamentos por IDs


}
