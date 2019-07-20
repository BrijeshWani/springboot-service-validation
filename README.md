# springboot-service-validation
This project explains usage of @Validated with @Service.

Validation in service layer can be used as below,

```java
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
```

If you are caaling this method from some controller then, controller will be  executed but service method will not be called.