package com.thinkconstructiverestdemo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="cloud_vendor_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CloudVendor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vendorId;
	
	@Column(name="vendor_name", nullable=false)
	@JsonProperty("vendor_name")
	private String vendorName;
	
	@Column(name="vendor_address", nullable=false)
	@JsonProperty("vendor_address")
	private String vendorAddress;
	
	@Column(name="vendor_phone_number", nullable=false)
	@JsonProperty("vendor_phone_number")
	private String vendorPhoneNumber;
}
