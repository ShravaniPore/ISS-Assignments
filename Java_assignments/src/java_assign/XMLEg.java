package java_assign;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLEg {

        public static void main(String arg[]) {

            try {

//                Creating a DocumentBuilder Object
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

//                Creating a new Document
                Document product = dBuilder.newDocument();

//                Creating the root element
                Element rootElement = product.createElement("products");
                product.appendChild(rootElement);

//                Appending sub elements to the root element
                Element category = product.createElement("category");
                rootElement.appendChild(category);

                Element productInfo = product.createElement("productInfo");
                category.appendChild(productInfo);

//                Setting attribute to the sub element
                Attr attr = product.createAttribute("type");
                attr.setValue("Mobile");
                productInfo.setAttributeNode(attr);

//                Adding child element to the sub element
                Element company = product.createElement("company");
                company.appendChild(product.createTextNode("Realme"));
                productInfo.appendChild(company);

//                transforming into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(product);
                StreamResult result = new StreamResult(new File("C:\\Users\\Shravani Pore\\IdeaProjects\\Java_assignments\\src\\java_assign\\Electronics.xml"));
                transformer.transform(source, result);

//                printing to console
                StreamResult consoleResult = new StreamResult(System.out);
                transformer.transform(source, consoleResult);

//                accessing elements in xml file
                Element root = product.getDocumentElement();
                System.out.println("root element is: "+root.getTagName());

//                accessing child nodes
                NodeList list= root.getChildNodes();
                for(int i=0;i<list.getLength();i++){
                    Node node=list.item(i);
                    System.out.println("Current element: "+node.getNodeName());

                    if(node.getNodeType()==Node.ELEMENT_NODE){
                        Element eElement = (Element) node;
                        System.out.println("Name of the company : " + eElement.getElementsByTagName("company").item(0).getTextContent());
                    }
                }
            }
            catch (Exception e) { e.printStackTrace(); }
        }
    }

