package classes;

public class Train{
    public Integer busNo;
    public String from;
    public String to;
    public Integer distance;
    public String type;
    public Integer fare;

    public Train(Integer busNo, String from, String to, Integer distance, String type ) {
        this.busNo = busNo;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.type = type;
    }

    public void calcFare() {
        if(type.equals("O")){
             fare = 10*distance;
        } else if(type.equals("F")){
             fare = 20*distance;
        } else {
            fare = 24*distance;
        }
    }
}
