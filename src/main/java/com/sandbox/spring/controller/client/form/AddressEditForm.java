package com.sandbox.spring.controller.client.form;

import com.sandbox.spring.service.client.request.AddressEditRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class AddressEditForm implements Serializable {

	@NotNull
	private Integer postalCode;

	@NotNull
	private String address1;

	@NotNull
	private String address2;

	public AddressEditRequest toAddressEditRequest() {
		return AddressEditRequest
				.builder()
				.postalCode(getPostalCode())
				.address1(getAddress1())
				.address2(getAddress2())
				.build();
	}
}
