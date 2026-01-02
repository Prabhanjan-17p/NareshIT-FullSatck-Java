package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.ActorInfo;
import com.nt.repository.IActorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ActorMgmtImpl implements IActorMgmtService{
	@Autowired
	private IActorRepository repo;

	@Override
	public Mono<ActorInfo> saveActor(ActorInfo act) {
		Mono<ActorInfo> save = repo.save(act);
		return save;
	}

	@Override
	public Flux<ActorInfo> showAllActor() {
		Flux<ActorInfo> all = repo.findAll().switchIfEmpty(Flux.empty());
		return all;
	}

	@Override
	public Mono<ActorInfo> showActorByID(Integer id) {
		Mono<ActorInfo> byId = repo.findById(id).switchIfEmpty(Mono.empty());
		return byId;
	}

	@Override
	public Mono<ActorInfo> removeActorID(Integer id) {
	    return repo.findById(id)
	            .flatMap(actor ->
	                    repo.deleteById(actor.getId())
	                        .thenReturn(actor)
	            )
	            .onErrorResume(e ->
	                    Mono.error(new RuntimeException("Invalid ID", e))
	            );
	}

	@Override
	public Mono<ActorInfo> updateActor(Integer id) {
		return repo.findById(id)
				.flatMap(actor ->
						repo.save(actor))
				.onErrorResume(e ->
						Mono.error(new RuntimeException("Invalid ID", e))
				);
	}

}
