package repeate2_after_lecture.observer_light;

// Наблюдаемый объект - Observable
public interface Button {
    // задать реакцию на нажатие кнопки
    void onClick(ClickReaction reaction);
    // нажатие
    void click();

}
