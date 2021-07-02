package repeat_after_lecture;

public class Main4 {
    public static void main(String[] args) {
        Cover<Iphone> iphoneCover = new Cover<>();

        // даст ошибку
//      iphoneCover.setPhone(new Nokia3310());

        // используем один и тот же класс, обобщая его (параметризируя его) помогает
        // помогает избежать ошибки при множестве типов
        iphoneCover.setPhone(new Iphone());
        Iphone iphoneFromCover = iphoneCover.getPhone();
        iphoneFromCover.createPhoto();

        Cover<Nokia3310> nokia3310Cover = new Cover<>();
        nokia3310Cover.setPhone(new Nokia3310());

        Nokia3310 nokia3310FromCover = nokia3310Cover.getPhone();
        nokia3310FromCover.breakWall();
    }
}
