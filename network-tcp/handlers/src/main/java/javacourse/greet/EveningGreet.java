package javacourse.greet;

import javacourse.net.Greetable;

public class EveningGreet extends Greetable
{
    @Override
    public String buildResponse(String userName) {
        return "Good evening, " + userName;
    }
}
