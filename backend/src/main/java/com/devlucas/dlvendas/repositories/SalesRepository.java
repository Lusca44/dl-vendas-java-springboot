package com.devlucas.dlvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devlucas.dlvendas.dto.SaleSumDTO;
import com.devlucas.dlvendas.dto.SaleSuccessDTO;
import com.devlucas.dlvendas.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long>  {
	
	@Query("SELECT new com.devlucas.dlvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.devlucas.dlvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited) , SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
