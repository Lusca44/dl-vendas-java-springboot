package com.devlucas.dlvendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlucas.dlvendas.dto.SaleDTO;
import com.devlucas.dlvendas.dto.SaleSuccessDTO;
import com.devlucas.dlvendas.dto.SaleSumDTO;
import com.devlucas.dlvendas.entities.Sale;
import com.devlucas.dlvendas.repositories.SalesRepository;
import com.devlucas.dlvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repo;

	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepo.findAll();
		Page<Sale> sales = repo.findAll(pageable);
		return sales.map(sale -> new SaleDTO(sale));
	}
	
	public SaleDTO findByID(Long id) {
		Optional<Sale> sale = repo.findById(id);
		return new SaleDTO(sale.get());
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repo.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repo.successGroupedBySeller();
	}
	
}
