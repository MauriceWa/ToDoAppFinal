package org.duckstudios.todoappfinal.dao;


import org.duckstudios.todoappfinal.models.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CustomUser, Long> {
    public CustomUser findByEmail(String email);
}
