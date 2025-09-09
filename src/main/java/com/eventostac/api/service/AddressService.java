package com.eventostac.api.domain.services;

import com.eventostac.api.domain.address.Address;
import com.eventostac.api.domain.event.Event;
import com.eventostac.api.dto.event.EventRequestDTO;
import com.eventostac.api.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return repository.save(address);
    }
}
