public class HockeyDemo1 implements Hockey, Event {

   public void setHomeTeam(String name) {
      System.out.println("Home team: " + name);
   }

   public void setVisitingTeam(String name) {}

   public void homeGoalScored() {}

   public void visitingGoalScored() {}

   public void endOfPeriod(int period) {}

   public void overtimePeriod(int ot) {}

   public static void main(String[] args) {
      HockeyDemo1 hockeyDemo1 = new HockeyDemo1();
      hockeyDemo1.setHomeTeam("Bangladesh");
      hockeyDemo1.organize();
   }

   public void organize() {
      System.out.println("Match organized. ");
   }
}