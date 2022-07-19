class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage;
        if("fire".equals(opponent.getType())){
            damage = this.getAttack() * 2;
        }
        else damage = this.getAttack();

        opponent.setLife(opponent.getLife()-damage);

        return opponent.isKO();
    }
}