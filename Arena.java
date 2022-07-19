class Arena {

    public static void main(String[] args) {
        
        AirMonster djinn = new AirMonster("Billy Djin", 10);
        FireMonster tartofeu = new FireMonster("tartofeu", 6);

        do {
            tartofeu.attack(djinn);

            if(!tartofeu.isKO())
                djinn.attack(tartofeu);
                
        }while(!tartofeu.isKO() && !djinn.isKO());
        
    }
}