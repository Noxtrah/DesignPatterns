//Doğa Kayra Yılmazarslan
public class Membership implements Observer{
    String name;
    Channel channel;

    public Membership(String name, Channel channel_name){
        this.name = name;
        this.channel = channel_name;
    }

    @Override
    public void update() {
        System.out.println("Wake up " + name + "!! " + channel.getChannel_name()+ " uploaded new video without ads for members." );
    }
}
