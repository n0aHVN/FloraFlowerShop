package murach.Data.Homework;

import java.io.*;
import java.util.*;

import murach.Business.Homework.ProductHomework;

public class ProductIO
{
    public static ProductHomework getProduct(String code, String filepath)
    {
        try
        {
            File file = new File(filepath);
            BufferedReader in = 
                new BufferedReader(
                new FileReader(file));

            String line = in.readLine();
            while (line != null)
            {
                StringTokenizer t = new StringTokenizer(line, "|");
                String productCode = t.nextToken();
                if (code.equalsIgnoreCase(productCode))
                {
                    String description = t.nextToken();
                    double price = Double.parseDouble(t.nextToken());
                    ProductHomework p = new ProductHomework();
                    p.setCode(code);
                    p.setDescription(description);
                    p.setPrice(price);
                    in.close();
                    return p;
                }
                line = in.readLine();
            }
            in.close();
            return null;
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<ProductHomework> getProducts(String filepath)
    {
        ArrayList<ProductHomework> products = new ArrayList<ProductHomework>();
        File file = new File(filepath);
        try
        {
            BufferedReader in = 
                new BufferedReader(
                new FileReader(file));

            String line = in.readLine();
            while (line != null)
            {
                StringTokenizer t = new StringTokenizer(line, "|");
                String code = t.nextToken();
                String description = t.nextToken();
                String priceAsString = t.nextToken();
                double price = Double.parseDouble(priceAsString);
                ProductHomework p = new ProductHomework();
                p.setCode(code);
                p.setDescription(description);
                p.setPrice(price);
                products.add(p);
                line = in.readLine();
            }
            in.close();
            return products;
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}