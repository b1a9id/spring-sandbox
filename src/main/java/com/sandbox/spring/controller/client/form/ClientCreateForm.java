package com.sandbox.spring.controller.client.form;

import com.sandbox.spring.service.client.request.ClientCreateRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class ClientCreateForm implements Serializable {

	@NotNull
	private String name;

	@Valid
	@NotNull
	private AddressCreateForm address;

	public ClientCreateRequest toClientCreateRequest() {
		return ClientCreateRequest.builder()
				.name(getName())
				.address(getAddress().toAddressCreateRequest())
				.build();
	}
}
