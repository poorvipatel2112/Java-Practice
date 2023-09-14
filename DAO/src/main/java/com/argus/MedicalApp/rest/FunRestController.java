package com.argus.MedicalApp.rest;

import com.argus.MedicalApp.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach mycoach;

//    public FunRestController(Coach coach) {
//        mycoach = coach;
//    }


//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return mycoach.getDailyWorkout();
//    }

    @GetMapping("/getdailyworkout")
        public String getDailyWorkout(){
            return mycoach.getDailyWorkout();
    }

    @Autowired
    public void doSomeStuff(@Qualifier("cricketCoach") Coach theCoach){
        mycoach = theCoach;
    }


    @GetMapping("/")
    public String sayHello(){
        return "Hey There!!!";
    }

//    @PostConstruct
//    public void doMyStartUpWork(){
//        System.out.println("this function performs " + getClass().getSimpleName());
//    }
//
//    @PreDestroy
//    public void doMYCleanUpWork(){
//        System.out.println("this function does " + getClass().getSimpleName());
//    }

//    @GetMapping("/new")
//    public String newPage(){
//        return "This is new page";
//    }

//    @Value("${coach.name}")
//    private String name;
//
//    @Value("${peer.name}")
//    private String peerName;
//
//    @GetMapping("/teaminfo")
//    public String teanInfo(){
//        return "peer names are " + name + " and " + peerName;
//    }



}
