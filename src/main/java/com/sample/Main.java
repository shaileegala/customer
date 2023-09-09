package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import com.sample.Customer;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(Main.class, args);
    }
    /*@GetMapping("/greet/")
    public GreetResponse greet(){
        return new GreetResponse(
                "Hello",
                new Person("Alex", "alex@test.com", "6823346756", 34, 30_000),
                List.of("Harry Potter", "Fast and Furious", "Ghost Busters", "Batman"));
    }*/

    //records are classes that allows us to achieve immutability

    /*record Person(String name, String email, String phone, int age, double savings){

    }
    record GreetResponse(
            String greet,
            Person person,
            List<String> favoriteMovies

    ){}*/

    /*class GreetResponse{
        private final String greet;

        GreetResponse(String greet) {
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }
    }*/
}
