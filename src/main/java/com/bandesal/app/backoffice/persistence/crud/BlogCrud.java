package com.bandesal.app.backoffice.persistence.crud;

import com.bandesal.app.backoffice.persistence.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCrud extends JpaRepository<BlogEntity, Long> {
}
