
import java.util.ArrayList;
import org.h2.engine.User;
import org.junit.Assert;
import org.junit.Test;
import th.ac.kmutt.sit.MyFirstService.controller.UserController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author game_
 */
public class MyFirstUnitTest {
    
    @Test
    public void getAllUser() {
        UserController controller = new UserController();
        ArrayList userResult = new ArrayList(); 
        userResult = controller.getUsers();
        Assert.assertEquals("We can get 5 user from class.", 5, userResult.size());
    }
    
    @Test
    public void getUser() {
        UserController controller = new UserController();
        Assert.assertEquals("Get user id 1 from controller", 1, controller.getUserId1().getId());
        Assert.assertEquals("Get user id 1's name from controller", "Phornlert", controller.getUserId1().getName());
    }
    
//    public MyFirstUnitTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
