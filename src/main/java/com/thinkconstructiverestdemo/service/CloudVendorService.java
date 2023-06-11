package com.thinkconstructiverestdemo.service;

import java.util.List;

import com.thinkconstructiverestdemo.model.CloudVendor;


public interface CloudVendorService {
      public String createCloudVendor(CloudVendor cloudVendor);
      public String updateCloudVendor(CloudVendor cloudVendor);
      public String deleteCloudVendor(Long cloudVendorid);
      public CloudVendor getCloudVendor(Long cloudVendorid);
      public List<CloudVendor> getAllCloudVendor();
}
