class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage;
        if("air".equals(opponent.getType())){
            damage = this.getAttack() * 2;
        }
        else damage = this.getAttack();

        opponent.setLife(opponent.getLife()-damage);

        return opponent.isKO();
    }
}