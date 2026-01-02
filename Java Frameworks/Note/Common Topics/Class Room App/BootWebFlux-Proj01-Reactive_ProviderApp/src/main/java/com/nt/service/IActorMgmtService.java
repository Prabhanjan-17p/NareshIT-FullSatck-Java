package com.nt.service;

import com.nt.document.ActorInfo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IActorMgmtService {
	public Mono<ActorInfo> saveActor(ActorInfo act);
	public Flux<ActorInfo> showAllActor();
	public Mono<ActorInfo> showActorByID(Integer id);
	public Mono<ActorInfo> removeActorID(Integer id);
	public Mono<ActorInfo> updateActor(Integer id);
}
