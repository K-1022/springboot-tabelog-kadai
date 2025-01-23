package com.example.nagoyameshi.form;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryEditForm {
	@NotBlank
    private String name;

	private List<Integer> categoryIds;
}
