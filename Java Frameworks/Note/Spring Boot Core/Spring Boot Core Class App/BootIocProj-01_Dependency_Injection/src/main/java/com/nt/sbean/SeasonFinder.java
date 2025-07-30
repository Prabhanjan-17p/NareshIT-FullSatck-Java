package com.nt.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate localDate;
	
	public String findSeason() {
		int mon = localDate.getMonthValue();
		
		if (mon >= 3 && mon<= 6)  return "Summer Season";
		else if(mon >= 7 && mon<= 10) return "Rainy Season";
		else return "Winter Season";
	}
}
