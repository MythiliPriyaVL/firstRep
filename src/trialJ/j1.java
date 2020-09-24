package trialJ;

public class j1 {

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~Start of Test~~~~~~~~~~~~");
		
		int year = 2020;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        
		System.out.println("~~~~~~~~~~End of Test~~~~~~~~~~~~");

	}

}
