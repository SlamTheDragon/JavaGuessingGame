package com.group1.data.lang;

import com.group1.data.program.data;

public class quizLog {
    public static final String[] quizQuestion = new String[] {
        "[QUIZ] \"Incredible... *clears throat*\"",
        "[QUIZ] \"have I mentioned to you that you're being timed...?\"",
        "[QUIZ] \"This is getting intense... or is it?\"",
        "[QUIZ] \"Is that... french fries?\"",
        "[QUIZ] \"Awesome! Here's the question.\""
    };

    public static final String[] quizWrong = new String[] {
        "[INCORRECT] \"I cant give you hints but I think that question was easy\"",
        "[INCORRECT] \"hmmmm... typo?\"",
        "[INCORRECT] \"Uoh... try again " + data.username.getInput() + "\"",
        "[INCORRECT] \"wrong_answer.mp3\"",
        "[INCORRECT] \"That was intense... but try again!\""
    };

    public static final String[] quizEnds = new String[] {
        "[QUIZ] \"Good job, " + data.username.getInput() + "!\"",
        "[QUIZ] \"Well done, great... Here's your price :D\"",
        "[QUIZ] \"There's no way you beat that... oh well\"",
        "[QUIZ] \"Woah! What?\"",
        "[QUIZ] \"Oh maidens...\""
    };
}
