package com.group1.data.program;

public class userdata {
    private String input;

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static void read() {
        data.stringUserInput = data.userInput.nextLine();
    }
}
