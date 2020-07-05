public class MyClass {
    public static void main(String args[]) {
      String person1 = "Raj Kumar";
      String person2 = "Arun Kumar";
      String person3 = "RaJ Kumar";
      System.out.println("persons are equal " + person1.equals(person2));
      System.out.println("persons are equal case insensitive " + person1.equalsIgnoreCase(person3));
      System.out.println("person1 charAt 2 " + person1.charAt(2));
      System.out.println("person1 startsWith Raj " + person1.startsWith("Raj Ku"));
      System.out.println("person1 endsWith r " + person1.endsWith("r"));
      System.out.println("person1 indexOf Kumar " + person1.indexOf("Kumar"));
    }
}
