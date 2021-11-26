package com.devlucas.dlvendas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucas.dlvendas.dto.SellerDTO;
import com.devlucas.dlvendas.entities.Seller;
import com.devlucas.dlvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repo;
	
	
	public List<SellerDTO> findAll() {
		List<Seller> sellers = repo.findAll();
		return sellers.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
	
	public SellerDTO findById(Long id) {
		Optional<Seller> seller = repo.findById(id);
		return new SellerDTO(seller.get());
	}
	
}
