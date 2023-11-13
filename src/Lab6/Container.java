package Lab6;

import java.io.*;
import java.util.*;

/**
 * The {@code Container} class is a generic container that can hold objects. It
 * provides methods for adding and removing objects, as well as querying the
 * size of the container.
 * In your implementation of this class:
 * 1. No System.out.println statements should appear here. Instead, you need to return the result.
 * 2. No Scanner operations should appear here (e.g., input.nextInt()). Instead, refer to the input parameters of this method.
 */
public class Container {
    // No instance variable should be defined for this class.
    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    public static void main(String[] args) {
        Container container1 = new Container(); // each Container object has an ArrayList called objects
        Container container2 = new Container();

        container1.add("Hello"); // we don't need to do container1.objects.add("Hello"); because we have a method that does that for us
        container1.add(123);
        container1.add(45.67);

        container2.add("World");
        container2.add(456);

        System.out.println("Container 1 size: " + container1.getSize()); // Should output 3
        System.out.println("Container 2 size: " + container2.getSize()); // Should output 2

        System.out.println("Removed from Container 1: " + container1.remove()); // Should output 45.67
        System.out.println("Container 1 size after removal: " + container1.getSize()); // Should output 2

        // Let's try to remove from an empty container
        Container emptyContainer = new Container();
        System.out.println("Removed from empty container: " + emptyContainer.remove()); // Should output null
    }
    public ArrayList<Object> objects; // ArrayList that holds objects
    public Container() {
        this.objects = new ArrayList<>(); // every time a Container object is created, a new ArrayList is created that the object holds
        // so basically, every Container object has its own ArrayList named
    }
    public void add(Object object) {
        this.objects.add(object);
    }
    public Object remove() {
        if(!objects.isEmpty()) return objects.remove(objects.size() - 1); // removes last element in ArrayList, and returns it
        // objects.size() - 1 is the last index of the ArrayList
        return null; // if ArrayList empty, return null
    }
    public int getSize() {
     return objects.size(); // same as ArrayList size() method
    }
}

/**
 * The {@code Queue} class simulates a queue data structure, inserting and
 * removing data by the FIFO (first-in, first-out) rule. It stores orders with a
 * total amount above or equal to 1500 in the queue.
 *
 */
class Queue extends Container {
    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    private ArrayList<Order> orders; // ArrayList that holds Order objects

    public Queue(String fileName) { // Constructs a Queue object by reading orders from the specified file and storing orders with total amount above or equal to 1500 in the queue.
        this.orders = new ArrayList<>();

        List<String> lines = IOHandler.readFile(fileName); // read file and store each line in ArrayList
        for (String line : lines) { // for each line in ArrayList
            String[] orderInfo = line.split(","); // split line by comma
            int orderId = Integer.parseInt(orderInfo[0].trim()); // first index is order ID
            String customerName = orderInfo[1].trim(); // second index is customer name
            String productName = orderInfo[2].trim(); // third index is product name
            int quantity = Integer.parseInt(orderInfo[3].trim()); // fourth index is quantity
            double unitPrice = Double.parseDouble(orderInfo[4].trim()); // fifth index is unit price
            Order order = new Order(orderId, customerName, productName, quantity, unitPrice); // create Order object with info from file
            if (order.getTotalAmount() >= 1500) { // if total amount of order is greater than or equal to 1500
                this.orders.add(order); // add order to ArrayList
            }
        }
    }
    @Override
    public void add(Object obj) {
        if(obj instanceof Order) {
            Order order = (Order) obj;
            if(order.getTotalAmount() >= 1500) {
                this.orders.add(order);
            }
        }
    }
    @Override
    public Object remove() {
        if(!orders.isEmpty()) return this.orders.remove(0); // removes first element in ArrayList, and return ArrayList
        return null; // if ArrayList empty, return null
    }
    public Object top() { // peek() method
        if(!orders.isEmpty()) return this.orders.get(0); // returns first element in ArrayList.
        return null;
    }
    @Override
    public int getSize() { // p.s I'm aware that I don't need to override this method as it's the same as the Container class getSize() method
        return this.orders.size(); // same as ArrayList size() method
    }
}

/**
 * The {@code Stack} class simulates a stack data structure, inserting and
 * removing data by the FILO (first-in, last-out) rule. It stores orders with a
 * total amount below 1500 in the stack.
 *
 */
class Stack extends Container {

    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    private ArrayList<Order> orders; // ArrayList that holds Order objects
    public Stack(String fileName) { // Constructs a Stack object by reading orders from the specified file and storing orders with total amount below 1500 in the stack.
        this.orders = new ArrayList<>();
        List<String> lines = IOHandler.readFile(fileName); // read file and store each line in ArrayList
        for (String line : lines) { // for each line in ArrayList
            String[] orderInfo = line.split(","); // split line by comma
            int orderId = Integer.parseInt(orderInfo[0].trim()); // first index is order ID
            String customerName = orderInfo[1].trim(); // second index is customer name
            String productName = orderInfo[2].trim(); // third index is product name
            int quantity = Integer.parseInt(orderInfo[3].trim()); // fourth index is quantity
            double unitPrice = Double.parseDouble(orderInfo[4].trim()); // fifth index is unit price
            Order order = new Order(orderId, customerName, productName, quantity, unitPrice); // create Order object with info from file
            if (order.getTotalAmount() < 1500) { // if total amount of order is less than or equal to 1500
                this.orders.add(order); // add order to ArrayList
            }
        }
    }
    @Override
    public void add(Object obj) {
        if(obj instanceof Order) {
            Order order = (Order) obj;
            if(order.getTotalAmount() < 1500) {
                this.orders.add(order);
            }
        }
    }
    @Override
    public Object remove() { // pop() method for stack
        if(!orders.isEmpty()) return this.orders.remove(this.orders.size() - 1); // removes last element in ArrayList, and return ArrayList
        return null; // if ArrayList empty, return null
    }
    public Object top() { // peek() method for stack
        if(!orders.isEmpty()) return this.orders.get(this.orders.size() - 1); // returns last element in ArrayList.
        return null;
    }
    @Override
    public int getSize() { // p.s I'm aware that I don't need to override this method as it's the same as the Container class getSize() method
        return this.orders.size(); // same as ArrayList size() method
    }
}

/**
 * The {@code IOHandler} class provides static methods for handling input and
 * output operations with files. It allows reading content from a file and
 * writing content to a file.
 *
 */
class IOHandler {

    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result. */
    public static List<String> readFile(String fileName) { // read file uses BufferedReader and adds each line to an ArrayList
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line; // string that holds each line of text for each iteration of the while loop cuz readLine() returns a string
            while ((line = reader.readLine())  != null) { // end of file
                lines.add(line); // add line that was read to the ArrayList
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    // static as we don't need to create an instance of the class to use this method, and it's not related to the class
    public static void writeFile(String fileName, List<String> content) { // writing file to txt uses BufferedWriter
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
        for (String line : content) {
            bw.write(line); // write whatever is in the ArrayList indexes to txt file line by line
            bw.newLine(); // new line for each List element
        }
    }
    catch (IOException e) {
        e.printStackTrace();
        }
    }
}

/**
 * The {@code Order} class represents an order in the order processing system.
 * It encapsulates information about the order such as order ID, customer name,
 * product name, quantity, and unit price.
 **/
class Order {

    /*  Your implementation starts here
     * Recall that :
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    private int orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double unitPrice;
    public Order(int orderId, String customerName, String productName, int quantity, double unitPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return this.quantity * this.unitPrice;
    }
    @Override
    public String toString() {
        return "Order ID: " + this.orderId + "\nCustomer Name: " + this.customerName + "\nProduct Name: " + this.productName + "\nQuantity: " + this.quantity + "\nUnit Price: " + this.unitPrice + "\nTotal Amount: " + this.getTotalAmount();
    }

}
