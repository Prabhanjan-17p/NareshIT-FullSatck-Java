package com.nt.service;

import java.util.List;

import com.nt.vo.ActorVO;

public interface IActorMgmtService {
	public String registerActor(ActorVO vo);
	public String registerBatchActor(List<ActorVO> listVo);
	public List<ActorVO> showAllActors();
	public ActorVO showActorByID(int id);
	public String updateRemunerationById(int aid, double hikePercentage);
	public String updateRemunerationByAddress(String addrs, double hikePercent);
	public String actorUpdate(ActorVO vo);
	public String deleteActorById(int id);
	public String deleteActorsByRemunerationRange(double start, double end);
}
