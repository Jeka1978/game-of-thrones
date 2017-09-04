package com.db.gameofthrones.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Evegeny on 04/09/2017.
 */
public interface IronBankDao extends MongoRepository<Client,Integer> {

    @RestResource(path = "byname")
    List<Client> findByNameLike(@Param("name") String nameLike);
    @RestResource(path = "name")
    Client findByName(String name);
}
