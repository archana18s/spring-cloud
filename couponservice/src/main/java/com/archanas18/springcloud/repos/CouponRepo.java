package com.archanas18.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archanas18.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
