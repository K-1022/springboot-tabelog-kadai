package com.example.springboot_tabelog_kadai.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreEditForm {
	@NotNull
	private Integer id;
	
	@NotBlank(message = "店舗名を入力してください。")
	private String name;
	
	@NotBlank(message = "ジャンルを選択してください。")
	private String genre;
	
	private MultipartFile imageFile;
	
	@NotBlank(message = "説明を入力してください。")
	private String description;
	
	@NotNull(message = "予算を入力してください。")
	@Min(value = 1, message = "予算は1円以上に設定してください。")
	private Integer price;
	
	@NotNull(message = "郵便番号を入力してください。")
	private String postalCode;
	
	@NotBlank(message = "住所を入力してください。")
	private String address;
	
	@NotBlank(message = "電話番号を入力してください。")
	private String phoneNumber;

}
