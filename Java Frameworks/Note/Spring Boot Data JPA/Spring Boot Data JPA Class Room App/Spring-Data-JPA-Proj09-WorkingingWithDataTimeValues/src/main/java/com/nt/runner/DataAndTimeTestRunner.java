package com.nt.runner;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.IArtistMgmtService;
@Component
public class DataAndTimeTestRunner implements CommandLineRunner {
	@Autowired
	private  IArtistMgmtService  artistService;

	@Override
	public void run(String... args) throws Exception {
		/*	try {
				LocalDate  dob= LocalDate.of(1990, 10,20);
				LocalTime  tob=LocalTime.of(20, 20);
				LocalDateTime  doj=LocalDateTime.of(2015, 11, 20, 11,11);
				 Artist artist=new Artist("mahesh","hyd",dob,tob,doj);
				String msg=artistService.registerArtist(artist);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				artistService.showAllArtists().forEach(System.out::println);
				System.out.println("========================");
				Artist  artist=artistService.showArtistById(41);
				System.out.println("Artist information::"+artist);
				//converting   DOB  into  some date pattern value
				LocalDate  dob=artist.getDob();
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
				String  fdob=dob.format(formatter);
				System.out.println("Formated date::"+fdob);
				System.out.println("------------------------------");
				LocalTime  tob=artist.getTob();
				DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
				String ftob=tob.format(formatter1);
				System.out.println("Formatted time ::"+ftob);
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*try {
			System.out.println("Artist age ::"+artistService.showArtistAgeById(1000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			String  msg=artistService.showArtirstExperienceById(41);
			String  msg1=msg.substring(0, msg.indexOf(' '));
			System.out.println(msg1);
			double  exp=Double.parseDouble(msg1)/365.25;
			System.out.println("Artist Experience ::"+exp);
					}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
