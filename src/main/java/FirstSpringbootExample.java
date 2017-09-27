import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangfeng on 07/09/2017.
 */
@RestController
@EnableAutoConfiguration
public class FirstSpringbootExample {

  @RequestMapping("/")
  String home() {
    return "hello world!";
  }

  @RequestMapping("/you")
  String home2() {
    return "hello you";
  }

  public static void main(String[] args) {
    SpringApplication.run(FirstSpringbootExample.class, args);
  }

}
