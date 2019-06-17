import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class GitHubAccountTest {

    GitHubAccount githubAccount;
    Repository repository1;
    Repository repository2;
    Repository repository3;



    @Before
    public void setUp(){
        githubAccount = new GitHubAccount("User1", "Mateusz", "Free");
        repository1 = new Repository("PHP/MySQL project", "Description from Repo 1", "public");
        repository2 = new Repository("Ruby MVC Project", "Description from Repo 2", "private");
        repository3 = new Repository("Express JS API project", "Description from Repo 3", "public");
//

    }

    @Test
    public void repositoryListStartsFrom0(){
        assertEquals(0, githubAccount.repositoryListSize());
    }

    @Test
    public void checkIfRepositoryIsAdded(){
        githubAccount.addRepository(repository1);
        assertEquals(1, githubAccount.repositoryListSize());
    }

    @Test
    public void checkAllRepositories(){
        githubAccount.addRepository(repository1);
        githubAccount.addRepository(repository2);
        githubAccount.addRepository(repository3);
        assertEquals(3, githubAccount.repositoryListSize());
    }

    @Test
    public void checkDefaultAccount(){
        assertEquals("Free", githubAccount.getAccountType());
    }

    @Test
    public void checkChangedAccountType(){
        assertEquals("Pro", githubAccount.buyPremiumAccount());
    }

//    @Test
//    public void checkIfCanFindRepositoryByName(){
//        ArrayList<Repository> repositories = new ArrayList<Repository>();
//        repositories.add(repository1);
//        repositories.add(repository2);
//        repositories.add(repository3);
//        assertEquals(true, githubAccount.repositories.findProject());
//
//
//
//
//
//
//    }





}
