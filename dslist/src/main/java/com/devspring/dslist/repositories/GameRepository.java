package com.devspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
