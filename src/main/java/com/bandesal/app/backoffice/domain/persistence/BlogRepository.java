package com.bandesal.app.backoffice.domain.persistence;

import com.bandesal.app.backoffice.domain.Blog;
import com.bandesal.app.backoffice.domain.dto.SaveBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BlogRepository {
    Blog save(SaveBlog dto);
    Page<Blog> findAll(Pageable pageable);
    Optional<Blog> findById(long id);
    void delete(long id);
    Blog update(long id, SaveBlog dto);
}
