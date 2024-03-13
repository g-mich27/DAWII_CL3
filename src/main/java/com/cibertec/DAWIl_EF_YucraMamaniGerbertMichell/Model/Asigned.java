package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "asigned")
public class Asigned {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int asignedId;
    private String name;
}
