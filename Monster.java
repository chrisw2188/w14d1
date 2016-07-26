class Monster {
  private String name;
  private int hp;

  public Monster(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  public String getName(){
    return this.name;
  }

  public int getHp(){
    return this.hp;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

}