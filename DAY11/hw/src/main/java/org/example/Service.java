package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Service {
    public List<Product> getAllProduct() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Product> allProduct = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("product.json"))) {
            allProduct = objectMapper.readValue(br, new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return allProduct;
    }

    public Set<String> getAllBrand(List<Product> products) {
        Set<String> brands = new HashSet<>();
        products.forEach(n -> brands.add(n.getBrand()));    //new Set and add only brand
        return brands;
    }

    public Map<String, Integer> getAllCategory(List<Product> products) {
        //Get Array of Category in Product List
        List<String[]> ListArray = products.stream().map(Product::getCategory).toList();
        Map<String, Integer> table = new HashMap<>();
        for (String[] list : ListArray) {
            List<String> ListString = Arrays.stream(list).toList();    //Convert List<Array> into List<String>
//            System.out.println(ListString);

            ListString.forEach(n -> {
                if (!table.containsKey(n)) {    // check duplication
                    table.putIfAbsent(n, 1);
                } else {
                    table.computeIfPresent(n, (key, val) -> val + 1);
                }
            });
        }


        return table;
    }


}
