public class Samsung extends Phone{


    public Samsung(String owner) {
        super(owner, "삼송");
    }

    @Override
    public void turnOn(){
        System.out.println(owner + "님이 " + brand + "폰을 켰습니다.");
        System.out.println("*** 폰 켜지는 중 ***");
    }

}
