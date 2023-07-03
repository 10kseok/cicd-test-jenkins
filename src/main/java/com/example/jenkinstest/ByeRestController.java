package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {설명을 작성해주세요}
 *
 * @author koesnam
 * @since 2023/07/03
 */

@RestController
public class ByeRestController {
    @GetMapping
    public String sayBye() {
        return "Bye";
    }

    @GetMapping("v2")
    public String sayBye2() {
        return "good Bye, bro";
    }
}
