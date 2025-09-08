package com.jonasesteves.comments.moderation.api.controller;

import com.jonasesteves.comments.moderation.api.model.ModerationInput;
import com.jonasesteves.comments.moderation.api.model.ModerationOutput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("api/moderate")
public class ModerationController {

    private static final String[] FORBIDDEN_WORDS = {"ódio", "xingamento"};
    private static final String ALLOWED_REASON = "The comment has been approved.";
    private static final String REJECTED_REASON = "The comment has been rejected because it contains prohibited words.";

    @PostMapping
    public ModerationOutput moderate(@RequestBody ModerationInput input) {

//        try {
//            Thread.sleep(Duration.ofSeconds(5));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        if (isAllowed(input.getText())) {
            return new ModerationOutput(true, ALLOWED_REASON);
        }
        return new ModerationOutput(false, REJECTED_REASON);
    }

    private static boolean isAllowed(String text) {
        for (String forbidden : FORBIDDEN_WORDS) {
            if (text.toLowerCase().contains(forbidden.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
