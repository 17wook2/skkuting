package skkumet.skkuting.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import skkumet.skkuting.dto.UserAccountDto;
import skkumet.skkuting.dto.UserAccountPrincipal;
import skkumet.skkuting.service.UserMeetupRelService;

@RequiredArgsConstructor
@RequestMapping("/meetup")
@RestController
public class UserMeetupRelController {

    private final UserMeetupRelService userMeetupRelService;

    @RequestMapping("/{meetupId}/join")
    @PostMapping
    public void join(@AuthenticationPrincipal UserAccountPrincipal userAccountPrincipal, @PathVariable Long meetupId){
//        userMeetupRelService.join(userAccountPrincipal.todto(), meetupId);
    }


}
