package com.bandesal.app.backoffice.domain.service.impl;

import com.bandesal.app.backoffice.domain.Blog;
import com.bandesal.app.backoffice.domain.dto.SaveBlog;
import com.bandesal.app.backoffice.domain.service.BlogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog save(SaveBlog dto) {
        return null;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Blog> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Blog update(long id, SaveBlog dto) {
        return null;
    }
}
