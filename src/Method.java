public class Method {

    public static void main(String[] args) {

        Dog dog = new Dog("춘식");
        dog.eat("개밥");
        dog.running();
    }
}
    class Dog {
        String name;


        Dog(String name) {
            this.name = name;
        }

        void eat(String food) {
            System.out.println(food + "을 먹는다");

        }

        static void running() { //정적메소드
            System.out.println("달린다");
        }
    }


