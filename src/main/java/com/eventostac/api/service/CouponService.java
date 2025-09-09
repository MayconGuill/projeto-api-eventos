package com.eventostac.api.service;

import com.eventostac.api.domain.coupon.Coupon;
import com.eventostac.api.dto.coupon.CouponRequestDTO;
import com.eventostac.api.dto.coupon.CouponResponseDTO;
import com.eventostac.api.domain.event.Event;
import com.eventostac.api.repository.CouponRepository;
import com.eventostac.api.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CouponService {

    @Autowired
    private CouponRepository repository;

    @Autowired
    private EventRepository eventRepository;

    public Coupon createCouponToEvent(UUID eventId, CouponRequestDTO data) {
        Event newEvent = eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Evento não encontrado."));

        Coupon newCoupon = new Coupon();
        newCoupon.setCode(data.code());
        newCoupon.setDiscount(data.discount());
        newCoupon.setValid(new Date(data.valid()));
        newCoupon.setEvent(newEvent);

        return repository.save(newCoupon);
    }

    public List<Coupon> consultCoupons(UUID eventId, Date currentDate) {
        return repository.findByEventIdAndValidAfter(eventId, currentDate);
    }

    public CouponResponseDTO getFilteredCoupon(UUID couponId) {
        Coupon coupon = repository.findById(couponId)
                .orElseThrow(() -> new IllegalArgumentException("Cupom não encontrado."));

        return new CouponResponseDTO(
                coupon.getId(),
                coupon.getCode(),
                coupon.getDiscount(),
                coupon.getValid()
        );
    }
}
