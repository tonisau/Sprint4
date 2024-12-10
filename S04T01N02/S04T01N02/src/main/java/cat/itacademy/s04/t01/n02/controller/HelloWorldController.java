package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hello "+ name+". Estàs executant un projecte Gradle";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name){
        return "Hello " + (name == null ? "UNKNOWN" : name) + ". You're running a Gradle project.";
    }

}
