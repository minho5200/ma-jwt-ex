package com.ma.jwttest.controller;

import com.ma.jwttest.dto.SignReqDto;
import com.ma.jwttest.dto.SignResDto;
import com.ma.jwttest.repository.MemberRepository;
import com.ma.jwttest.service.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SignController {

    private final MemberRepository memberRepository;
    private final SignService memberService;

    @GetMapping(value = "/test")
    public String test(){
        return "?????";
    }

    @PostMapping(value = "/login")
    public ResponseEntity<SignResDto> signin(@RequestBody SignReqDto request) throws Exception {
        return new ResponseEntity<>(memberService.login(request), HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Boolean> signup(@RequestBody SignReqDto request) throws Exception {
        return new ResponseEntity<>(memberService.register(request), HttpStatus.OK);
    }

    @GetMapping("/user/get")
    public ResponseEntity<SignResDto> getUser(@RequestParam String account) throws Exception {
        return new ResponseEntity<>( memberService.getMember(account), HttpStatus.OK);
    }

    @GetMapping("/admin/get")
    public ResponseEntity<SignResDto> getUserForAdmin(@RequestParam String account) throws Exception {
        return new ResponseEntity<>( memberService.getMember(account), HttpStatus.OK);
    }
}