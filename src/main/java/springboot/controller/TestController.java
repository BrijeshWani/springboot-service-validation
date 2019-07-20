package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.service.TestService;

@RestController
@RequestMapping("/service-validations")
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/validate/{name}")
	public @ResponseBody ResponseEntity<Boolean> validationTest(final @PathVariable("name") String name) {
		testService.validationTestMethod(name);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

}
