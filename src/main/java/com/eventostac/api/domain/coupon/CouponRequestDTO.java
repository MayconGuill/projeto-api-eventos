package com.eventostac.api.domain.coupon;

import com.eventostac.api.domain.event.Event;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
