package com.eventostac.api.dto.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
