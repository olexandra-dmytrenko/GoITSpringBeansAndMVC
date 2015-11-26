package listkinds;

import java.util.*;

public class JavaCollection {
    List addressList;
    List addressList2;
    Set  addressSet;
    Map  addressMap;
    Properties addressProp;

    // a setter method to set List
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    // prints and returns all the elements of the list.
    public List getAddressList() {
        System.out.println("List Elements :"  + addressList);
        return addressList;
    }

    // a setter method to set List
    public void setAddressList2(List addressList) {
        this.addressList2 = addressList;
    }

    // prints and returns all the elements of the list.
    public List getAddressList2() {
        System.out.println("List Elements :"  + addressList2);
        return addressList2;
    }

    // a setter method to set Set
    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    // prints and returns all the elements of the Set.
    public Set getAddressSet() {
        System.out.println("Set Elements :"  + addressSet);
        return addressSet;
    }

    // a setter method to set Map
    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    // prints and returns all the elements of the Map.
    public Map getAddressMap() {
        System.out.println("Map Elements :"  + addressMap);
        return addressMap;
    }

    // a setter method to set Property
    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }

    // prints and returns all the elements of the Property.
    public Properties getAddressProp() {
        System.out.println("Property Elements :"  + addressProp);
        return addressProp;
    }
}