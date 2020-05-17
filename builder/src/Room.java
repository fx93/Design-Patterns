

public class Room {

    private final String electricity;
    private final Boolean doorDelivery;
    private final String guideAssistance;
    private final String entertainment;

    public Room(Builder builder) {
        this.electricity=builder.electricity;
        this.doorDelivery=builder.doorDelivery;
        this.guideAssistance=builder.guideAssistance;
        this.entertainment=builder.entertainment;
    }

    @Override
    public String toString() {
        return "Room{" +
                "electricity='" + electricity + '\'' +
                ", doorDelivery=" + doorDelivery +
                ", guideAssistance='" + guideAssistance + '\'' +
                ", entertainment='" + entertainment + '\'' +
                '}';
    }

    static class Builder{
        private String electricity;
        private Boolean doorDelivery;
        private String guideAssistance;
        private String entertainment;


        public Room build(){
            return new Room(this);
        }


        public Builder(String electricity){
            this.electricity=electricity;
        }

        public Builder doorDelivery(Boolean doorDelivery){
            this.doorDelivery=doorDelivery;
            return this;
        }

        public Builder guideAssistance(String guideAssistance){
            this.guideAssistance=guideAssistance;
            return this;
        }

        public Builder entertainment(String entertainment){
            this.entertainment=entertainment;
            return this;
        }
    }
}
