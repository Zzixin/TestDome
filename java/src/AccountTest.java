
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
   private double epsilon = 1e-6;

   @Test
   public void accountCannotHaveNegativeOverdraftLimit() {
      Account account = new Account(-20);

      Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
      Assert.assertFalse(account.deposit(-10)); // not accept negative numbers.
      Assert.assertFalse(account.withdraw(-10)); // not accept negative numbers.

      Assert.assertFalse(account.withdraw(10)); // Account cannot overstep its overdraft limit.

      Assert.assertTrue(account.deposit(20));
      Assert.assertEquals(20d, account.getBalance(), epsilon);

      Assert.assertTrue(account.withdraw(12));
      Assert.assertEquals(8d, account.getBalance(), epsilon);
   }
}