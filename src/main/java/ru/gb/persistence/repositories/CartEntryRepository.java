package ru.gb.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.persistence.entities.CartEntry;
import ru.gb.persistence.entities.Order;

import java.util.List;

public interface CartEntryRepository extends JpaRepository<Order, Long> {

//    List<CartEntry> findAllByOrderIdAndOrderByProductNameDesc(Long userId, Long orderId);
}
