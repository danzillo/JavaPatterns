//package sportsman;
//
//import junit.framework.TestCase;
//import org.junit.Assert;
//import org.junit.Test;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SportsmanTest2 extends TestCase {
//
//    public void testTestSetName() {
//        Sportsman sport = new Sportsman("Даниил Иванов", 12, "М");
//        sport.setName("Иван Михайлов");
//        assertEquals("Иван Михайловd", sport.getName());
//    }
//
//    public void testGetAllSprotsman() throws NullPointerException {
//        try {
//            List<Sportsman> exp = Sportsman.getAllSprotsman();
//        } catch (NullPointerException thrown) {
//            Assert.assertNotEquals(null, thrown.getMessage());
//        }
//    }
//
//    public void testTestGetAllSprotsman() {
//        Sportsman sport1 = new Sportsman("Даниил Иванов", 12, "М");
//        Sportsman sport2 = new Sportsman("Иван Иванов", 15, "М");
//        Sportsman sport3 = new Sportsman("Диана Иванова", 18, "Ж");
//
//        List<Sportsman> expected = Sportsman.getAllSprotsman("М");
//
//        List<Sportsman> actual = new ArrayList<>();
//        actual.add(sport1);
//        //actual.add(sport2);
//
//        Assert.assertEquals(expected,actual);
//    }
//}