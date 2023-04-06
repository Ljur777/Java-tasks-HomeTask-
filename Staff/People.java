package Staff;

public class People {
    private String name;
    private int age;
    private String male;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public People(String name, int age, String male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
}

class Manager extends People{
    public Manager(String name, int age, String male) {
        super(name, age, male);
    }
}
class SeniorDev extends People{
    public SeniorDev(String name, int age, String male) {
        super(name, age, male);
    }
}
class MiddleDev extends People{
    public MiddleDev(String name, int age, String male) {
        super(name, age, male);
    }
}

class JuniorDev extends People{
    public JuniorDev(String name, int age, String male) {
        super(name, age, male);
    }
}

class TeamLead extends People{
    public TeamLead(String name, int age, String male) {
        super(name, age, male);
    }
}
class CTO extends People{
    public CTO(String name, int age, String male) {
        super(name, age, male);
    }
}



