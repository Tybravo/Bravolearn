package bank;

public class PollingApplication {

    private Issue[] TOPICS = new Issue[0];
    //private final Issue issue;
    private static final int [][] RESPONSES = new int [5][10];

    public PollingApplication() {
        //TOPICS = new String[]{"Education", "Paternity frauds", "Maternity Issue", "Miracle", "Mystery"};
        //TOPICS[0] = Issue.EDUCATION;
        TOPICS = Issue.values();
    }

    public Issue[] getTopics() {
        return TOPICS;
    }

    public int[][] getResponses() {
        return RESPONSES;
    }

    public void RateIssue(Issue issue, int rating) {
       // issue = issue - 1;
        int[] issueToRate = RESPONSES[issue.ordinal()];
        rating = rating -1;
        issueToRate[rating] = ++issueToRate[rating];
    }

}