package repeate2_after_lecture.observer_light;

public class ExitButton  implements Button {

    private ClickReaction reaction;

    @Override
    public void onClick(ClickReaction reaction) {
        this.reaction = reaction;
    }

    @Override
    public void click() {
        System.out.println("Выходи из программы");
        reaction.handle();
    }
}
