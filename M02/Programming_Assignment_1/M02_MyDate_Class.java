//+------------------------+
//|  M02_MyDate_Class      |
//+------------------------+
//| - main(args: String[]) |
//+------------------------+
//| + main(args: String[]) |
//+------------------------+
//
//+---------------------+
//|       MyDate        |
//+---------------------+
//| - year: int         |
//| - month: int        |
//| - day: int          |
//+---------------------------------------------+
//| + MyDate()                                  |
//| + MyDate(timeInMilliseconds: long)          |
//| + MyDate(year: int, month: int, day: int)   |
//| + getYear(): int                            |
//| + setYear(timeInMilliseconds: long): void   |
//| + getMonth(): int  			                | 
//| + setMonth(timeInMilliseconds: long): void  |
//| + getDay(): int                             |
//| + setDay(timeInMilliseconds: long): void    |
//| + setDate(elapsedTime: long): void          |
//+---------------------------------------------+

//Why Do i always forget to import
import java.util.GregorianCalendar;

public class M02_MyDate_Class {
    public static void main(String[] args) {
        
// Create a MyDate object with the current date
        MyDate date1 = new MyDate();
        
// Create a MyDate object with a specific time in milliseconds
        MyDate date2 = new MyDate(34355555133101L);

        
// Print the current date details
        System.out.println("Date Current:");
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day:   " + date1.getDay());
        System.out.println("Year:  " + date1.getYear());

        
// Print the date details for the specific time in milliseconds
        System.out.println("Date 34355555133101L:");
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day:   " + date2.getDay());
        System.out.println("Year:  " + date2.getYear());
    }

    
	private static class MyDate {
        private int year;
        private int month;
        private int day;

        
// Constructor that initializes the date to the current time
        MyDate() {
            this(System.currentTimeMillis());
        }

        
// Constructor that initializes the date to a specific time in milliseconds
        MyDate(long timeInMilliseconds) {
            setYear(timeInMilliseconds);
            setMonth(timeInMilliseconds);
            setDay(timeInMilliseconds);
        }

        
// Constructor that initializes the date to a specific year, month, and day
        MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

       
// Getter for the year
        int getYear() {
            return year;
        }

        
// Setter for the year using time in milliseconds
        void setYear(long timeInMilliseconds) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(timeInMilliseconds);
            this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        }

        
// Getter for the month
        int getMonth() {
            return month;
        }

        
// Setter for the month using time in milliseconds
        void setMonth(long timeInMilliseconds) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(timeInMilliseconds);
            this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        }

        
// Getter for the day
        int getDay() {
            return day;
        }

        
// Setter for the day using time in milliseconds
        void setDay(long timeInMilliseconds) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(timeInMilliseconds);
            this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        }

        
// Method to set the date using elapsed time in milliseconds
        void setDate(long elapsedTime) {
            setYear(elapsedTime);
            setMonth(elapsedTime);
            setDay(elapsedTime);
        }
    }
}
