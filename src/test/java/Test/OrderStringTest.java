package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderStringTest {


    @Test
    void main() {
        OrderString.main(new String[]{"1","dulgvgzwqg"});
    }

    @Test
    void stringManipulationWithenie() {
        String textToManipulate = "ñopññaqa";
        String manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ñññaaopq",manipulated);
    }

    @Test
    void stringManipulationWithEmpty() {
        String textToManipulate = "";
        String manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("",manipulated);
    }

    @Test
    void stringManipulation() {

        String textToManipulate = "abaccadcc";
        String manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ccccaaabd",manipulated);

        textToManipulate = "xyzxy";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("xxyyz",manipulated);

        textToManipulate = "dulgvgzwqg";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("gggdlquvwz",manipulated);

        textToManipulate = "gxtjtmtywr";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("tttgjmrwxy",manipulated);


        textToManipulate = "hnlnxiupgt";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("nnghilptux",manipulated);

        textToManipulate = "gzjotckivp";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("cgijkoptvz",manipulated);

        textToManipulate = "dpwwsdptae";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ddppwwaest",manipulated);

        textToManipulate = "pcscpilknb";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ccppbiklns",manipulated);

        textToManipulate = "btvyhhmflf";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ffhhblmtvy",manipulated);

        textToManipulate = "artrtnqxcr";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("rrrttacnqx",manipulated);

        textToManipulate = "nrtcmcoadn";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ccnnadmort",manipulated);

        textToManipulate = "fkdsgnekft";
        manipulated = OrderString.stringManipulation(textToManipulate);
        Assertions.assertEquals("ffkkdegnst",manipulated);
    }

    @Test
    void createString() {
        String stringBuilding=OrderString.createStringFromCountCharacter('a',4);
        Assertions.assertTrue(stringBuilding.equals("aaaa"));
    }
}