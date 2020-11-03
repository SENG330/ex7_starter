package ca.uvic.seng330.ex7;

/**
 * Tracks the Points in a league
 */
public class Points {
  private int assists;
  private int goals;

  public int getPoints() {
    return assists+goals;
  }

  public void setAssists(int pAssists) {
    assists += pAssists;
  }

  public void setGoals(int pGoals) {
    assists += pGoals;
  }
}
