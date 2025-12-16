package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ActorEntity;
import com.nt.error.ActorNotFoundException;
import com.nt.repository.IActorRepository;
import com.nt.vo.ActorVO;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService{
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String registerActor(ActorVO vo) {
		ActorEntity entity = new ActorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreatedBy(System.getProperty("user.name")); // current system user
		int idVal = actorRepo.save(entity).getAid();
		return "Actor is registered with id :: "+idVal;
	}

	@Override
	public String registerBatchActor(List<ActorVO> listVo) {
		List<ActorEntity> listEntity = new ArrayList<>();
	    String systemUser = System.getProperty("user.name"); // current system user

	    listVo.forEach(vo -> {
	        ActorEntity entity = new ActorEntity();
	        BeanUtils.copyProperties(vo, entity);
	        entity.setCreatedBy(systemUser); 
	        listEntity.add(entity);
	    });

	    actorRepo.saveAll(listEntity); 
	    return listEntity.size() + " Actors registered successfully";
	}

	@Override
	public List<ActorVO> showAllActors() {
		List<ActorEntity> all = actorRepo.findAll();
		List<ActorVO> allActor = new ArrayList<ActorVO>();
		all.forEach(vo ->{
			ActorVO newVO = new ActorVO();
			BeanUtils.copyProperties(vo, newVO);
			allActor.add(newVO);
		});
		return allActor;
	}

	@Override
	public ActorVO showActorByID(int id) {
		ActorEntity entity = actorRepo.findById(id).orElseThrow(()-> new ActorNotFoundException("Invalid ID"));
		ActorVO vo = new ActorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public String updateRemunerationById(int aid, double hikePercentage) {
		ActorEntity entity = actorRepo.findById(aid).orElseThrow(()-> new ActorNotFoundException("Invalid ID"));
		entity.setRemuneration(entity.getRemuneration() + entity.getRemuneration()*hikePercentage/100.0);
		entity.setUpdateCount(entity.getUpdateCount()+1);
		entity.setUpdatedBy(System.getProperty("user.name"));
		actorRepo.save(entity);
		return "Actor-"+entity.getAid()+" Update Remuneration :: "+entity.getRemuneration();
	}

	@Override
	public String actorUpdate(ActorVO vo) {
		//It will be not work because of in entity "version" are thier that so why
//		ActorEntity entity = new ActorEntity();
//		BeanUtils.copyProperties(vo, entity);
//		actorRepo.save(entity);
		
		//It will be work
		ActorEntity entity = actorRepo.findById(vo.getAid())
		        .orElseThrow(() -> new ActorNotFoundException("Invalid ID"));
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdateCount(entity.getUpdateCount() + 1);
		entity.setUpdatedBy(System.getProperty("user.name"));
		actorRepo.save(entity);

		
		return "Actor- "+vo.getAid()+" is updated." ;
	}

	@Override
	public String updateRemunerationByAddress(String addrs, double hikePercent) {
		int count = actorRepo.updateActorRemunerationByAddress(addrs, hikePercent);
		return count+" No of Actor update.";
	}

	@Override
	public String deleteActorById(int id) {
		ActorEntity entity = actorRepo.findById(id).orElseThrow(() -> new ActorNotFoundException("Invalid ID"));
		actorRepo.deleteById(id);
		return id+" Actor Delete Successfully.";
	}

	@Override
	public String deleteActorsByRemunerationRange(double start, double end) {
		int range = actorRepo.removeActorRemunerationByRange(start, end);
		return range+" No of Actors are deleted.";
	}

}
