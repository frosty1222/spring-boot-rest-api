package com.thinkconstructiverestdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructiverestdemo.model.CloudVendor;
import com.thinkconstructiverestdemo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;
    
    public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}
    
    // read specific cloundvendor 
	@GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") Long vendorId) {
    	return cloudVendorService.getCloudVendor(vendorId);
    }
    
	 // read specific cloundvendor 
	@GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
    	return cloudVendorService.getAllCloudVendor();
    }
		
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    	return cloudVendorService.createCloudVendor(cloudVendor);
    }
    
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    	return cloudVendorService.updateCloudVendor(cloudVendor);
    }
    
    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") Long vendorId) {
    	return cloudVendorService.deleteCloudVendor(vendorId);
    }
    
}
