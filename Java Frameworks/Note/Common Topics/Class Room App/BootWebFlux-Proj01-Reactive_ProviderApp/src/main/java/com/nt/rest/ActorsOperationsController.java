package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.document.ActorInfo;
import com.nt.service.ActorMgmtImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
//@RequestMapping("/actor-api")
public class ActorsOperationsController {
	
	@Autowired
	private ActorMgmtImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<Mono<ActorInfo>> saveActor(@RequestBody ActorInfo info){
		Mono<ActorInfo> actor = service.saveActor(info);
		return new ResponseEntity<Mono<ActorInfo>>(actor, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Flux<ActorInfo>> showAll(){
		Flux<ActorInfo> allActor = service.showAllActor();
		return new ResponseEntity<Flux<ActorInfo>>(allActor, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Mono<ActorInfo>> showActorByID(@PathVariable Integer id){
		Mono<ActorInfo> byID = service.showActorByID(id);
		return new ResponseEntity<Mono<ActorInfo>>(byID, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Mono<ActorInfo>> updateActorByID(@PathVariable Integer id){
		Mono<ActorInfo> updateActor = service.updateActor(id);
		return new ResponseEntity<Mono<ActorInfo>>(updateActor, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Mono<ActorInfo>> deleteActorByID(@PathVariable Integer id){
		Mono<ActorInfo> removeActorID = service.removeActorID(id);
		return new ResponseEntity<Mono<ActorInfo>>(removeActorID, HttpStatus.OK);
	}
	
}
