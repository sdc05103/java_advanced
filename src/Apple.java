public class Apple extends Phone {

    public Apple(String owner) {
        super(owner, "애플");
    }

    @Override
    public void turnOn(){
        System.out.println(owner + "님이 " + brand + "폰을 켰습니다.");
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }

}
