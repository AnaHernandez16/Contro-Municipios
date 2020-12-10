package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Casa;

@Repository("casasrepository")
public interface CasasRepository extends JpaRepository<Casa, Serializable>{

}
