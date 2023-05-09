//Doğa Kayra Yılmazarslan
import java.util.LinkedList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers = new LinkedList<>();
    String channel_name;

    public Channel(String channel_name){
        this.channel_name = channel_name;
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getChannel_name() {
        return channel_name;
    }
}
