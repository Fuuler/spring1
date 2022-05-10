package ru.gb.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.persistence.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
