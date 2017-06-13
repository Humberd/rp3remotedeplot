package pl.humberd.rp3test

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun helloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Its working");
    }
}

