package com.oifik.ayoub.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.oifik.ayoub.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	
  public List<Categorie> findByCategorieparent(Categorie categorieparent);
   Categorie findById(long id);
}

