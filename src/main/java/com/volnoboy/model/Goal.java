package com.volnoboy.model;

import org.hibernate.validator.constraints.Range;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/26/15 6:48 PM
 */
public class Goal {
	@Range(min=1, max=120)
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
