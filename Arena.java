class Arena {
    // TODO : create two monsters
    public static void main(String[] args) {

        AirMonster monstreA = new AirMonster("Monstre d'air", 1);
        FireMonster monstreB = new FireMonster("Monstre de feu", 2);

        // TODO : monsters attack each other

        monstreA.setLife(42);

        // TODO : Tant que les deux ne sont pas KO...

        while (monstreA.getLife() > 0 && monstreB.getLife() > 0) {
            monstreB.attack(monstreA);

            if (monstreA.getLife() > 0) {
                monstreA.attack(monstreB);
            }
        }
        System.out.println("Fin du combat!");

    }
}