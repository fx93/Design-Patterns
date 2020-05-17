public class RoomTelescopic1 {

    String electricity;
    Boolean doorDelivery;
    String guideAssistance;
    String entertainment;

    public RoomTelescopic1(String electricity){
        this.electricity=electricity;
    }

    public RoomTelescopic1(String electricity, Boolean doorDelivery){
        this(electricity);
        this.doorDelivery=doorDelivery;
    }

    public RoomTelescopic1(String electricity, Boolean doorDelivery, String guideAssistance){
        this(electricity, doorDelivery);
        this.guideAssistance=guideAssistance;
    }

    public RoomTelescopic1(String electricity, Boolean doorDelivery, String guideAssistance, String entertainment){
        this(electricity, doorDelivery, guideAssistance);
        this.entertainment=entertainment;
    }

    @Override
    public String toString() {
        return "RoomTelescopic1{" +
                "electricity='" + electricity + '\'' +
                ", doorDelivery=" + doorDelivery +
                ", guideAssistance='" + guideAssistance + '\'' +
                ", entertainment='" + entertainment + '\'' +
                '}';
    }
}
