package com.favoritelist.FavoriteList.service;

import com.favoritelist.FavoriteList.model.Favorite;
import com.favoritelist.FavoriteList.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    public Favorite save(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public void delete(Long id) {
        favoriteRepository.deleteById(id);
    }

    public List<Favorite> findByUserId(Long userId) {
        return favoriteRepository.findByUserId(userId);
    }
}