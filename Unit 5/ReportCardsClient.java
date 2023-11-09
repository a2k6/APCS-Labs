public class ReportCardsClient {
    //main method
    public static void main(String[] args) {
        ReportCards report1 = new ReportCards('A', 'A', 'A', 'B', 'F');
        System.out.println(report1.eligibility());
        ReportCards report2 = new ReportCards();
        System.out.println(report2.eligibility());
        /*Create a ReportCards object with the constructor without parameters to test all of the eligibility requirements
        by printing the eligibility statements. You need to test the rest, so your program will need to be run and
        tested multiple times.*/
        /*ToDo*/
    }
}
