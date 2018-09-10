package com.isolver.codegenerator.codegen.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isolver.codegenerator.codegen.entities.Address;

public interface AddressRepo extends JpaRepository<Address, String> {

}
