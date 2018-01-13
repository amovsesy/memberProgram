/***
 * The ClubTester class creates a Member objects, creates some 
 * two way friend relationships between Them, and then tests the 
 * Member.isAquaintance method.
 */

public class ClubTester 
{

  public static void main(String[] args) 
  {
    new Member("A");
    new Member("B");
    new Member("C");
    new Member("D");
    new Member("E");
    new Member("F");
    new Member("G");
    new Member("H");
    new Member("I");
    new Member("J");
    new Member("K");
    new Member("L");
    new Member("M");
    new Member("Z");

    createTwoWayFriendship("D", "H");
    createTwoWayFriendship("J", "B");
    createTwoWayFriendship("E", "K");
    createTwoWayFriendship("D", "G");
    createTwoWayFriendship("F", "J");
    createTwoWayFriendship("H", "G");
    createTwoWayFriendship("D", "F");
    createTwoWayFriendship("G", "A");
    createTwoWayFriendship("D", "A");
    createTwoWayFriendship("B", "D");

    displayAquaintanceResults("B", "A");
    displayAquaintanceResults("A", "D");
    displayAquaintanceResults("F", "M");
    displayAquaintanceResults("F", "D");
    displayAquaintanceResults("H", "A");
    displayAquaintanceResults("Z", "A");
    displayAquaintanceResults("G", "K");
    displayAquaintanceResults("C", "L");
    displayAquaintanceResults("M", "D");
  }

  private static Member member(String name) 
  {
    return Club.getInstance().memberForName(name);
  }

  private static void displayAquaintanceResults(String n1, String n2) 
  {

    if (member(n1).isAquaintance(member(n2))) 
    {
      System.out.println(n1 + " and " + n2 + " are aquainted.");
    } 
    else 
    {
      System.out.println(n1 + " and " + n2 + " are not aquainted.");
    }
  }

  private static void createTwoWayFriendship(String n1, String n2) 
  {
    member(n1).addFriend(member(n2));
    member(n2).addFriend(member(n1));
  }
}