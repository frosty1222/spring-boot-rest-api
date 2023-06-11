package com.thinkconstructiverestdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstructiverestdemo.model.CloudVendor;
import com.thinkconstructiverestdemo.repository.CloudVendorRepository;
import com.thinkconstructiverestdemo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
   CloudVendorRepository cloudVEndorRepository;
   
    
	public CloudVendorServiceImpl(CloudVendorRepository cloudVEndorRepository) {
		super();
		this.cloudVEndorRepository = cloudVEndorRepository;
    }

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVEndorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVEndorRepository.save(cloudVendor);
		return "updated";
	}

	@Override
	public String deleteCloudVendor(Long cloudVendorid) {
		// TODO Auto-generated method stub
		cloudVEndorRepository.deleteById(cloudVendorid);
		return "deleted";
	}

	@Override
	public CloudVendor getCloudVendor(Long cloudVendorid) {
		// TODO Auto-generated method stub
		return cloudVEndorRepository.findById(cloudVendorid).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		// TODO Auto-generated method stub
		return cloudVEndorRepository.findAll();
	}
     
}
