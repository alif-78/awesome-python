public class Person {
Person()
{
  
}
Person(string name)
{
   this.name = name

}
  public String name; 

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}