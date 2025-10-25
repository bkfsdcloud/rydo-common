package com.adroitfirm.rydo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlaceSuggesstion {

	@JsonProperty("place_id")
	private String placeId;
	private String description;
}
