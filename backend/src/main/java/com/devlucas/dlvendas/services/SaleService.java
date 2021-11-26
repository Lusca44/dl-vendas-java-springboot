package com.devlucas.dlvendas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucas.dlvendas.dto.SaleDTO;
import com.devlucas.dlvendas.entities.Sale;
import com.devlucas.dlvendas.repositories.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repo;
	
	public List<SaleDTO> findAll(){
		List<Sale> sales = repo.findAll();
		return sales.stream().map(sale -> new SaleDTO(sale)).collect(Collectors.toList());
	}
	
	public SaleDTO findByID(Long id) {
		Optional<Sale> sale = repo.findById(id);
		return new SaleDTO(sale.get());
	}
	
}
