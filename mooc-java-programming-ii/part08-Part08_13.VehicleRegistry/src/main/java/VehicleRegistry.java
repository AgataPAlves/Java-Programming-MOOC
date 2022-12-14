
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class VehicleRegistry {
 
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>(); 
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(registry.containsKey(licensePlate)){
            return false;
        }        
        registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(registry.isEmpty()){
            return false;
        }
        registry.remove(licensePlate);
            return true;
    }
    
    public void printLicensePlates(){        
        for(LicensePlate licensePlate: registry.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownersInHash = new ArrayList<>();
        
        for(String owners: registry.values()){
            if(!(ownersInHash.contains(owners))){
                ownersInHash.add(owners);
                System.out.println(owners);
            }
        }
    }
    
    
}
