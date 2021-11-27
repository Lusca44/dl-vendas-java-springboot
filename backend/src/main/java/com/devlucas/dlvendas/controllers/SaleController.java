package com.devlucas.dlvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucas.dlvendas.dto.SaleDTO;
import com.devlucas.dlvendas.dto.SaleSuccessDTO;
import com.devlucas.dlvendas.dto.SaleSumDTO;
import com.devlucas.dlvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> sales = service.findAll(pageable);
		return ResponseEntity.ok(sales);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<SaleDTO> findById(@PathVariable Long id){
		SaleDTO sale = service.findByID(id);
		return ResponseEntity.ok(sale);
	}

	@GetMapping(value = "/sumBySeller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedById(){
		List<SaleSumDTO> amount = service.amountGroupedBySeller();
		return ResponseEntity.ok(amount);
	}

	@GetMapping(value = "/successBySeller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedById(){
		List<SaleSuccessDTO> success = service.successGroupedBySeller();
		return ResponseEntity.ok(success);
	}
	
	
}
