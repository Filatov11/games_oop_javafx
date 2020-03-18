package ru.job4j.figures.black;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert.*;
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.*;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.junit.Assert.*;
public class BishopBlackTest {

    @Test
    public void BishopBlackTestposition(){
 Cell cell =  Cell.A1;
 Cell pos =  Cell.A1;
        BishopBlack bishopBlack = new BishopBlack(cell);
        cell =  bishopBlack.position();
        assertEquals(pos,cell );
       // Assert.assertSame("2 objects are same", instance1, instance2);
    }


    @Test
    public void BishopBlackTestcopy(){
        Cell cell =  Cell.A2;
        Cell pos =  Cell.A2;

        BishopBlack bishopBlack1 = new BishopBlack(cell);
        BishopBlack bb2 = new BishopBlack(pos);
      bb2.copy(cell);
       // bb2.copy(bishopBlack1);
        assertEquals(bishopBlack1.position(),bb2.position() );


   //     Assert.assertSame("2 objects are same", instance1, instance2);
    }


    @Test
   public void BishopBlackTestWay(){
       Cell begcell =  Cell.C1;
       Cell endcell =  Cell.G5;
       Cell[] arrayCell = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};

        BishopBlack bishopBlack1 = new BishopBlack(begcell);

        assertEquals(bishopBlack1.way(begcell, endcell),arrayCell);


        //     Assert.assertSame("2 objects are same", instance1, instance2);
    }


    @Test
    public void BishopBlackTestisDiag(){
        Cell begcell =  Cell.C1;
        Cell endcell =  Cell.G5;
       // Cell[] arrayCell = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};

        BishopBlack bishopBlack1 = new BishopBlack(begcell);

        assertEquals(bishopBlack1.isDiagonal(begcell, endcell),true);


        //     Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void LogicTestMove(){
        Cell begcell =  Cell.C1;
        Cell endcell =  Cell.G5;
        // Cell[] arrayCell = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};

        Logic logic1 = new Logic();

        assertEquals(logic1.move(begcell, endcell),false);


        //     Assert.assertSame("2 objects are same", instance1, instance2);
    }




}
