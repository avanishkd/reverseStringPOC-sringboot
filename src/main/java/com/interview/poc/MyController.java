package com.interview.poc;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MyController {

	@GetMapping("reverse/{myString}")
	public String getTrackById(@PathVariable(value = "myString") String myString) {
		return reverseString(myString);
	}

	public String reverseString(String myStr) {
		if ((myStr == null) || (myStr.length() <= 1))
			return myStr;
		return reverseString(myStr.substring(1)) + myStr.charAt(0);

	}

}
