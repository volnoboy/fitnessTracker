package com.volnoboy.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/18/15 8:19 PM
 */
public class Exercise {
	@Range(min=1, max=120)
	private int minutes;

	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
