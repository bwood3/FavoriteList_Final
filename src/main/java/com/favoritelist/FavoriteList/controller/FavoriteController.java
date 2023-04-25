package com.favoritelist.FavoriteList.controller;

import com.favoritelist.FavoriteList.model.Favorite;
import com.favoritelist.FavoriteList.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000/favorites")
    public Favorite createFavorite(@RequestBody Favorite favorite) {
        return favoriteService.save(favorite);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000/favorites")
    public void deleteFavorite(@PathVariable Long id) {
        favoriteService.delete(id);
    }

    @GetMapping("/user/{userId}")
    @CrossOrigin(origins = "http://localhost:3000/favorites")
    public List<Favorite> getFavoritesByUserId(@PathVariable Long userId) {
        return favoriteService.findByUserId(userId);
    }
}
