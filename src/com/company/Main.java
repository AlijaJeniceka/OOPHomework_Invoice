package com.company;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("SomeNumber1234", "Some details", 2, 5);
        System.out.println( "Number of invoice: " + invoice.getPartNumber() + ", details about invoice: " +
                invoice.getDescription() + ". Quantity is " + invoice.getQuantity() + ", one details price is "
                + invoice.getPrice() + ". Total amount is " + invoice.getInvoiceAmount() + ". ");

        Invoice invoice1 = new Invoice("Some5678", "Some description", -1, 7);
        System.out.println("Number of invoice1: " + invoice1.getPartNumber() + ", details about invoice: " +
                invoice1.getDescription() + ". Quantity is " + invoice1.getQuantity() + ", one details price is "
                + invoice1.getPrice() + ". Total amount is " + invoice1.getInvoiceAmount() + " because quantity is negative number. ");

        Invoice invoice2 = new Invoice("7824something", "Some documentation", 1, -1);
        System.out.println("Number of invoice2: " + invoice2.getPartNumber() + ", details about invoice: " +
                invoice2.getDescription() + ". Quantity is " + invoice2.getQuantity() + ", one details price is "
                + invoice2.getPrice() + ". Total amount is " + invoice2.getInvoiceAmount() + " because price is negative number. ");
    }
}
