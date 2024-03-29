// Represents a time span of hours and minutes elapsed.
// Alternate implementation using only total minutes.

public class TimeSpan {
   private int totalMinutes;

   // Constructs a time span with the given interval.
   // pre: hours >= 0 && minutes >= 0
   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      addTime(hours, minutes);
   }
   
   // Adds the given interval to this time span.
   // pre: hours >= 0 && minutes >= 0
   public void addTime(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }
   
   // HW08Ex07 public void add(TimeSpan span)
   // Adds the given amount of time to this time span.
   public void add(TimeSpan span) {
        this.totalMinutes += span.totalMinutes;
   }

   // Returns whether o is a TimeSpan representing the same
   // number of hours and minutes as this TimeSpan object.
   public boolean equals(Object o) {
      if (o instanceof TimeSpan) {
         TimeSpan other = (TimeSpan) o;
         return totalMinutes == other.totalMinutes;
      } else {   // not a TimeSpan object
         return false;
      }
   }

   // Returns a String for this time span such as "6h15m".
   public String toString() {
      return (totalMinutes / 60) + "h" + 
            (totalMinutes % 60) + "m";
   }
}
