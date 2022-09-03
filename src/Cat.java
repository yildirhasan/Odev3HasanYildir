public class Cat extends Animal {
    String breed;
    int humanYears;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    @Override
    public void toStringg(){
        System.out.print("\n"+"Name:"+getName()+"\n"+"Breed:"+getBreed()+"\n"
                +"Age in Calendar Years:"+getAge()+"\n"+"Age in Human Years:"
                + getAgeInHumanYears(getAge()) +"\n");
    }
    @Override
    public int getAgeInHumanYears(int a) {
        int b;
        if (a <= 2) {
            b = a + 11;
        } else {
            b = (22 + ((a - 2) * 5));
        }

        humanYears = b;
        return b;
    }

    public boolean equals(String name, int age, String breed) {
        if (getName().equals(name) && (getAge() == age) && this.breed.equals(getBreed())) {
            System.out.println("Degerler dogru sekilde eslesti ");
            return true;
        } else {
            System.out.println("Eslesmede hata bulunmaktadir");
            return false;
        }
    }
}
