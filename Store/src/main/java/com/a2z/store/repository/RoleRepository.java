package com.a2z.store.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.a2z.store.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}