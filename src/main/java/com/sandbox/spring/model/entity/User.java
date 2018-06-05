package com.sandbox.spring.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Audited
public class User implements Serializable {

	enum Gender {
		MAN, WOMAN
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "client_id")
	private Client client;

	private String name;

	@Enumerated(EnumType.STRING)
	private Gender gender;
}
