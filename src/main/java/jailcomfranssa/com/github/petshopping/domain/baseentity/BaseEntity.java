package jailcomfranssa.com.github.petshopping.domain.baseentity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity <T extends Serializable>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;
}
