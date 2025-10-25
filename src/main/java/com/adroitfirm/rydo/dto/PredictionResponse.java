package com.adroitfirm.rydo.dto;

import java.util.List;

import com.adroitfirm.rydo.model.PlaceSuggesstion;

import lombok.Data;

@Data
public class PredictionResponse {

	private String status;
	private List<PlaceSuggesstion> predictions;
}
