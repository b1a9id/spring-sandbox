package com.sandbox.spring.service.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class AddressEditRequest implements Serializable {

	private Integer postalCode;

	private String address1;

	private String address2;
}
