package com.inventsale.inventorysales.repositories.general;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventsale.inventorysales.entities.general.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer > {

}
