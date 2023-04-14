class WaterMonster extends Monster {
    // TODO : add constructor and initialize type to "water"

    public WaterMonster(String name, int attack) {
        super(name, attack, "water"); // "water" car le type sera forcément de type air donc on le met dans le dur
    }

    // TODO : create an attack method which deals x2 damage to "fire"

    public boolean attack(Monster opponent) {
        int opponentLife = opponent.getLife();
        int damage = this.getAttack();

        if (opponent.getType().equals("fire)")) {
            damage *= 2;
        }

        int remainingLife = opponentLife - damage;
        opponent.setLife(remainingLife);

        boolean isOpponentKo = opponent.isKO();
        return isOpponentKo;
    }

}