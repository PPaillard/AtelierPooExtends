class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage;
        if("water".equals(opponent.getType())){
            damage = this.getAttack() * 2;
        }
        else damage = this.getAttack();

        opponent.setLife(opponent.getLife()-damage);

        return opponent.isKO();
    }
}