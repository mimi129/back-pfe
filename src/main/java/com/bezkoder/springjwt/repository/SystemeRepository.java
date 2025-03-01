package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Systeme;

@Repository
public interface SystemeRepository 	extends JpaRepository<Systeme, String> {
	    Systeme findByCodesysteme(String codesysteme);
	}