package com.sandbox.spring.controller.form;

import com.sandbox.spring.service.request.ClientEditRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class ClientEditForm implements Serializable {

	@NotNull
	private String name;

	@Valid
	@NotNull
	private AddressEditForm address;

	public ClientEditRequest toClientEditRequest() {
		return ClientEditRequest.builder()
				.name(getName())
				.address(getAddress().toAddressEditRequest())
				.build();
	}
}
