class AnimalBase {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogChild extends AnimalBase {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class CatChild extends AnimalBase {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        DogChild d = new DogChild();
        CatChild c = new CatChild();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}