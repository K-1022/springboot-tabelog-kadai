package com.example.springboot_tabelog_kadai.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_tabelog_kadai.entity.Favorite;
import com.example.springboot_tabelog_kadai.entity.Store;
import com.example.springboot_tabelog_kadai.entity.User;
import com.example.springboot_tabelog_kadai.repository.FavoriteRepository;

@Service
public class FavoriteService {
private final FavoriteRepository favoriteRepository; 
	
	public FavoriteService(FavoriteRepository favoriteRepository) {
		this.favoriteRepository = favoriteRepository;
	}
		

	@Transactional
	public void create(User user, Store storeId) {
		Favorite favorite = new Favorite();
		
		favorite.setUser(user);
		favorite.setStore(storeId);
		
		favoriteRepository.save(favorite);
	}

}
