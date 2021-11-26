package com.devlucas.dlvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.dlvendas.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long>  {

}
