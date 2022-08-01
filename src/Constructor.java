public class Constructor {

    class Person {
        String name;
        int age;
        String sex;


        Person(String name) {
            this.name = name;

        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        Person(String name, int age, String sex) { //생성자를 통해 인스턴스 생성 가능
            this.name = name;
            //this.name 클래스의 멤버변수, name 생성자의 매개변수를 나타냄
            this.age = age;
            this.sex = sex;
        }

    }
        Person person = new Person("박찬현");
        Person person2 = new Person("박찬현", 30);
        Person person1 = new Person("박찬현", 30, "남자");
}
