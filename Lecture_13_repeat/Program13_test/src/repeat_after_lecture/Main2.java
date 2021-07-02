package repeat_after_lecture;

public class Main2 {
    public static void main(String[] args) {
        CoverForObject coverForObject = new CoverForObject();

        Nokia3310 nokia3310 = new Nokia3310();
        Iphone iphone = new Iphone();

        // принимает в себя объекты от потомков
        coverForObject.setPhone(nokia3310);
        Nokia3310 nokia3310FromCover = (Nokia3310) coverForObject.getPhone();
        nokia3310FromCover.breakWall();

        coverForObject.setPhone(iphone);
        Iphone iphoneFromCover = (Iphone) coverForObject.getPhone();
        iphoneFromCover.createPhoto();
    }
}
