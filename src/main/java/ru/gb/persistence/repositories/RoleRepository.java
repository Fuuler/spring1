package ru.gb.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.persistence.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
