package com.devlucas.dlvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.dlvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>  {

}
