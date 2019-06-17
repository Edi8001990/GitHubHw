import java.util.ArrayList;
import java.util.Arrays;

public class GitHubAccount {

    private  String username;
    private  String name;
    private String accountType;
    private ArrayList<Repository> repositories;

    public GitHubAccount(String username, String name, String accountType){
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new ArrayList<Repository>();


    }

    public int repositoryListSize(){
        return this.repositories.size();
    }



    public void addRepository(Repository repository1) {
        this.repositories.add(repository1);
    }



    public String getAccountType(){
        return accountType;
    }

    public String buyPremiumAccount() {
        String proAccount = accountType.replace("Free", "Pro");
        return proAccount;
    }


//    public String findProject() {
//            String project = "PHP/MySQL project";
//        return project;
//
//    }
}
