package ru.gb.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.persistence.entities.Order;

public interface CartEntryRepository extends JpaRepository<Order, Long> {

//    List<CartEntry> findAllByOrderIdAndOrderByProductNameDesc(Long userId, Long orderId);
}
