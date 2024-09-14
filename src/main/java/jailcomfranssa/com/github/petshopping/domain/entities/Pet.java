package jailcomfranssa.com.github.petshopping.domain.entities;

import jailcomfranssa.com.github.petshopping.domain.baseentity.BaseEntity;
import jailcomfranssa.com.github.petshopping.domain.enums.TipoAnimal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pet extends BaseEntity<Long> {

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoAnimal animal;
    private String raca;
    private LocalDate dataNascimento;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    //@OneToMany(mappedBy = "pet", cascade = CascadeType.PERSIST)
    //private List<AgendamentoServico> agendamentos;  // Alterado CascadeType para PERSIST
}
