package com.thinkconstructiverestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkconstructiverestdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,Long>{

}
