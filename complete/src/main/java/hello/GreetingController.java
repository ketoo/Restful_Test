package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
	private final String template = "The letters are: '%s'. The most frequent letter is '%c', and the frequency is %d";

    //http://localhost:8080/counting?inputStr=111wrewrWWS
    @RequestMapping("/")
    public String Counting(@RequestParam(value="inputStr") String inputStr)
    {
    	Greeting greeting = new Greeting(inputStr);
    	greeting.Counting();

    	return String.format(template, greeting.getContent(), greeting.getFrequentData(), greeting.getFrequency());
    }
}
