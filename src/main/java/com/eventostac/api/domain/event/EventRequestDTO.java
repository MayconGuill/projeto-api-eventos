package com.eventostac.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import javax.xml.crypto.Data;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
