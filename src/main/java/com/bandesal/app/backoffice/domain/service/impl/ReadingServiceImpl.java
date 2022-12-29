package com.bandesal.app.backoffice.domain.service.impl;

import com.bandesal.app.backoffice.domain.Reading;
import com.bandesal.app.backoffice.domain.dto.SaveReader;
import com.bandesal.app.backoffice.domain.dto.SaveReading;
import com.bandesal.app.backoffice.domain.service.ReadingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReadingServiceImpl implements ReadingService {
    @Override
    public Reading save(SaveReading dto) {
        return null;
    }

    @Override
    public Page<Reading> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Reading> findById(long blogId, long readerId) {
        return Optional.empty();
    }

    @Override
    public void delete(long blogId, long readerId) {

    }

    @Override
    public Reading update(long blogId, long readerId, SaveReader dto) {
        return null;
    }
}
