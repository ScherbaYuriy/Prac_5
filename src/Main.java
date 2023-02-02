class Main {
    public static void main(String[] args) {


        Astronavt astronavt = new Astronavt("Yra", 18, 70, 3);

        SpaceModule spaceModule = new SpaceModule("Apolo", 70, 1000);

        SpaceStation spaiseStation = new SpaceStation("Станція", 1000, 1000, 3, 4);
        //SpaceStation spaiseStation1 = new SpaceStation("Stanciya",100,1111, 45, 3);


        spaiseStation.metod(1000);


        spaceModule.helloH();
        spaiseStation.helloH();

        spaceModule.bul(1);
        spaiseStation.bul(1.1);


        Dispetchering dispetchering = new Dispetchering();
        dispetchering.menu(7);
        dispetchering.menu(1);
    }
}

