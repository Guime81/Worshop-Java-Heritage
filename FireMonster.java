class FireMonster extends Monster {

    // TODO : add constructor and initialize type to "fire"

    public FireMonster(String name, int attack) {
        super(name, attack, "fire"); // "fire" car le type sera forcément de type air donc on le met dans le dur
    }

    // TODO : create an attack method which deals x2 damage to "air"

    public boolean attack(Monster opponent) {
        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("air)")) {
            damage *= 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;
    }

}