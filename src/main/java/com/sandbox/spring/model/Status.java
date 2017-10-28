package com.sandbox.spring.model;

import java.util.Arrays;

public enum Status {

	OPEN(1),
	IN_PROGRESS(2),
	COMPLETE(3),
	CANCELED(10);

	private final int statusInt;

	private Status(final int statusInt) {
		this.statusInt = statusInt;
	}

	public int getStatusInt() {
		return this.statusInt;
	}

	public static Status getStatus(final int statusInt) {
		return Arrays.stream(Status.values())
				.filter(status -> status.getStatusInt() == statusInt)
				.findFirst()
				.orElse(null);
	}
}
