package com.devlucas.dlvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucas.dlvendas.dto.SellerDTO;
import com.devlucas.dlvendas.entities.Seller;
import com.devlucas.dlvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerControllers {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<SellerDTO> findById(@PathVariable Long id){
		SellerDTO sellerDTO = service.findById(id);
		return ResponseEntity.ok(sellerDTO);
	}

	@PostMapping(value = "/cadastro")
	public ResponseEntity<SellerDTO> create(@RequestBody SellerDTO sellerDTO){
		SellerDTO seller = service.createSeller(sellerDTO); 
		return ResponseEntity.ok().body(seller);
	}
}
