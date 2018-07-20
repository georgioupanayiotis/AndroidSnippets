//Get the instance of TelephonyManager  
    TelephonyManager  tm = (TelephonyManager)
                            getSystemService(Context.TELEPHONY_SERVICE);  
      
    // Get the information from the instance of Telephony Manager.  
    String IMEINumber = tm.getDeviceId();  
    String subscriberID = tm.getDeviceId();  
    String SIMSerialNumber = tm.getSimSerialNumber();  
    String networkCountryISO = tm.getNetworkCountryIso();  
    String SIMCountryISO = tm.getSimCountryIso();  
    String softwareVersion = tm.getDeviceSoftwareVersion();  
    String voiceMailNumber = tm.getVoiceMailNumber();  
       
    //Get the phone type  
    String strphoneType = "";  
       
    int phoneType = tm.getPhoneType();  
 
    switch (phoneType)   
    {  
            case (TelephonyManager.PHONE_TYPE_CDMA):  
                       strphoneType="CDMA";  
                           break;  
            case (TelephonyManager.PHONE_TYPE_GSM):   
                       strphoneType="GSM";                
                           break;  
            case (TelephonyManager.PHONE_TYPE_NONE):  
                        strphoneType="NONE";                
                            break;  
     }  
       
    //getting information if phone is in roaming  
    boolean isRoaming = tm.isNetworkRoaming();  
       
    String info="Phone Details : \n";  
    info+="\n IMEI Number: " + IMEINumber;  
    info+="\n SubscriberID : " + subscriberID;  
    info+="\n Sim Serial Number : " + SIMSerialNumber;  
    info+="\n Network Country ISO : " + networkCountryISO;  
    info+="\n SIM Country ISO : " + SIMCountryISO;  
    info+="\n Software Version : " + softwareVersion;  
    info+="\n Voice Mail Number : " + voiceMailNumber;  
    info+="\n Phone Network Type : " + strphoneType;  
    info+="\n In Roaming? : " + isRoaming;  
     
Log.i("Telephony Info", "Data = " + info);
    
