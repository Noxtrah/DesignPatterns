//Doğa Kayra Yılmazarslan
public class Subscriber implements Observer {
    String name;
    Channel channel;
    public Subscriber(String name, Channel channel_name){
        this.name = name;
        this.channel = channel_name;
    }

    @Override
    public void update() {
        System.out.println("Wake up " + name + "!! " + channel.getChannel_name()+ " uploaded new video." );
    }
}
