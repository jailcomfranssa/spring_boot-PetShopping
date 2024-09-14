package jailcomfranssa.com.github.petshopping.domain.entities;

import jailcomfranssa.com.github.petshopping.domain.baseentity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente extends BaseEntity<Long> {

    private String nome;

    @Column(unique = true)
    private String cpf;
    private String telefone;

    @Column(unique = true)
    private String email;
    private String endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pet> pets;

    //@OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
    //private List<Compra> compras;  // Alterado CascadeType para PERSIST

}
