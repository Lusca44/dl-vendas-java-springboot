package com.devlucas.dlvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucas.dlvendas.dto.SaleDTO;
import com.devlucas.dlvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<List<SaleDTO>> findAll(){
		List<SaleDTO> sales = service.findAll();
		return ResponseEntity.ok(sales);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<SaleDTO> findById(@PathVariable Long id){
		SaleDTO sale = service.findByID(id);
		return ResponseEntity.ok(sale);
	}
	
	
}
