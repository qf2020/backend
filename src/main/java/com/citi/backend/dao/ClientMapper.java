package com.citi.backend.dao;

import com.citi.backend.entity.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMapper {
    int insert(Client record);
}
