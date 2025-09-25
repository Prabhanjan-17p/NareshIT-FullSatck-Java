package com.nt.service;

import com.nt.entity.MarriageSeeker;

public interface IMarriageService {
	public String insertMarriageSeeker(MarriageSeeker marriageSeeker);
	
	public MarriageSeeker showById(Integer id);
}
