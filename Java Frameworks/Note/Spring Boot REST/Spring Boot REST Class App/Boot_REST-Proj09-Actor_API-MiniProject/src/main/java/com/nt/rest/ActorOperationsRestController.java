package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.error.ActorNotFoundException;
import com.nt.service.ActorMgmtServiceImpl;
import com.nt.vo.ActorVO;

@RestController
public class ActorOperationsRestController {
	@Autowired
	private ActorMgmtServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorVO vo) {
		try {
			String saveActor = service.registerActor(vo);
			return new ResponseEntity<String>(saveActor, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/saveAll")
	public ResponseEntity<String> saveAllActor(@RequestBody List<ActorVO> listVo) {
		try {
			String saveActor = service.registerBatchActor(listVo);
			return new ResponseEntity<String>(saveActor, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/showAll")
	public ResponseEntity<?> showAllActors() {
		try {
			List<ActorVO> showAllActors = service.showAllActors();
			return new ResponseEntity<List<ActorVO>>(showAllActors, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> findByActorID(@PathVariable Integer id) {
		try {
			ActorVO actorByID = service.showActorByID(id);
			return new ResponseEntity<ActorVO>(actorByID, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PatchMapping("/updateRemuneration/{id}/{hike}")
	public ResponseEntity<String> updateRemunerationById(@PathVariable Integer id, @PathVariable Double hike) {
		try {
			String updateRem = service.updateRemunerationById(id, hike);
			return new ResponseEntity<String>(updateRem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateActor(@RequestBody ActorVO vo) {
		try {
			String actorUpdate = service.actorUpdate(vo);
			return new ResponseEntity<>(actorUpdate, HttpStatus.OK);
		} catch (ActorNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PatchMapping("/updateRemunerations/{addrs}/{hike}")
	public ResponseEntity<String> updateRemunerationByAddress(@PathVariable String addrs, @PathVariable Double hike) {
		try {
			String msg = service.updateRemunerationByAddress(addrs, hike);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeActorById(@PathVariable Integer id) {
		try {
			String msg = service.deleteActorById(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{start}/{end}")
	public ResponseEntity<String> removeActorsByRange(@PathVariable Double start, @PathVariable Double end){
		try {
			String msg = service.deleteActorsByRemunerationRange(start, end);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
