package com.sandbox.spring.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Audited
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Integer id;

	@Getter
	@Setter
	private String name;

	@Embedded
	@Getter
	@Setter
	private Address address;
}
