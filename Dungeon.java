class Dungeon {
  private String name;
  private Monster[] monsters;
  private int monsterCounter;

  public Dungeon(String name){
    this.name = name;
    this.monsters = new Monster[10];
    monsterCounter = 0; 
  }

  // public Dungeon(String name){
  //   this.name = name;
  // }

  public String getName(){
    return this.name;
  }

  public void addName(String name){
    this.name = name;
  }

  public Monster[] getMonsters(){
    return this.monsters;
  }

  public int getCounter(){
    return this.monsterCounter;
  }

  public void addMonster(Monster monster){
    if(isDungeonFull()) return;
    monsters[monsterCounter] = monster;
    monsterCounter++;
  }

  public boolean isDungeonFull(){
    if(monsterCounter >= monsters.length){
      return true;
    }
    else{
      return false;
    }
  }

  public int monsterCount(){
    return monsterCounter;
  }





}