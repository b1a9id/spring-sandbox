package com.sandbox.spring.entity;

import com.sandbox.spring.model.Status;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Team implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer status;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return Status.getStatus(this.status);
	}

	public void setStatus(Status status) {
		this.status = status.getStatusInt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
