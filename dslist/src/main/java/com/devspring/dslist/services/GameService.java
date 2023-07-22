package com.devspring.dslist.services;

import java.util.List;
import java.util.NoSuchElementException;

import com.devspring.dslist.dto.GameDTO;
import com.devspring.dslist.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devspring.dslist.dto.GameMinDTO;
import com.devspring.dslist.entities.Game;
import com.devspring.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        try
        {
            Game result = gameRepository.findById(id).get();
            return new GameDTO(result);
        }
        catch(NoSuchElementException e ) //CAPTURA DA POSSÍVEL exceção.
        {
            //TRATAMENTO DA exceção
            System.out.println("Id Não existe");
            Game result = null;
        }
        return  null;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}