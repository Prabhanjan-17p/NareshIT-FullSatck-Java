package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.ActorEntity;

import jakarta.transaction.Transactional;

public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {
	@Query(value = "update ActorEntity set remuneration=remuneration+(remuneration * :hikePercent/100.0) where addrs=:addrs")
	@Modifying
	@Transactional
	public int updateActorRemunerationByAddress(String addrs, Double hikePercent);
	
	@Query(value = "delete from ActorEntity where remuneration >= :start and remuneration <= :end")
	@Modifying
	@Transactional
	public int removeActorRemunerationByRange(Double start, Double end);
}
