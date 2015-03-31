package com.volnoboy.service;

import java.util.ArrayList;
import java.util.List;

import com.volnoboy.model.Activity;
import org.springframework.stereotype.Service;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/31/15 7:04 PM
 */
@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);

		return activities;
	}
}
