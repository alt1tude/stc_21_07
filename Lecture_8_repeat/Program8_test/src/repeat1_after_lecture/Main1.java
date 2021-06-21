package repeat1_after_lecture;

public class Main1 {
    public static void main(String[] args) {
//        Human artem = new Human("Artem", 32);

        Athlete airat = new Athlete("airat", 22, 5);
        Student student = new Student("Максим", 22, 4.9);
        Programmer programmer = new Programmer("Artem", 32, 3);

        //восходящее преобразование
        Human h1 = airat;
        Human h2 = student;
        Human h3 = programmer;

        //вызывается реализация метода потомка-класс
        //если метод не переопределен - вызывается метод предка
        h1.run();
        h2.run();
        h3.run();
    }
}
