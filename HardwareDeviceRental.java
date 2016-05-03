//import flies from java library
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.ArrayList;


/**
 * This class creates a GUI and allows user to
 * create and manage Hardware devices for rent and sale.
 * @author Bachan Ghimire
 * @version 30th April 2016
 */

public class HardwareDeviceRental implements ActionListener 
{
    //create instance variables and components
    private final ArrayList<HardwareDevice> hardwareDevices;
    private JFrame frame;
    private JPanel rentPane; 
    private JPanel sellPane;
    private JTextField rentDescriptionField;
    private JTextField rentManufacturerField;
    private JTextField rentCustomerNameField;
    private JTextField dailyRateField;
    private JTextField advancePaymentField;
    private JTextField hireDateField;
    private JTextField returnDateField;
    private JTextField numberOfDaysField;
    private JTextField rentHardwareDeviceNumberField;
    private JTextField rentHardwareDeviceNumberFieldToReturn;
    private JTextField sellDescriptionField;
    private JTextField sellManufacturerField;
    private JTextField sellCustomerNameField;
    private JTextField sellPriceField;
    private JTextField sellTaxRateField;
    private JTextField sellHardwareDeviceNumberField;
    private JTextField sellDateField;   
    private JLabel rentDescriptionLabel;
    private JLabel rentManufacturerLabel;
    private JLabel rentCustomerNameLabel;
    private JLabel dailyRateLabel;
    private JLabel advancePaymentLabel;
    private JLabel hireDateLabel;
    private JLabel returnDateLabel;
    private JLabel numberOfDaysLabel;
    private JLabel rentHardwareDeviceNumberLabel;
    private JLabel sellDescriptionLabel;
    private JLabel sellManufacturerLabel;
    private JLabel sellCustomerNameLabel;
    private JLabel sellPriceLabel;
    private JLabel sellTaxRateLabel;
    private JLabel sellHardwareDeviceNumberLabel;
    private JLabel sellDateLabel;
    private JButton addToRentButton;
    private JButton rentButton;
    private JButton clearRentButton;
    private JButton displayAllRentButton;
    private JButton returnHardwareButton;
    private JButton addToSellButton;
    private JButton sellButton;
    private JButton clearSellButton;
    private JButton displayAllSellButton;

    /**
     * The constructor for the class HardwareDeviceRental
     * which creates a new array list to hold the hardware devices
     * and creates and displays the GUI to the user.
     */
    private HardwareDeviceRental(){

        hardwareDevices= new ArrayList<HardwareDevice>();
        this.initializeComponent();

    }

    /**
     * The main method to start the
     * program from the command line.
     */
    public static void main(String[] args) {
        new HardwareDeviceRental();
    }

    /**
     * This method to creates a new JFrame
     * add other components inside the JFrame
     * and display it to the user.
     */
    private void initializeComponent(){

        // Create a new JFrame
        frame = new JFrame("Bachan Programs: Hardware Rental and Selling System");
        // Terminate the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Do not allow the window to be resized
        frame.setResizable(false);
        frame.setLayout(null);
        // Add components to the frame
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        // Set the size to 1000px wide and 480px height
        frame.setSize(1000, 480);
        // Show the window at the center of the screen
        frame.setLocationRelativeTo(null);
        // Show the window
        frame.setVisible(true);

    }

    /**
     * The method that adds the components
     * inside the JFrame container
     * both from rental and sale pane
     */
    private void addComponentsToPane(final Container container) {
        // Add the rental pane components to the container
        container.add(getRentalPane());
        // Add the sale pane components to the container
        container.add(getSalePane());
    }

    /**
     * This method creates the rental pane and
     * adds all the label, text fields and buttons to it
     * It rerurns the rental pane
     */
    private JPanel getRentalPane() {

        // Create a new Panel
        rentPane = new JPanel();
        rentPane.setLayout(null);
        // Set the size for the panel
        rentPane.setBounds(10, 10, 485, 430);
        // Create a border for the panel
        rentPane.setBorder(BorderFactory.createTitledBorder("Hardware Device to Rent"));

        // The label for description
        rentDescriptionLabel = new JLabel("Description:");
        rentDescriptionLabel.setBounds(20, 30, 90, 30);
        rentPane.add(rentDescriptionLabel);

        // The text field for description
        rentDescriptionField = new JTextField();
        rentDescriptionField.setBounds(110, 30, 355, 30);
        rentPane.add(rentDescriptionField);

        // The label for manufacturer
        rentManufacturerLabel = new JLabel("Manufacturer:");
        rentManufacturerLabel.setBounds(20, 65, 90, 30);
        rentPane.add(rentManufacturerLabel);

        // The text field for manufacturer
        rentManufacturerField = new JTextField();
        rentManufacturerField.setBounds(110, 65, 355, 30);
        rentPane.add(rentManufacturerField);

        // The label for daily rate
        dailyRateLabel = new JLabel("Daily Rate:");
        dailyRateLabel.setBounds(20, 100, 90, 30);
        rentPane.add(dailyRateLabel);

        // The text field for daily rate
        dailyRateField = new JTextField();
        dailyRateField.setBounds(110, 100, 112, 30);
        rentPane.add(dailyRateField);

        // The button to add a new hardware device for rent
        addToRentButton = new JButton("Add to Rent");
        addToRentButton.setBounds(322, 135, 143, 30);
        addToRentButton.addActionListener(this);
        rentPane.add(addToRentButton);

        // Seperator to seperate the components
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(20, 175, 445, 10);
        rentPane.add(separator);

        // The label for Customer Name
        rentCustomerNameLabel = new JLabel("Customer Name:");
        rentCustomerNameLabel.setBounds(20, 195, 100, 30);
        rentPane.add(rentCustomerNameLabel);

        // The text field for Customer Name Field
        rentCustomerNameField = new JTextField();
        rentCustomerNameField.setBounds(120, 195, 345, 30);
        rentPane.add(rentCustomerNameField);

        // The label for Hire Date
        hireDateLabel = new JLabel("Hire Date:");
        hireDateLabel.setBounds(20, 230, 90, 30);
        rentPane.add(hireDateLabel);

        // The text field for Hire Date
        hireDateField = new JTextField();
        hireDateField.setBounds(120, 230, 102, 30);
        rentPane.add(hireDateField);

        // The label for Return Date
        returnDateLabel = new JLabel("Return Date:");
        returnDateLabel.setBounds(232, 230, 90, 30);
        rentPane.add(returnDateLabel);

        // The text field for Return Date
        returnDateField = new JTextField();
        returnDateField.setBounds(322, 230, 143, 30);
        rentPane.add(returnDateField);

        // The label for Number of Days
        numberOfDaysLabel = new JLabel("Num. of Days:");
        numberOfDaysLabel.setBounds(20, 265, 90, 30);
        rentPane.add(numberOfDaysLabel);

        // The text field for Number of Days
        numberOfDaysField = new JTextField();
        numberOfDaysField.setBounds(120, 265, 102, 30);
        rentPane.add(numberOfDaysField);        
        
        // The label for the Hardware device Number
        rentHardwareDeviceNumberLabel = new JLabel("Device Num.:");
        rentHardwareDeviceNumberLabel.setBounds(232, 265, 90, 30);
        rentPane.add(rentHardwareDeviceNumberLabel);

        // The text field for Hardware device Number
        rentHardwareDeviceNumberField = new JTextField();
        rentHardwareDeviceNumberField.setBounds(322, 265, 143, 30);
        rentPane.add(rentHardwareDeviceNumberField);

        // The label for advance payment
        advancePaymentLabel = new JLabel("Advance Amount:");
        advancePaymentLabel.setBounds(220, 300, 190, 30);
        rentPane.add(advancePaymentLabel);

        // The text field for advance payment
        advancePaymentField = new JTextField();
        advancePaymentField.setBounds(322, 300, 143, 30);
        rentPane.add(advancePaymentField);        

        // The button to rent the hardware device
        rentButton = new JButton("Rent");
        rentButton.setBounds(110, 335, 112, 30);
        rentButton.addActionListener(this);
        rentPane.add(rentButton);

        // The button to clear all the fields
        clearRentButton = new JButton("Clear");
        clearRentButton.setBounds(227, 335, 90, 30);
        clearRentButton.addActionListener(this);
        rentPane.add(clearRentButton);

        // The button to display all the hardware devices for rent
        displayAllRentButton = new JButton("Display All");
        displayAllRentButton.setBounds(322, 335, 143, 30);
        displayAllRentButton.addActionListener(this);
        rentPane.add(displayAllRentButton);

        // Seperator to seperate the components
        JSeparator separator1 = new JSeparator();
        separator1.setBounds(20, 375, 445, 10);
        rentPane.add(separator1);

        // The label for hardware device Number
        rentHardwareDeviceNumberLabel = new JLabel("HardwareDevice Number:");
        rentHardwareDeviceNumberLabel.setBounds(20, 385, 190, 30);
        rentPane.add(rentHardwareDeviceNumberLabel);

        // The text field for hardware device Number to return
        rentHardwareDeviceNumberFieldToReturn = new JTextField();
        rentHardwareDeviceNumberFieldToReturn.setBounds(170, 385, 150, 30);
        rentPane.add(rentHardwareDeviceNumberFieldToReturn);

        returnHardwareButton = new JButton("Return Hardware");
        returnHardwareButton.setBounds(322, 385, 143, 30);
        returnHardwareButton.addActionListener(this);
        rentPane.add(returnHardwareButton);

        return rentPane;      

    }

    private JPanel getSalePane() {
        // Create a new Panel
        sellPane = new JPanel();
        sellPane.setLayout(null);
        // Set the size for the panel
        sellPane.setBounds(500, 10, 485, 310);
        // Create a border for the panel
        sellPane.setBorder(BorderFactory.createTitledBorder("Hardware Device to Sell"));

        // The label for description
        sellDescriptionLabel = new JLabel("Description:");
        sellDescriptionLabel.setBounds(20, 30, 90, 30);
        sellPane.add(sellDescriptionLabel);

        // The text field for description
        sellDescriptionField = new JTextField();
        sellDescriptionField.setBounds(110, 30, 355, 30);
        sellPane.add(sellDescriptionField);

        // The label for price
        sellPriceLabel = new JLabel("Price:");
        sellPriceLabel.setBounds(20, 65, 90, 30);
        sellPane.add(sellPriceLabel);

        // The text field for price
        sellPriceField = new JTextField();
        sellPriceField.setBounds(110, 65, 112, 30);
        sellPane.add(sellPriceField);

        // The label for fuel tax rate
        sellTaxRateLabel = new JLabel("Tax Rate:");
        sellTaxRateLabel.setBounds(232, 65, 90, 30);
        sellPane.add(sellTaxRateLabel);

        // The text field for tax rate
        sellTaxRateField = new JTextField();
        sellTaxRateField.setBounds(322, 65, 143, 30);
        sellPane.add(sellTaxRateField);

        // The label for manufacturer
        sellManufacturerLabel = new JLabel("Manufacturer:");
        sellManufacturerLabel.setBounds(20, 100, 90, 30);
        sellPane.add(sellManufacturerLabel);

        // The text field for manufacturer
        sellManufacturerField = new JTextField();
        sellManufacturerField.setBounds(110, 100, 180, 30);
        sellPane.add(sellManufacturerField);

        // Button to add hardware device for Sale
        addToSellButton = new JButton("Add to Sell");
        addToSellButton.setBounds(322, 100, 143, 30);
        addToSellButton.addActionListener(this);
        sellPane.add(addToSellButton);

        // Sepeartor to seperate the components
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(20, 140, 445, 10);
        sellPane.add(separator);

        // The label for Customer Name
        sellCustomerNameLabel = new JLabel("Customer:");
        sellCustomerNameLabel.setBounds(20, 160, 90, 30);
        sellPane.add(sellCustomerNameLabel);

        // The text field for customer name
        sellCustomerNameField = new JTextField();
        sellCustomerNameField.setBounds(110, 160, 355, 30);
        sellPane.add(sellCustomerNameField);

        // The label for date of sale
        sellDateLabel = new JLabel("Date:");
        sellDateLabel.setBounds(20, 195, 90, 30);
        sellPane.add(sellDateLabel);

        // The text field for date of sale
        sellDateField = new JTextField();
        sellDateField.setBounds(110, 195, 112, 30);
        sellPane.add(sellDateField);

        // The label for hardware device number to sell
        sellHardwareDeviceNumberLabel = new JLabel("Device Num:");
        sellHardwareDeviceNumberLabel.setBounds(20, 230, 90, 30);
        sellPane.add(sellHardwareDeviceNumberLabel);

        // The text field for hardware device number to Sell
        sellHardwareDeviceNumberField = new JTextField();
        sellHardwareDeviceNumberField.setBounds(110, 230, 112, 30);
        sellPane.add(sellHardwareDeviceNumberField);

        // Button to sell the hardware device
        sellButton = new JButton("Sell");
        sellButton.setBounds(110, 265, 112, 30);
        sellButton.addActionListener(this);
        sellPane.add(sellButton);

        // Button to clear all the fields
        clearSellButton = new JButton("Clear");
        clearSellButton.setBounds(227, 265, 90, 30);
        clearSellButton.addActionListener(this);
        sellPane.add(clearSellButton);

        // Button to display all the hardware devices for sale
        displayAllSellButton = new JButton("Display All");
        displayAllSellButton.setBounds(322, 265, 143, 30);
        displayAllSellButton.addActionListener(this);
        sellPane.add(displayAllSellButton);

        return sellPane;

    }
    
    /**
     * This method is called when the buttons are clicked
     * and it handles the event.
     * 
     */
    public void actionPerformed(ActionEvent event){       
        
        try{

            //if add to rent rent button pressed
            if(event.getSource()==addToRentButton){

                //call method for adding the rent
                this.addDevicetoRent();
            }

            //if rent button is pressed
            if(event.getSource()==rentButton){

                this.rentDevice();
            }

            if(event.getSource()==clearRentButton){

                this.clearRentFields();
            }

            if(event.getSource()==displayAllRentButton){

                this.displayAllRent();
            }

            if(event.getSource()==returnHardwareButton){

                this.returnHardware();
            }

            if(event.getSource()== addToSellButton){

                this.addDeviceToSell();
            }

            if(event.getSource()==sellButton){

                this.sellDevice();
            }

            if(event.getSource()==clearSellButton){

                this.clearSaleFields();
            }

            if(event.getSource()==displayAllSellButton){

                this.displayAllSell();
            }

        }

        //catch any unexpected exceptions
        catch(Exception e){

            JOptionPane.showMessageDialog(frame, "An unexpected exception was thrown, try again!", "Error Message", JOptionPane.ERROR_MESSAGE);        

        }

    }

    /**
     * This method enables adding of new device to list
     * and also checks for any errors
     * in the form while adding a hardware device to rent.
     */    
    private void addDevicetoRent() {       
        
        
        try{

            //get values of respective text fields
            String rentDescription= rentDescriptionField.getText().trim();
            String rentManufacturer= rentManufacturerField.getText().trim();
            double rentDailyRate;
            rentDailyRate = Double.parseDouble(dailyRateField.getText().trim());

            //if none of the feilds are blank
            if( (!rentDescription.equals("") ) && (!rentManufacturer.equals("")) && (rentDailyRate>=0) ){
                
                //Create a new HardwareDeviceToRent object              
                HardwareDeviceToRent rentHardware = new HardwareDeviceToRent(rentDescription, rentManufacturer, rentDailyRate);
                //add device to list 
                hardwareDevices.add(rentHardware);  

                JOptionPane.showMessageDialog(frame, "Hardware Device Sucessfully Added!", "Information Message", JOptionPane.INFORMATION_MESSAGE); 
            
            }

            else{
                JOptionPane.showMessageDialog(frame, "All fields are required to properly be inputted, check your input fields again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }

            //clear the text fields for adding other device
            rentDescriptionField.setText("");
            rentManufacturerField.setText("");
            dailyRateField.setText("");

        }

        catch(NumberFormatException e){

                JOptionPane.showMessageDialog(frame, "Number format exception thrown. Enter valid daily rate!", "Error Message", JOptionPane.ERROR_MESSAGE);            
        }

    }

    /**This method rents out the hardware device
     * the method of renting hardware device from
     * HardwareDeviceToRent class is called 
     */
    private void rentDevice(){

        try{

            //get values from text fields
            String customerName= rentCustomerNameField.getText().trim();
            String hireDate= hireDateField.getText().trim();
            String returnDate= returnDateField.getText().trim();
            int numberOfDays= Integer.parseInt(numberOfDaysField.getText().trim());
            int rentDeviceNumber= Integer.parseInt(rentHardwareDeviceNumberField.getText().trim());
            double advanceAmount= Double.parseDouble(advancePaymentField.getText().trim());           
            
            //if fields have valid values
            if((!customerName.equals(""))&&(!hireDate.equals(""))&&(!returnDate.equals(""))&&(numberOfDays>=0)){

                    //if array index out of bound
                    if(rentDeviceNumber>=hardwareDevices.size()){

                        JOptionPane.showMessageDialog(frame, "Invalid Index in ArrayList!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                                             
                    }

                    //else rent out the device 
                    else{

                        //if hardware device is not an instance of HardwareDeviceToRent
                        if (!(hardwareDevices.get(rentDeviceNumber) instanceof HardwareDeviceToRent)){

                            JOptionPane.showMessageDialog(frame, "The device is for sale, not rent!", "Error Message", JOptionPane.ERROR_MESSAGE);
                        }

                        else{    
                            //create object of HardwareDeviceToRent and store object of HardwareDevice from list, as a cast
                            HardwareDeviceToRent rentingDevice= (HardwareDeviceToRent)hardwareDevices.get(rentDeviceNumber);
                            rentingDevice.rentMethod(customerName, hireDate, returnDate, numberOfDays, advanceAmount);
                            JOptionPane.showMessageDialog(frame,"View output window to read your booking status.", "Information Message",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }                               
                
            }

            //if fields have invalid values
            else{

                JOptionPane.showMessageDialog(frame, "All fields require valid values. Please check the values again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }

        //catch number format exception
        catch(NumberFormatException ex){   

            JOptionPane.showMessageDialog(frame, "Number format exception was thrown. Enter valid numbers!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }       

    }

    /**This method clears out the text fields
     * both from adding to rent and renting label
     */    
    private void clearRentFields(){

        //setting text fields related to renting as empty strings
        rentDescriptionField.setText("");
        dailyRateField.setText("");
        rentManufacturerField.setText("");
        rentCustomerNameField.setText("");
        hireDateField.setText("");
        returnDateField.setText("");
        advancePaymentField.setText("");
        rentHardwareDeviceNumberField.setText("");
        numberOfDaysField.setText("");
    } 

    /**This method displays the properties the hardware device
     * that are either booked or free
     */ 
    private void displayAllRent(){

        System.out.println("Hardware Device on Rent:");

        // For each hardware device in the hardwareDevices array list
        for (HardwareDevice hardware : hardwareDevices) {    

            // If the hardware is not an instance of HardwareDeviceToRent
            if (!(hardware instanceof HardwareDeviceToRent)) {  
                //skips that hardware device
                continue;   
            }
            // Show the details about the hardware
            hardware.displayDetails();
            System.out.println();
        }
    }

    /**This method returns out the hardware device
     * checks the index in array list to return and free the hardware
     */   
    private void returnHardware(){

        try{

            int index;
            index= Integer.parseInt(rentHardwareDeviceNumberFieldToReturn.getText().trim());
            
            //if array index out of bound
            if(index>=hardwareDevices.size() ){

                        JOptionPane.showMessageDialog(frame, "Invalid Index in ArrayList!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                                             
            }
            
            else{
                //if the hardware is not instance of HardwareDeviceToSell
                if (!(hardwareDevices.get(index) instanceof HardwareDeviceToRent)){
    
                    JOptionPane.showMessageDialog(frame, "The device is for sale, not rent!", "Error Message", JOptionPane.ERROR_MESSAGE);
    
                }
                else{
                    //create object of HardwareDeviceToRent and store object of HardwareDevice from list, as a cast
                    HardwareDeviceToRent rentingDevice= (HardwareDeviceToRent)hardwareDevices.get(index);
                    rentingDevice.availableMethod();
    
                    JOptionPane.showMessageDialog(frame,"Hardware sucessfully returned.", "Information Message",JOptionPane.INFORMATION_MESSAGE);
                }
            
            }
        }

        //catch number format exception
        catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(frame, "Number format exception was thrown. Enter valid number!", "Error Message", JOptionPane.ERROR_MESSAGE);

        }

        //catch index out of bounds exception
        catch(ArrayIndexOutOfBoundsException ex){

            JOptionPane.showMessageDialog(frame, "Array index out of bounds!", "Error Message", JOptionPane.ERROR_MESSAGE);

        }

        rentHardwareDeviceNumberFieldToReturn.setText("");
    }

    /**
     * This method enables adding of new device to list for sell
     * and also checks for any errors
     * in the form while adding a hardware device to sell.
     */   
    private void addDeviceToSell(){

         try{

            //get values of respective text fields
            String sellDescription= sellDescriptionField.getText().trim();
            String sellManufacturer= sellManufacturerField.getText().trim();
            double sellPrice;
            sellPrice = Double.parseDouble(sellPriceField.getText().trim());
            double taxRate= Double.parseDouble(sellTaxRateField.getText().trim());

            //if none of the feilds are blank
            if( (!sellDescription.equals("") ) && (!sellManufacturer.equals("")) && (sellPrice>=0) && (taxRate>=0)){
                
                //Create a new HardwareDeviceToSell object              
                HardwareDeviceToSell sellHardware = new HardwareDeviceToSell (sellDescription, sellManufacturer, sellPrice, taxRate);
                //add device to list 
                hardwareDevices.add(sellHardware);  

                JOptionPane.showMessageDialog(frame, "Hardware Device Sucessfully Added!", "Information Message", JOptionPane.INFORMATION_MESSAGE); 
            
            }

            else{
                JOptionPane.showMessageDialog(frame, "All fields are required to properly be inputted, check your input fields again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }

            //clear the text fields for adding other device
            sellDescriptionField.setText("");
            sellManufacturerField.setText("");
            sellPriceField.setText("");
            sellTaxRateField.setText("");

        }

        catch(NumberFormatException e){

                JOptionPane.showMessageDialog(frame, "Number format exception thrown. Enter valid price and rate!", "Error Message", JOptionPane.ERROR_MESSAGE);            
        }

    }

    /**This method sells the hardware device
     * the method of selling hardware device from
     * HardwareDeviceToSell class is called 
     */
    private void sellDevice(){

        try{

            //get values from text fields
            String customerName= sellCustomerNameField.getText().trim();
            String sellDate= sellDateField.getText().trim();            
            int sellDeviceNumber= Integer.parseInt(sellHardwareDeviceNumberField.getText().trim());

            //if fields have valid values
            if((!customerName.equals(""))&&(!sellDate.equals(""))){

                    //if array index out of bound
                    if(sellDeviceNumber>=hardwareDevices.size()) {

                        JOptionPane.showMessageDialog(frame, "Invalid Index in ArrayList!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                                             
                    }

                    //else sell the device 
                    else{

                        //if hardware device is not an instance of HardwareDeviceToSell
                        if (!(hardwareDevices.get(sellDeviceNumber) instanceof HardwareDeviceToSell)){

                            JOptionPane.showMessageDialog(frame, "The device is for rent, not sale!", "Error Message", JOptionPane.ERROR_MESSAGE);
                        }

                        else{    
                            //create object of HardwareDeviceToSell and store object of HardwareDevice from list, as a cast
                            HardwareDeviceToSell sellingDevice= (HardwareDeviceToSell)hardwareDevices.get(sellDeviceNumber);
                            sellingDevice.sellMethod(customerName, sellDate);
                            JOptionPane.showMessageDialog(frame,"View output window to read your selling status.", "Information Message",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }                               
                
            }

            //if fields have invalid values
            else{

                JOptionPane.showMessageDialog(frame, "All fields require valid values. Please check the values again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }

        //catch number format exception
        catch(NumberFormatException ex){   

            JOptionPane.showMessageDialog(frame, "Number format exception was thrown. Enter valid numbers!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }       

    }

    /**This method clears out the text fields
     * both from adding to sale and selling label
     */    
    private void clearSaleFields(){

        //setting text fields related to renting as empty strings
        sellDescriptionField.setText("");
        sellPriceField.setText("");
        sellManufacturerField.setText("");
        sellTaxRateField.setText("");
        sellCustomerNameField.setText("");
        sellHardwareDeviceNumberField.setText("");
        sellDateField.setText("");
    } 

    /**This method displays the properties the hardware device
     * that are either booked or free
     */ 
    private void displayAllSell(){

        System.out.println("Hardware Device on Sale:");

        // For each hardware device in the hardwareDevices array list
        for (HardwareDevice hardware : hardwareDevices) {    

            // If the hardware is not an instance of HardwareDeviceToSell
            if (!(hardware instanceof HardwareDeviceToSell)) {  
                //skips that hardware device
                continue;   
            }
            // Show the details about the hardware
            hardware.displayDetails();
            System.out.println();
        }
    }



}
