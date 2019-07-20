package springboot.service;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class TestService {

	public void validationTestMethod(@Size(min = 5, max = 10) String name) {
		System.out.println("Valid name printed: " + name);
	}

}
