package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")             //добавил
    private Animal animal;

    @Autowired                    //добавил
    private Timer timer;          //добавил

    public Timer getTimer() {     //добавил
        return timer;             //добавил
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());                //исправил new Timer на имя бина (timer),для которого и вызывается метод getTime!Подстава!
        System.out.println("________________________");
    }
}
