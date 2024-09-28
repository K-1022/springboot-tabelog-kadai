package com.example.springboot_tabelog_kadai.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.form.StoreRegisterForm;
import com.example.springboot_tabelog_kadai.repository.StoreRepository;

@Controller
@RequestMapping("/admin/stores")
public class AdminStoreController {
	private final StoreRepository storeRepository;
	
	public AdminStoreController(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

//	店舗一覧表示
	@GetMapping
	public String index(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable) {
		Page<Store> storePage = storeRepository.findAll(pageable);
		
		model.addAttribute("storePage", storePage);
		
		return "admin/stores/index";
	}
	
//	店舗登録
	@GetMapping("/register")
	public String register(Model model) {
		
		model.addAttribute("storeRegisterForm", new StoreRegisterForm());
		
		return "admin/stores/register";
	}
}
