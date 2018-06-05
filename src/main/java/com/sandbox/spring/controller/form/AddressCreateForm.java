package com.sandbox.spring.controller.form;

import com.sandbox.spring.service.request.AddressCreateRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class AddressCreateForm implements Serializable {

	@NotNull
	private Integer postalCode;

	@NotNull
	private String address1;

	@NotNull
	private String address2;

	public AddressCreateRequest toAddressCreateRequest() {
		return AddressCreateRequest
				.builder()
				.postalCode(getPostalCode())
				.address1(getAddress1())
				.address2(getAddress2())
				.build();
	}
}
