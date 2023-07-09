@RestController
public class HelloController
{
	@RequestMapping("/hello")
	public String helloDemo()
	{
		return "hello deepak....!!";
	}
}