public class RunningClock extends MyDevice//timeisRunningOut
{
    private int maxSpeedmph;   
    private double wakeUpTime; //ex. 8:30 == 8.30
    private String[] whereToGo = new String[]{"Circle", "Under the bed", "hide", "in a drawer"};

    public RunningClock(String type, int memory, int maxSpeedmph, double wakeUpTime){
        super(type, memory);
        this.maxSpeedmph = maxSpeedmph;
        this.wakeUpTime = wakeUpTime;
    }

    public String whereItGoes(){
        int n = (int) (Math.random() * 3);
        System.out.println(whereToGo[n]);
        return whereToGo[n];
    }

    public String toString(){
        String out = "";
        out += "Wake Up Time: " + this.wakeUpTime;
        out += "maxSpeedmph: " + this.maxSpeedmph;
        out += whereItGoes();
        return out;
    }
}