package com.example.wecon.repository;

import com.example.wecon.entity.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
}
