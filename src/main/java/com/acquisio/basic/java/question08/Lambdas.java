package com.acquisio.basic.java.question08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * QUESTION 09: Lambdas (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Lambdas, add the code to transform the input file to apply those rules.
 * 1- Keep lines where the amount is greater than or equals to 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Lambdas {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Lambdas instance = new Lambdas();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    void convertCarts(File input, File output) throws IOException {
        try (Stream<String> stream = Files.lines(input.toPath())) {
            stream.map(l -> stringToData(l))
                  .filter(d -> d.amount > 50)
                  .map(d -> getPrintString(d))
                  .forEach(l -> writeLine(l, output));
        }
    }

    private Data stringToData(String line) {
        String[] elements = line.split(",");
        double amount = Double.parseDouble(elements[1]);
        int count = Integer.parseInt(elements[3]);
        return new Data(elements[0], amount, elements[2], count);
    }
    
    private String getPrintString(Data data) {
        return String.join(",", new String[] { 
                data.user, 
                String.valueOf(data.amount),
                String.valueOf(data.taxes),
                String.valueOf(data.amount + data.taxes),
                String.valueOf(data.count) });
    }
    
    private void writeLine(String line, File output) {
        try {
            try (FileWriter fr = new FileWriter(output, true)) {
                fr.write(line + "\n"); 
            }
        } catch (IOException e) {
            // ignore...
        }
    }

    private class Data {
        String user;
        double amount;
        int count;
        double taxes;
        
        Data(String user, double amount, String title, int count) {
            this.user = user;
            this.amount = amount;
            this.count = count;
            this.taxes = amount * 0.15;
        }
    }
}
