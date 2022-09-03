public class Main {
    public static void main(String[] args) {

        Dog object1 = new Dog("Kral",12,"Kangal");
        object1.setName("Yeni isim");
        object1.toStringg();
        object1.equals("Yeni isim " , 12,"Kangal;");
        Cat object2 = new Cat("Zemi",1,"Scot");
        object2.setAge(0);
        object2.toStringg();
        object2.equals("Zemi",0,"Scot");
        Bird object3 = new Bird("Mavis",9,"Muhabbet");
        object3.setBreed("ACXASDAWDASDW");
        object3.toStringg();

    }
}
