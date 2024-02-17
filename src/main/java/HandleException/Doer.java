package HandleException;

import org.w3c.dom.events.EventException;

public class Doer {

    private int number;
    public Doer(int number) {
        this.number = number;
    }

    public void doSomething() throws Exception{
        if(number%2 == 0){
            throw new EvenNumberException("Even number found");
        }
    }
}
