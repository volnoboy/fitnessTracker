package com.volnoboy.service;

import java.util.List;

import com.volnoboy.model.Activity;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/31/15 7:06 PM
 */
public interface ExerciseService {
	List<Activity> findAllActivities();
}
