public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;
    //...

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        if(this.age < 0){
            throw new IllegalArgumentException ("Данные не корректны");
        }
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return  this;
    }
    public Person build(){
        Person person = new Person(name,surname,age,adress);
        if(name != null && surname != null){
            return person;
        } else {
            throw new IllegalStateException ("Введены не все данные");
        }
    }
}