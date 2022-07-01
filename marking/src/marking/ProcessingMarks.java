package marking;

public class ProcessingMarks {

    public int processMark1(int mark)
    {
       if (mark<= 40) {
           return 0;
       }
       else {
           return 1;
       }
    }

    public boolean processMark2(int mark)
    {
       if (mark<= 40) {
           return false;
       }
       else {
           return true;
       }
    }

    public String processMark3(int mark)
    {
       if (mark<= 40) {
           return "Fail";
       }
       else {
           return "Pass";
       }
    }
}

