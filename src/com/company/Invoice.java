package com.company;

public class Invoice {

        private String partNumber;
        private  String description;
        private  int quantity;
        private int price;

        public Invoice(String partNumber, String description, int quantity, int price) {
            this.partNumber = partNumber;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getPartNumber() {
            return partNumber;
        }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getPrice() {
            return price;
        }

        public int getInvoiceAmount(){

            if(getQuantity() < 0 | getPrice() < 0){
            setQuantity(0);
            setPrice(0);
            }

            return getQuantity() * getPrice();
        }
}
