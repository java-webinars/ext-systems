package edu.javacourse.greet;

import edu.javacourse.net.Greetable;

public class DayGreet extends Greetable
{
    @Override
    public String buildResponse(String userName) {
        return "Good day, " + userName;
    }
}
