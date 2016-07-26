class Hero {
  private String name;
  private int hp;

  public Hero(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  public String getName(){
    return this.name;
  }

  public void addName(String name){
    this.name = name;
  }

  public int getHp(){
    return this.hp;
  }

  public void addHp(int hp){
    this.hp = hp;
  }

  public int dungeonRun(int number, Dungeon dungeon){
    for (int i=0; i<number; i++) {
       this.hp -= dungeon.getMonsters()[i].getHp();
    }
    return this.hp;
  }


}