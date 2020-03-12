package com.ravina.ratingdataservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravina.ratingdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {

		return new Rating(movieId, 4);

	}
}
