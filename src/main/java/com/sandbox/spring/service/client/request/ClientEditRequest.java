package com.sandbox.spring.service.client.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class ClientEditRequest implements Serializable {

	private String name;

	private AddressEditRequest address;
}
