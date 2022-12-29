package com.bandesal.app.backoffice.domain.service;

import com.bandesal.app.backoffice.domain.Reader;
import com.bandesal.app.backoffice.domain.Reading;
import com.bandesal.app.backoffice.domain.dto.SaveReader;
import com.bandesal.app.backoffice.domain.dto.SaveReading;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ReadingService {
    Reading save(SaveReading dto);
    Page<Reading> findAll(Pageable pageable);
    Optional<Reading> findById(long blogId, long readerId);
    void delete(long blogId, long readerId);
    Reading update(long blogId, long readerId, SaveReader dto);
}
