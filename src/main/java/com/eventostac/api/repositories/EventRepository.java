package com.eventostac.api.repositories;

import com.eventostac.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
