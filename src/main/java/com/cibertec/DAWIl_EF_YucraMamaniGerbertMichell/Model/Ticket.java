package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket")
public class Ticket {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private LocalDate updatedAt;
    private LocalDate createdAt;
    
    @ManyToOne
	@JoinColumn(name="kind_id")
	private Kind kind;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="asigned_id")
	private Asigned asigned;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="priority_id")
	private Priority priority;
	
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status status;
}
