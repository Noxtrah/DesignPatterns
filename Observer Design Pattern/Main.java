//Doğa Kayra Yılmazarslan
public class Main {
    public static void main(String[] args){
        Channel channel = new Channel("Veritasium");
        Channel channel1 = new Channel("Minute Physics");
        Subscriber subscriber1 = new Subscriber("Elena",channel);
        Subscriber subscriber2 = new Subscriber("Derek", channel);
        Membership membership1 = new Membership("Gale", channel1);
        Membership membership2 = new Membership("Lane", channel1);


        channel.registerObservers(subscriber1);
        channel.registerObservers(subscriber2);
        channel1.registerObservers(membership1);
        channel1.registerObservers(membership2);
        channel.notifyObservers();
        channel1.notifyObservers();




    }
}
