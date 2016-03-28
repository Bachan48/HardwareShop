/**
 * Class HardwareDevice, a parent class of 2 other subclasses.
 * Class created to define primary attributes about the company and products.
 * Attributes, constructor and methods declared. 
 * 
 * @author (Bachan Ghimire) 
 * @version (28th March 2016)
 */
public class HardwareDevice
{
    //declaring attributes
    private String hardwareDescription;
    private String hardwareManufacturer;
    private String customerName;
    
     /**
     * Constructor for objects of class HardwareDevice
     * Accepts 2 parameter. 
     * All the attributes are initialized. 
     */
    public HardwareDevice(String hardwareDescription, String hardwareManufacturer)
    {
       // initialize all the attributes
       this.hardwareDescription= hardwareDescription;
       this.hardwareManufacturer= hardwareManufacturer;
       customerName= "";
    }

    /**
     * Accessor method for hardwareDescription attribute
     * return the hardwareDescription
     */
    public String getHardwareDescription()
    {
       return hardwareDescription;
    }
    
    /**
     * Accessor method for hardwareManufacturer attribute
     * return the hardwareMnufacturer
     */
    public String getHardwareManufacturer()
    {
       return hardwareManufacturer;
    }
    
    /**
     * Accessor method for customerName attribute
     * return the customerName
     */
    public String getCustomerName()
    {
       return customerName;
    }
    
    /**
     * Mutator method for customerName attribute
     * Set the customerName
     */
    public void setCustomerName(String customerName)
    {
        this.customerName= customerName;
    }
    
    /**
     * Display method for displaying some details
     * Displays Discription of the hardware device, Manufacturer and "Customer's Name
     */
    public void displayDetails()
    {
        System.out.println("Description of the hardware device: " + getHardwareDescription());
        System.out.println("Manufacturer of the hardware device: " + getHardwareManufacturer());
            // if customer's name is not emmpty, display their name. 
            if(customerName != ""){
                System.out.println("Customer's Name: " + getCustomerName());
            }
    }
}



/**
 * Subclass of the class HardwareDevice
 * A class that makes hardware renting possible.
 * @author (Bachan Ghimire) 
 * @version (28th March 2016)
 */
public class HardwareDeviceToRent extends HardwareDevice
{   
    //declaring all the attributes
    private String hardwareHireDate;
    private String hardwareReturnDate;
    private int numberOfDays;
    private double dailyRentalRate;
    private double advancePayment;
    private double totalRentalCost;
    private boolean isLoanedOut;
    
    /**
     * Constructor for objects of class HardwareDeviceToRent
     * 3 paramaters are passed in the constructor. 
     * Attributes are initialized.
     */
    public HardwareDeviceToRent(String hardwareDescription, String hardwareManufacturer, double dailyRentalRate)
    {
        //super class constructor called
        super(hardwareDescription, hardwareManufacturer);
        //other attributes initialized
        this.dailyRentalRate= dailyRentalRate;
        hardwareHireDate="";
        hardwareReturnDate="";
        numberOfDays=0;
        advancePayment=0;
        totalRentalCost=0;
        isLoanedOut=false;
    }

    /**
     * Accessor method for hardwareHireDate attribute
     * return the hardwareHireDate
     */
    public String getHardwareHireDate()
    {
       return hardwareHireDate;
    }
    
    /**
     * Accessor method for hardwareReturnDate attribute
     * return the hardwareReturnDate
     */
    public String getHardwareReturnDate()
    {
       return hardwareReturnDate;
    }
    
    /**
     * Accessor method for numberOfDays attribute
     * return the numberOfDays
     */
    public int getNumberOfDays()
    {
       return numberOfDays;
    }
    
    /**
     * Accessor method for dailyRentalRate attribute
     * return the dailyRentalRate
     */
    public double getDailyRentalRate()
    {
       return dailyRentalRate;
    }
    
    /**
     * Accessor method for advancePayment attribute
     * return the advancePayment
     */
    public double getAdvancePayment()
    {
       return advancePayment;
    }
    
    /**
     * Accessor method for totalRentalCost attribute
     * return the totalRentalCost
     */
    public double getTotalRentalCost()
    {
       return totalRentalCost;
    }
    
    /**
     * Accessor method for isLoanedOut attribute
     * return the isLoanedOut
     */
    public boolean getIsLoanedOut()
    {
       return isLoanedOut;
    }
    
    /**
     * Mutator method for dailyRentalRate attribute
     * Set the dailyRentalRate
     */
    public void setDailyRentalRate(double dailyRentalRate)
    {
       this.dailyRentalRate= dailyRentalRate;
    }
    
    /**
     * Method for Making rent out.
     * 5 parameters among attributes are passed and attributes are updated. 
     */
    public void rentMethod(String customerName, String hardwareHireDate, String hardwareReturnDate, int numberOfDays, double advancePayment)
    {
        //if booking is not available.
        if(getIsLoanedOut()==true){
            System.out.println("Sorry, the decive is already rented out. Check the status back on "+getHardwareReturnDate());
        }
        //if booking is available. 
         if(getIsLoanedOut()==false){
             //set customer's name
             setCustomerName(customerName);
             this.hardwareHireDate= hardwareHireDate;
             this.hardwareReturnDate= hardwareReturnDate;
             this.numberOfDays= numberOfDays;
             this.advancePayment= advancePayment;
             isLoanedOut= true;             
             totalRentalCost= getNumberOfDays()*getDailyRentalRate();
             
             //Print out the renting details after booking is made.
             System.out.println("Renting details:");
             System.out.println("Customer's name: "+getCustomerName());
             System.out.println("Renting date: "+ getHardwareHireDate());
             System.out.println("Returning date: "+ getHardwareReturnDate());
             System.out.println("Number of days: "+ getNumberOfDays());
             System.out.println("Advance payment: "+ getAdvancePayment());
             System.out.println("Total Cost: "+ getTotalRentalCost());
             System.out.println("Remaining payment: "+ (getTotalRentalCost()-getAdvancePayment()));
        }        
    }
    
    /**
     * Method for making renting available.
     * All of the attributes are set to null.
     */
    public void availableMethod()
    {
       //if booking is already available
       if(getIsLoanedOut()==false){
           System.out.println("Hardware device is already avaliable for renting.");
       }
       //if booking is not not available
       if(getIsLoanedOut()==true){ 
           setCustomerName("");
           hardwareHireDate= "";
           hardwareReturnDate= "";
           numberOfDays= 0;
           totalRentalCost= 0;
           advancePayment= 0;
           isLoanedOut= false;
        }
    } 
    
    /**
     * Method that prints the description of hardware.
     * It also prints the total amount received till date. 
     */
    public void printHardwareDescription(){
        System.out.println("Your hardware device is "+getHardwareDescription());       
        System.out.println("Total rent till date is "+getAdvancePayment()); 
    }
    
    /**
     * Method that displays details of the hardware device.
     * Mehod overriding is done, the method of superclass is also called. 
     */
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily rate for renting is "+getDailyRentalRate());
        
        //if on loan already,
        if(getIsLoanedOut()==true){
            System.out.println("The hardware device is currently on hire for "+getNumberOfDays()+ " days.");
            System.out.println("It was booked on "+ getHardwareReturnDate()+" ." );
            System.out.println("It will be available on "+ getHardwareHireDate()+" ." );
        }
    }
}



/**
 * Class HardwareDeviceToSell is a subclass of class HardwareDevice
 * A class that makes hardware selling possible.
 * @author (Bachan Ghimire) 
 * @version (28th March 2016)
 */
public class HardwareDeviceToSell extends HardwareDevice
{
    //attributes declared
    private double salesPrice;
    private double taxRate;
    private double totalSalesAmount;
    private String sellingDate;
    private boolean isSold;
    /**
     * Constructor for objects of class HardwareDeviceToSell
     * 5 paramaters are passed in the constructor. 
     * Attributes are initialized.
    */
    public HardwareDeviceToSell(String hardwareDescription, String hardwareManufacturer, double salesPrice, double taxRate )
    {
        //super class constructor called
        super(hardwareDescription,hardwareManufacturer);
        //initializing the attributes
        this.salesPrice= salesPrice;
        this.taxRate= taxRate;
        isSold= false;
        sellingDate="";
        totalSalesAmount=0;
    }

    /**
     * Accessor method for salesPrice attribute
     * return the salesPrice
     */
    public double getSalesPrice()
    {
       return salesPrice;
    }
    
    /**
     * Accessor method for taxAmount attribute
     * return the taxAmount
     */
    public double getTaxRate()
    {
       return taxRate;
    }
    
    /**
     * Accessor method for totalSalesAmount attribute
     * return the totalSalesAmount
     */
    public double getTotalSalesAmount()
    {
       return totalSalesAmount;
    }
    
    /**
     * Accessor method for sellingDate attribute
     * return the sellingDate
     */
    public String getSellingDate()
    {
       return sellingDate;
    }
    
    /**
     * Accessor method for isSold attribute
     * return the isSold
     */
    public boolean getIsSold()
    {
       return isSold;
    }
    
    /**
     * Mutator method for salesPrice attribute
     * Price is only changed if hardware device not sold.
     */
    public void setSalesPrice(double salesPrice){
        //if the hardware device has not been sold yet, set the new price.
        if(getIsSold()==false){
            this.salesPrice= salesPrice;
        }
        else{
            System.out.println("Hardware device already sold, price cannot be changed.");
        }
    }
    
    /**
     * Mutator method for taxAmount attribute
     * Tax is only changed if hardware device not sold.
     */
    public void setTaxRate(double taxRate){
        //if the hardware device has not been sold yet, set the new tax.
        if(getIsSold()==false){
            this.taxRate= taxRate;
        }
        else{
            System.out.println("Hardware device already sold, tax cannot be changed.");
        }
    }
    
    /**
     * Method for Making Sales.
     * 1 parameter is passed and few attributes are updated. 
     */
    public void sellMethod(String customerName){
        //if the hardware device has not been sold yet, make selling possible.
        if(getIsSold()==false){
            setCustomerName(customerName);
            isSold= true;
            totalSalesAmount= ((getTaxRate()/100)*getSalesPrice()) + getSalesPrice() ;
            
            System.out.println("Your purchase details are:");            
            displayDetails();
            System.out.println("Total cost on purchase: "+getTotalSalesAmount());            
        }
        else{
            System.out.println("Hardware device already sold.");
        }
    }
    
    /**
     * Method that displays details of the hardware device.
     * Mehod overriding is done, the method of superclass is also called. 
     */
    public void displayDetails(){
        super.displayDetails();
        //if device not sold,
        if(getIsSold()==false){
            System.out.println("Price of hardware device(without tax)is "+ getSalesPrice()+" ." );
        }
    }
}
