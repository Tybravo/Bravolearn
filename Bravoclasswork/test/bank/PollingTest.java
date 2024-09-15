package bank;

import org.junit.jupiter.api.Test;

import static bank.Issue.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {
    private final PollingApplication pollingApplication = new PollingApplication();


    @Test
    public void test_That_Polling_App_Exist() {
        assertNotNull(pollingApplication);
        }

    @Test
    public void test_That_Polling_App_Has_five_Issues() {
        Issue[] topics = pollingApplication.getTopics();
        assertEquals(5, topics.length);
    }

    @Test
    public void test_That_Polling_Issues_Exist() {
        Issue[] topics = pollingApplication.getTopics();
        for (Issue topic : topics) {
            assertNotNull(topic);
        }
    }

    @Test
    public void test_That_Polling_Application_Has_5By10_Table_For_Responses() {
        int[][] responses = pollingApplication.getResponses();
        assertEquals(5, responses.length);
        for(int[] response : responses) {
            assertEquals(10, response.length);
        }
    }

    @Test
    public void test_That_Polling_Application_Can_Store_Polling_Responses() {
        pollingApplication.RateIssue(MYSTERY, 8);
        pollingApplication.RateIssue(PATERNITY_FRAUD, 2);
        pollingApplication.RateIssue(MIRACLE, 1);
        int[][] responses = pollingApplication.getResponses();
        int fifthIssueResponse = responses[4][7];
        assertEquals(1, fifthIssueResponse);
        int thirdIssueResponse = responses[2][1];
        assertEquals(0, thirdIssueResponse);
        int fourthIssueResponse = responses[3][0];
        assertEquals(1, fourthIssueResponse);

        pollingApplication.RateIssue(MYSTERY, 8);
        fifthIssueResponse = responses[4][7];
        assertEquals(2, fifthIssueResponse);

        pollingApplication.RateIssue(EDUCATION, 10);
        int firstIssueResponse = responses[0][9];
        assertEquals(1, firstIssueResponse);
    }
}
