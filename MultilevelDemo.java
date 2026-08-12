class AnimalParent {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogChild extends AnimalParent {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class PuppyChild extends DogChild {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        PuppyChild p = new PuppyChild();

        p.eat();
        p.bark();
        p.weep();
    }
}