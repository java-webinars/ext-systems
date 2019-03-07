package javacourse.greet;

import javacourse.net.Greetable;

public class DayGreet extends Greetable
{
    @Override
    public String buildResponse(String userName) {
        return "Good day, " + userName;
    }
}
