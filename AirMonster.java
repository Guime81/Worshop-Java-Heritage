class AirMonster extends Monster {

    // TODO : add constructor and initialize type to "air"

    public AirMonster(String name, int attack) {
        super(name, attack, "air"); // "air" car le type sera forcément de type air donc on le met dans le dur
    }

    // TODO : create an attack method which deals x2 damage to "water"

    public boolean attack(Monster opponent) {
        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("water)")) {
            damage *= 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;
    }

}