package repeat_after_lecture;

public class Main {

    public static void main(String[] args) {
        CoverForIphone coverForIphone = new CoverForIphone();
        Iphone iphone = new Iphone();

        coverForIphone.setPhone(iphone);

        Iphone iPhoneFromCover = coverForIphone.getPhone();
        iPhoneFromCover.createPhoto();

        CoverForNokia3310 coverForNokia3310 = new CoverForNokia3310();
        Nokia3310 nokia3310 = new Nokia3310();

        coverForNokia3310.setPhone(nokia3310);
        Nokia3310 nokia33101FromCover= coverForNokia3310.getNokia3310();
        nokia33101FromCover.breakWall();
    }
}
