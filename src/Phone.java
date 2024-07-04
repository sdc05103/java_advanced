public class Phone {

    String owner;
    String brand;

    public Phone(){};

    public Phone(String owner,String brand){
        this.owner = owner;
        this.brand = brand;
    };


    public void buyPhone(){
        System.out.println(owner + "님이 " + brand + "폰을 구매했습니다.");
    }

    public void turnOn(){
        System.out.println(owner + "님이 " + brand + "폰을 켰습니다.");
    }


}
