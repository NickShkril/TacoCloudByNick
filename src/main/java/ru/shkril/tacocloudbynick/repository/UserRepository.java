package ru.shkril.tacocloudbynick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shkril.tacocloudbynick.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String userName);

}
