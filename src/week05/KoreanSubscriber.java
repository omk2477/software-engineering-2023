package week05;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landCh;

    public KoreanSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    public void update() {
        this.value = landCh.getPrice();
        System.out.println(this.name + "님 가격이 " + this.value + "원으로 변경되었습니다.");
    }
}
