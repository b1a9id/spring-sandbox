package com.sandbox.spring.service.client.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class AddressCreateRequest implements Serializable {

	private Integer postalCode;

	private String address1;

	private String address2;
}
