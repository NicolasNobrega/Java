package com.devspring.dslist.repositories;

import com.devspring.dslist.entities.Game;
import com.devspring.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
