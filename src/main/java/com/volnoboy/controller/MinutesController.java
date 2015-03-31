package com.volnoboy.controller;

import java.util.List;

import com.volnoboy.model.Activity;
import com.volnoboy.model.Exercise;
import com.volnoboy.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/18/15 7:53 PM
 */
@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise")Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());

		return "redirect:addMoreMinutes.html";
	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise")Exercise exercise) {
		System.out.println("exercising: " + exercise.getMinutes());
		System.out.println("exersise activity: " + exercise.getActivity());
		return "addMinutes";
	}

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}

}
