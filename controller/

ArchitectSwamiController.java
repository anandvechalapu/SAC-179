

@RestController
@RequestMapping("/architectswami")
public class ArchitectSwamiController {
  
    @GetMapping("/login")
    public String loginToSacralAi() {
        // code to login to Sacral.ai
    }
  
    @PostMapping("/generateSoftArch")
    public String generateSoftwareArchitecture() {
        // code to generate software architecture using Architect Swami
    }
  
    @PostMapping("/generateFromJiraStories")
    public String generateSoftwareArchitectureFromJiraStories() {
        // code to generate software architecture from Jira stories
    }
  
    @PostMapping("/useServices")
    public String useArchitectSwamiServices() {
        // code to use Architect Swami services
    }
}