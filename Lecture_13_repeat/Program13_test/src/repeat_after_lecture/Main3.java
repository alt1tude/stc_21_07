package repeat_after_lecture;

public class Main3 {
    public static void main(String[] args) {
        CoverForObject coverForObject = new CoverForObject();

        Nokia3310 nokia3310 = new Nokia3310();
        Iphone iphone = new Iphone();

        // про проблему, про ошибку преобразования(лежит nokia3310), а преобразовываем к (Iphone)
        coverForObject.setPhone(nokia3310);
        Iphone iphoneFromCover = (Iphone) coverForObject.getPhone();



//        coverForObject.setPhone(nokia3310);
//        Nokia3310 nokia3310FromCover = (Nokia3310) coverForObject.getPhone();
//        nokia3310FromCover.breakWall();
//
//        coverForObject.setPhone(iphone);
//        Iphone iphoneFromCover = (Iphone) coverForObject.getPhone();
//        iphoneFromCover.createPhoto();

    }
}
