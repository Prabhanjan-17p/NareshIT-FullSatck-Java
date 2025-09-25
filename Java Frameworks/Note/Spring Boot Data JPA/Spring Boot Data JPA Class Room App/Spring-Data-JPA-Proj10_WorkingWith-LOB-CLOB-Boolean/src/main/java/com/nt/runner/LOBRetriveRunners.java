package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageService;

@Component
public class LOBRetriveRunners implements CommandLineRunner {
	@Autowired
	private IMarriageService service;

	@Override
	public void run(String... args) throws Exception {
		//For Oracle
//		try (Scanner sc = new Scanner(System.in)) {
//
//			System.out.print("Enter ID: ");
//			Integer id = sc.nextInt();
//
//			MarriageSeeker seeker = service.showById(id);
//
//			System.out.println(seeker.getId() + "----" + seeker.getName() + "----" + seeker.getDob() + "----"
//					+ seeker.getIsSingle());
//
//			// Fetch Photo 
//			try (FileOutputStream fos = new FileOutputStream("newPhoto.jpg")) {
//				fos.write(seeker.getPhotoCandidate());
//				fos.flush();
//			}
//
//			// Fetch Resume
//			try (FileWriter fw = new FileWriter("newBio.txt")) {
//				fw.write(seeker.getResumeCandidate());
//				fw.flush();
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//For MYSQL
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter ID: ");
			Integer id = sc.nextInt();

			MarriageSeeker seeker = service.showById(id);

			System.out.println(seeker.getId() + "----" + seeker.getName() + "----" + seeker.getDob() + "----"
					+ seeker.getIsSingle());

			// Fetch Photo 
			try (FileOutputStream fos = new FileOutputStream("newPhoto1.jpg")) {
				fos.write(seeker.getPhotoCandidate());
				fos.flush();
			}

			// Fetch Resume
			try (FileWriter fw = new FileWriter("newBio1.txt")) {
				fw.write(seeker.getResumeCandidate());
				fw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
