package ru.shkril.tacocloudbynick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shkril.tacocloudbynick.model.TacoOrder;

public interface OrderRepository extends JpaRepository<TacoOrder, Long> {

}
