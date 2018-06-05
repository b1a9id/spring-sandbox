package com.sandbox.spring.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Audited
public class Address implements Serializable {

	private int postalCode;

	private String address1;

	private String address2;
}
