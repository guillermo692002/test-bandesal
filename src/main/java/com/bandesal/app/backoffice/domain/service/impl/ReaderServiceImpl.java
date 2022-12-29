package com.bandesal.app.backoffice.domain.service.impl;

import com.bandesal.app.backoffice.domain.Blog;
import com.bandesal.app.backoffice.domain.Reader;
import com.bandesal.app.backoffice.domain.dto.SaveBlog;
import com.bandesal.app.backoffice.domain.dto.SaveReader;
import com.bandesal.app.backoffice.domain.service.BlogService;
import com.bandesal.app.backoffice.domain.service.ReaderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Override
    public Reader save(SaveReader dto) {
        return null;
    }

    @Override
    public Page<Reader> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Reader> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Reader update(long id, SaveReader dto) {
        return null;
    }
}
