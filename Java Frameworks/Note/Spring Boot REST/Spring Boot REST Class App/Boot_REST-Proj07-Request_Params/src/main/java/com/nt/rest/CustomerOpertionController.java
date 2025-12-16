package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOpertionController {
	// ===============================================================
	// 1) Mandatory params using primitive types
	// → This endpoint reads required cno & cname and returns them.
	// ===============================================================

//		@GetMapping("/report")
//		public ResponseEntity<String> process(@RequestParam("cno") int no,
//											  @RequestParam("cname") String name){
//			System.out.println(no + "----------" + name);
//			return new ResponseEntity<String>(no + "----------" + name, HttpStatus.OK);
//		}


	// ===============================================================
	// 2) Mandatory params using wrapper types
	// → This endpoint accepts required customer number & name, prints
	//   them and returns the same values.
	// ===============================================================

//		@GetMapping("/report")
//		public ResponseEntity<String> process(@RequestParam Integer cno,
//											  @RequestParam String cname){
//			System.out.println(cno + "----------" + cname);
//			return new ResponseEntity<String>(cno + "----------" + cname, HttpStatus.OK);
//		}


	// ===============================================================
	// 3) Optional parameters (required = false)
	// → This endpoint allows both parameters to be optional; if not 
	//   provided, null values are returned as output.
	// ===============================================================

//		@GetMapping("/report")
//		public ResponseEntity<String> process(@RequestParam(required=false) Integer cno,
//											  @RequestParam(required=false) String cname){
//			System.out.println(cno + "----------" + cname);
//			return new ResponseEntity<String>(cno + "----------" + cname, HttpStatus.OK);
//		}


	// ===============================================================
	// 4) Optional parameters with default values
	// → This endpoint uses default values (1010, Kanha) when parameters
	//   are not supplied and returns the final values.
	// ===============================================================

	@GetMapping("/report")
	public ResponseEntity<String> process(
			@RequestParam(required = false, defaultValue = "1010") Integer cno,
			@RequestParam(required = false, defaultValue = "Kanha") String cname) {

		System.out.println(cno + "----------" + cname);
		return new ResponseEntity<String>(cno + "----------" + cname, HttpStatus.OK);
	}

}
