package com.bandesal.app.backoffice.domain.persistence;

import com.bandesal.app.backoffice.domain.Reader;
import com.bandesal.app.backoffice.domain.dto.SaveReader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ReaderRepository {
    Reader save(SaveReader dto);
    Page<Reader> findAll(Pageable pageable);
    Optional<Reader> findById(long id);
    void delete(long id);
    Reader update(long id, SaveReader dto);
}
