import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected final String adress;

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public boolean hasAge() {
        if(getAge().equals(0))
            return false;
        else
            return true;
    }
    public boolean hasAddress() {
        if (getAddress() == null)
            return false;
        else
            return true;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }
    public String getAddress() {
        return adress;
    }


    public void happyBirthday() {
        if(hasAge()){
            age ++;
        }
    }

    @Override
    public String toString() {
        return "Имя " + name + " Фамилия "+ surname + " возраст " + age + " Страна " + adress;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.adress)
                .setAge(0);
        return person;
    }
}
