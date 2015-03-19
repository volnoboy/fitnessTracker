package com.volnoboy.controller;

import com.volnoboy.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/18/15 7:53 PM
 */
@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise")Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
	}
}
