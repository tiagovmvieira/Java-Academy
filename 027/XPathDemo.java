import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;


public class XPathDemo {

    public static void main(String[] args){

        // Allows the app to get a parser that turns an XML doc into a DOM tree
        DocumentBuilderFactory domFactory =
                DocumentBuilderFactory.newInstance();

        domFactory.setNamespaceAware(true);

        DocumentBuilder builder;
        Document doc = null;

        try {

            builder = domFactory.newDocumentBuilder();
            String fileName = "/Users/ctw02162/Personal/Java-Academy/027/tvshows.xml";
            doc = builder.parse(fileName);

        } catch (SAXException e){

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ParserConfigurationException e){

            e.printStackTrace();
        }

        XPath xpath = XPathFactory.newInstance().newXPath();
        getNodeNameAndValue(doc, xpath);

    }

    private static void getNodeNameAndValue(Document doc, XPath xpath){

        XPathExpression expr;

        Object result = null;

        try{

            // Display every name
            // String expressionToDisplay = "//show/name//text()";

            // Display everything
            // String expressionToDisplay = "//show/*//text()";

            // Show names based on an attribute
            // String expressionToDisplay = "//show/name[@id_code='show_001']//text()";

            // Show actors and character names
            // String expressionToDisplay = "//show/actors/actor/*//text()";

            // Show character names if they are Students
            // String expressionToDisplay = "//show/actors/actor/character[@profession='Student']//text()\n";

            // Show characters with the profession Student
            String expressionToDisplay = "//show/actors/actor/character[@profession='Student']//text()";

            expr = xpath.compile(expressionToDisplay);

            result = expr.evaluate(doc, XPathConstants.NODESET);

        } catch (XPathExpressionException e) {

            e.printStackTrace();
        }

        NodeList nodes = (NodeList) result;

        for (int i = 0; i < nodes.getLength(); i++){

            System.out.println(nodes.item(i).getParentNode().getNodeName() + " " + nodes.item(i).getNodeValue());
        }

    }

}
