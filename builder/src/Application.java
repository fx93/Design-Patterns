
// builder pattern can be used to achieve Immutability
public class Application {

    public static void main(String[] args) {

        RoomTelescopic1 roomTelescopic1=new RoomTelescopic1("whole day");
        System.out.println(roomTelescopic1);

        RoomTelescopic2 roomTelescopic2=new RoomTelescopic2("only night");
        System.out.println(roomTelescopic2);

        Room.Builder builder=new Room.Builder("whole day");
        Room room=builder.doorDelivery(true).entertainment("netflix").build();

        System.out.println(room);

    }
}
