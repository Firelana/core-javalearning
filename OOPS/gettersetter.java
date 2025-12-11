class cars {
    private String car;
    private int speed;

    // getter 
    public String getcar(){
        return car;
    }
    public int  getspeed(){
        return speed;
    }

    // Setter
    public void setcar(String carname){
        car = carname;
    }
    public void setspeed(int speedno){
        speed = speedno;
    }
}

public class testing {
    public static void main(String[] args) {
        cars c = new cars();
        c.setcar("Mercedes-AMG GT Black Series");
        c.setspeed(325);
    
        System.out.println(c.getcar()+ " from Germany");
        System.out.println(c.getspeed()+"mph");
    }
}
