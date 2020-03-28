package helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//GET
	//URI- /hello-world
	//method - "Hello world"
	//hello-world-string
	@GetMapping(path="/hello-world")
	public String helloWorld()
	{
		return "Hello world";
	}

	//hello-word-bean

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{	
		return new HelloWorldBean("Bean created");
}

	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{	
		return new HelloWorldBean(String.format("Hello %s", name));
}		
	
}