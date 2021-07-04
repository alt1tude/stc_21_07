package repeat_after_lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // несмотря на то, что Animal - предок тигров и волков и т.д.
    // List<Animal> не является предком List<Tiger>, List<Wolf>
    // java не позволяет передать подтипы
    public static void forAnimalList(List<Animal> animals) {
        for (int i = 0; i < animals.size(); ++i) {
            Animal animal = animals.get(i);
            animal.who();
        }
        animals.add(new Wolf());
        animals.add(new Dog());
    }
    // для тестов, про метод, которые есть только у Dog
    // если например сначала вызвать forAnimalList c параметром List<Dog>
    // то forAnimalList может добавить например волка, что логично, потому что волк потомок Animal
    // но тогда список будет поврежден, и среди собак окажется волк
    // а у волка нет метода sidDown() и будет ошибка
    public static void forDogsList(List<Dog> dogs) {
        for (int i = 0; i < dogs.size(); ++i) {
            Dog dog = dogs.get(i);
            dog.sitDown();
        }
    }

    // Raw - "сырой" список, без параметров, в него можно передать передать Animal и всех предков Animal cooтв.
    // можно передать какой угодно список - List является предком всех других списков
    public static void forRawList(List list) {
        for (int i = 0; i < list.size(); ++i) {
            Object object = list.get(i);
            // но тут может все сломаться, неизвестно какого типа на самом деле объект
            // если например, передать список, который не сможет быть преобразован к Animal
            // raw-типы не рекомендуется использовать вообще
            ((Animal)object).who();
        }
        // отличия от WildCards: можно добавить в список любой объект -> поломать список
        // поэтому так же не рекомендуетяс использовать raw-тип
//        list.add(new Wolf());
//        list.add(new Scanner(System.in));
    }
    // так же как и с List<Animal> - нельзя класть не один список, который не Object
    public static void forObjectsList(List<Object> objects) {
        for (int i = 0; i < objects.size(); ++i) {
            Object object = objects.get(i);
            Animal animal = (Animal) object;
            animal.who();
        }
    }

    // List<?> как и просто List является предком всех списков
    // используем тогда, когда не важно, что там за объекты - работаем с Object
    // добавлять ничего нельзя, поэтому этот метод ничего не поломает в качестве побочного эффекта
    public static void forWildCardList(List<?> list) {
        for (int i = 0; i < list.size(); ++i) {
            Object object = list.get(i);
//            ((Animal)object).who();
            System.out.println(object.toString());
        }
        // отличия от raw: нельзя ничего добавлять
//        list.add(new Animal());
//        list.add(new Scanner(System.in));
    }

    // UPPERBOUNDS - ограничения сверху
    // могу передавать списки из самого объекта и его потомков
    public static void forUpperBoundsDogsList(List<? extends Dog> dogs) {
        for (int i = 0; i < dogs.size(); ++i) {
            Dog dog = dogs.get(i);
            dog.sitDown();
        }
        // нельзя ничего класть в список, чтобы ничего не поломать
//        dogs.add(new Dog());
//        dogs.add(new GoodDog());
    }
    // LOWERBOUNDS
    // принимает все списки, объекты которых предки Wolf
    public static void forLowerBoundsWolvesList(List<? super Wolf> list) {
        for (int i = 0; i < list.size(); ++i) {
            // ничего кроме object получить нельзя
//            Wolf wolf = list.get(i);
//            Animal animal = list.get(i);
            Object object = list.get(i);
            // нельзя класть объекты, которые не являются потомками Wolf
            list.add(new Wolf());
            list.add(new Dog());
            list.add(new GoodDog());
//            list.add(new Tiger());
//            list.add(new Animal());
        }
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        Wolf wolf = new Wolf();
        Dog dog = new Dog();
        GoodDog goodDog = new GoodDog();

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);
        animals.add(goodDog);

        // можно класть сам объект и его потомков, и по связи дальше - потомков потомка(goodDog extends Dog)
        List<Tiger> tigers = new ArrayList<>();
        tigers.add(tiger);

        List<Wolf> wolves = new ArrayList<>();
        wolves.add(wolf);
        wolves.add(dog);
        wolves.add(goodDog);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(goodDog);

        forAnimalList(animals);
//        forAnimalList(tigers);
//        forAnimalList(wolves);

        List<Scanner> scanners = new ArrayList<>();
        scanners.add(new Scanner(System.in));
        forRawList(animals);
        forRawList(dogs);
//        forRawList(scanners);

        System.out.println("WILDCARDS");
        forWildCardList(animals);
        forWildCardList(wolves);
//        forWildCardList(scanners);

        forUpperBoundsDogsList(dogs);


        forLowerBoundsWolvesList(animals);
        forLowerBoundsWolvesList(wolves);
//        forLowerBoundsWolvesList(tigers);

    }
}
