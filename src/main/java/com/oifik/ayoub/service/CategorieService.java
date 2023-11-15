package com.oifik.ayoub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oifik.ayoub.Repository.CategorieRepository;
import com.oifik.ayoub.entities.Categorie;
import com.oifik.ayoub.idao.IDao;


@Service
public class CategorieService implements IDao<Categorie>{
	
	
	@Autowired
	private CategorieRepository repository;

	@Override
	public Categorie create(Categorie o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Categorie update(Categorie o) {
		return repository.save(o);
	}

	@Override
	public Categorie findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Categorie> findAll() {
		return repository.findAll();
	}
	
	  public List<Categorie> findByCategorieparent(Categorie categorie) {
	        return repository.findByCategorieparent(categorie);
	    }

}

