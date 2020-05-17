

public class RoomTelescopic2 {

    String electricity;
    Boolean doorDelivery;
    String guideAssistance;
    String entertainment;

    public RoomTelescopic2(String electricity, Boolean doorDelivery, String guideAssistance, String entertainment) {
        this.electricity = electricity;
        this.doorDelivery = doorDelivery;
        this.guideAssistance = guideAssistance;
        this.entertainment = entertainment;
    }

    public RoomTelescopic2(String electricity, Boolean doorDelivery, String guideAssistance) {
        this(electricity, doorDelivery, guideAssistance, null);
    }

    public RoomTelescopic2(String electricity, Boolean doorDelivery) {
        this(electricity, doorDelivery, null);
    }

    public RoomTelescopic2(String electricity) {
        this(electricity, null);
    }

    @Override
    public String toString() {
        return "RoomTelescopic2{" +
                "electricity='" + electricity + '\'' +
                ", doorDelivery=" + doorDelivery +
                ", guideAssistance='" + guideAssistance + '\'' +
                ", entertainment='" + entertainment + '\'' +
                '}';
    }
}
