package com.youngman.controller;

import com.youngman.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YoungMan on 2019-08-24.
 */

@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("iyoungman", "iyoungman@gmail.com");
    }
}
