package com.tnsif.Certificate_Service_Jayapreeya;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService 
{
	@Autowired
	private CertificateRepository repo;
	
	//get all the records from the table
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}
	//save the record
	public void save(Certificate Cert)
	{
		repo.save(Cert);
	}
	//retrieving the particular record with Cid
	public Certificate get(Integer id)
	{
		return repo.findById(id).get();
	}
	//deleting the particular record with cid
	public void delete (Integer id)
	{
		repo.deleteById(id);
	}
	//Update the Record
	public void update(Certificate Cert)
	{
		repo.save(Cert);
	}
	
}
