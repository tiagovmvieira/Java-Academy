import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Text;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class ReadAndWriteXML{

    public static void main(String[] args){

        writeXML();
        readXML();
    }

    private static void writeXML(){

        try {

            Document doc = new Document();

            Element theRoot = new Element("tvshows");
            doc.setRootElement(theRoot);

            Element show = new Element("show");
            Element name = new Element("name");
            name.setAttribute("show_id", "show_001");

            name.addContent(new Text("Life on Mars"));

            Element network = new Element("network");

            network.addContent(new Text("ABC"));
            network.setAttribute("country", "US");

            show.addContent(name);
            show.addContent(network);

            theRoot.addContent(show);

            // ---------

            Element show2 = new Element("show");
            Element name2 = new Element("name");
            name2.setAttribute("show_id", "show_002");

            name2.addContent(new Text("Freeks and Geeks"));

            Element network2 = new Element("network");
            network2.addContent(new Text("BBC"));

            network2.setAttribute("country", "US");

            show2.addContent(name2);
            show2.addContent(network2);

            theRoot.addContent(show2);

            XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());

            String FileName = "";
            xmlOutput.output(doc, new FileOutputStream(new File(FileName)));

            System.out.println("Wrote to File");
        } catch (Exception ex){

            ex.printStackTrace();
        }

    }

    private static void readXML(){

        SAXBuilder builder = new SAXBuilder();

        try{

            String FileName = "";
            Document readDoc = builder.build(new File(FileName));

            System.out.println("Root: " + readDoc.getRootElement());

            System.out.println("Show: " +
                    readDoc.getRootElement().getChild("show").getChildText("name"));

            System.out.println("Show ID: " +
                    readDoc.getRootElement().getChild("show").getChild("name").getAttributeValue("show_id") + "\n");

            Element root = readDoc.getRootElement();

            for (Element curEle : root.getChildren("show")){

                System.out.println("Show Name: " +
                        curEle.getChildText("name"));

                System.out.println("Show ID: " +
                        curEle.getChild("name").getAttributeValue("show_id"));

                System.out.print("On " +
                        curEle.getChildText("network") + " in the ");

                System.out.println(curEle.getChild("network").getAttributeValue("country") + "\n");
            }

        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
