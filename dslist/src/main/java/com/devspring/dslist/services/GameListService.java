package com.devspring.dslist.services;

import com.devspring.dslist.dto.GameDTO;
import com.devspring.dslist.dto.GameListDTO;
import com.devspring.dslist.dto.GameMinDTO;
import com.devspring.dslist.entities.Game;
import com.devspring.dslist.entities.GameList;
import com.devspring.dslist.repositories.GameListRepository;
import com.devspring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
