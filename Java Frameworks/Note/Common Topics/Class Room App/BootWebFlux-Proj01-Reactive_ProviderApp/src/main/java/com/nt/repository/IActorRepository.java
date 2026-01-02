package com.nt.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nt.document.ActorInfo;

public interface IActorRepository extends ReactiveMongoRepository<ActorInfo, Integer> {
}
