package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Show all products");
        Service service = new Service();
        service.getAllProduct()
                .forEach(System.out::println);

        System.out.println("=============================================================");
        System.out.println("Show all brand");
        service.getAllBrand(service.getAllProduct())  // input Productlist -> output: Brand list
                .forEach(System.out::println);
        System.out.println("=============================================================");

        Map<String, Integer>table = service.getAllCategory(service.getAllProduct()); // table <Category, Amount>
        Set<Map.Entry<String, Integer>> mEntry = table.entrySet();
        mEntry.forEach(n -> System.out.println(n.getKey() + " - " + n.getValue()));

    }




}
