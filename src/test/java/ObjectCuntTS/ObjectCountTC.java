package ObjectCuntTS;


import ChangDefaultDirectory.ChangeDefaultDirectoryPO;

public class ObjectCountTC {

    static int numberOfObjectCount = 0;

    {
        numberOfObjectCount++;
    }

    /**
     * @author Vidhi chapanera
     * @discription This method is get the count of object available in this class
     * created on : 22-05-2020
     */
    public static void main(String args[]){

        ObjectCountTC countTC = new ObjectCountTC();


        System.out.println("the Total Object are : " + countTC.numberOfObjectCount);
    }
}
