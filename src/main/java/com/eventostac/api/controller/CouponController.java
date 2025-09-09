package com.eventostac.api.controller;

import com.eventostac.api.domain.coupon.Coupon;
import com.eventostac.api.dto.coupon.CouponResponseDTO;
import com.eventostac.api.dto.coupon.CouponRequestDTO;
import com.eventostac.api.domain.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> create(@PathVariable UUID eventId, @RequestBody CouponRequestDTO body) {
        Coupon coupons = couponService.createCouponToEvent(eventId, body);
        return ResponseEntity.ok(coupons);
    }

    @GetMapping("/{couponId}")
    public ResponseEntity<CouponResponseDTO> getFilteredCoupon(@PathVariable UUID couponId) {
        CouponResponseDTO couponResponseDTO = couponService.getFilteredCoupon(couponId);
        return ResponseEntity.ok(couponResponseDTO);
    }
}
