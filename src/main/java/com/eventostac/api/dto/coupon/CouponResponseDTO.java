package com.eventostac.api.dto.coupon;

import java.util.Date;
import java.util.UUID;

public record CouponResponseDTO(UUID id, String code, Integer discount, Date date) {
}
