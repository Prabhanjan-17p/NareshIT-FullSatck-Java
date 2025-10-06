package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private  IJobSeekerRepository  jsRepo;
	@Override
	public String registerJobSeekerGroup(Iterable<JobSeeker> list) {
		System.out.println("JobSeekerMgmtServiceImpl.registerJobSeekerGroup()");
		Iterable<JobSeeker> savedList=jsRepo.saveAll(list);
		// prepare List with id values
		List<Integer> ids=new ArrayList();
		/*savedList.forEach(js->{
			ids.add(js.getJsid());
		});*/
		  ids=StreamSupport.stream(savedList.spliterator(), false).map(JobSeeker::getJsid).toList();
		//return the message
		return  ids.size()+" no.of  JobSeekers are saved with id values::"+ids;
	}

	@Override
	public long showJobSeekersCount() {
		System.out.println("JobSeekerMgmtServiceImpl.showJobSeekersCount()");
		return jsRepo.count();
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeekers() {
		Iterable<JobSeeker>  list=jsRepo.findAll();
	    List<JobSeeker>  sortedList=StreamSupport.stream(list.spliterator(), false).sorted((js1,js2)->js1.getJsname().compareTo(js2.getJsname())).toList();	
	    return  sortedList;
	}

}
