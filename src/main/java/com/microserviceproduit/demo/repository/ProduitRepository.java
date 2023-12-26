package com.microserviceproduit.demo.repository;

import com.microserviceproduit.demo.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
