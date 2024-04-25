package com.skypro.telegrambot.repository;

import com.skypro.telegrambot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {

}
