public class Character {
  private String characterName;
  private Place currentHome;

  public void setHome(Place, home) {
    currentHome = home;
  }
  public Place getHome() {
    return currentHome;
  }
  public void setName(String name) {
   characterName = name; 
  }
  public String getName() {
      return characterName;
  }
  
  public Character (String name, Place home) {
    characterName = name;
    currentHome = home;
  }
  public Character (String name) {
   characterName = name; 
  }
}
