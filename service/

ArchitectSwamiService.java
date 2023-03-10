

@Service
public class ArchitectSwamiService {

    private final SacralAiClient sacralAiClient;

    public ArchitectSwamiService(SacralAiClient sacralAiClient) {
        this.sacralAiClient = sacralAiClient;
    }

    public void generateSoftwareArchitecture(List<JiraStory> jiraStories) {
        sacralAiClient.login();
        sacralAiClient.followRequiredSteps();

        // generate software architecture here
    }
}