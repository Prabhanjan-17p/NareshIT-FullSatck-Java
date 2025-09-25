package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageService;


//@Component
public class LOBInsertRunners implements CommandLineRunner {
	@Autowired
	private IMarriageService service;

	@Override
	public void run(String... args) throws Exception {
	    try (Scanner sc = new Scanner(System.in)) {

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
	        LocalDate dob = LocalDate.parse(sc.nextLine());

	        System.out.print("Is Single? (true/false): ");
	        Boolean isSingle = Boolean.parseBoolean(sc.nextLine());

	        System.out.print("Enter Photo File Path: ");
	        String photoPath = sc.nextLine();
	        //byte[] photoBytes = Files.readAllBytes(Paths.get(photoPath));  // 1
	        FileInputStream fis = new FileInputStream(photoPath); // 2
	        int size = fis.available();
	        byte[] photoBytes = new byte[size];
	        photoBytes = fis.readAllBytes();

	        System.out.print("Enter Resume File Path: ");
	        String resumePath = sc.nextLine();
	        //char[] resumeChars = new String(Files.readAllBytes(Paths.get(resumePath))).toCharArray(); // 1
	        File file = new File(resumePath);
	        int sizeres = (int) file.length();
	        FileReader fr = new FileReader(file);
	        char[] resumeChars = new char[sizeres];
	        fr.read(resumeChars);

	        // Create entity object
	        MarriageSeeker seeker = new MarriageSeeker(name, dob, isSingle, photoBytes, resumeChars);

	        String msg = service.insertMarriageSeeker(seeker);

	        System.out.println(msg);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
