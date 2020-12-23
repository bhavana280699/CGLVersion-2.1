import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author admin
 *
 */
class ConwaysTest {
/**
 * cell’s initial state would be dead
 */

 	@Test
	public void initialStateisDead()
	{
		Conways cell = new Conways();
		Assertions.assertEquals(cell.getState(),false);
		System.out.println("***TESTCASE ONE PASSED***");
		
	}
/**
 * Check whether the cell is alive or not
 * @params 
 * 
 */
	@Test
    public void cellAliveTest(){
      Cell changeCellAlive = new Cell();
        changeCellAlive.changeState();
        //Assert
        Assertions.assertEquals(changeCellAlive.getState(), true);
        System.out.println("***TESTCASE TWO PASSED***");
    }
/**
 * Check if cell can change from alive to dead
 * @params true
 * @params false
 */
	@Test
	public void CellDeadTest(){
	  
	  CellNew changeCellDead = new CellNew();
	  changeCellDead.changeState();
	  changeCellDead.changeState();
	  //Assert
	  
	  Assertions.assertEquals(changeCellDead.getState(), false);
	  System.out.println("***TESTCASE THREE PASSED***");
	}
	

	@Test
	public void cellAliveTestOne(){
		CellAlive cell = new CellAlive();
		
		
		cell.nextState(2);
		
		Assertions.assertEquals(cell.getNextState(), true);
		System.out.println("***TESTCASE FOUR PASSED***");
	}
	@Test
	public void cellAliveTestTwo(){
		
		CellAlive cell2 = new CellAlive();
		cell2.nextState(3);
		
		Assertions.assertEquals(cell2.getNextState(), true);
		System.out.println("***TESTCASE FIVE PASSED***");
	}
}	


