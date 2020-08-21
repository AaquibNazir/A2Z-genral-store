package com.a2z.store.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
public class UserController {

	@GetMapping("/sign-in")
	String signIn() {
		System.out.println("Somebody signed in");
		return " welcome to sign-in page of A2Z";
	}
	
	@PostMapping("/sign-up")
	User signUp(@Valid@RequestBody User user) {

//		userService.signUpUser(user);

		return user;
	}

	@GetMapping("/confirm")
	String confirmMail(@RequestParam("token") String token) {

		
		
		/*Optional<ConfirmationToken> optionalConfirmationToken = confirmationTokenService.findConfirmationTokenByToken(token);

		optionalConfirmationToken.ifPresent(userService::confirmUser);
*/
		return "/sign-in";
	}

}