# java.jna.WindowsCredentialManager

A while ago I tried to read credentials stored in Windows Credentials Manager using java's jna library. I had some tough time to do it as this is not a very common problem. I did not get any answers to my post on stackoverflow (http://stackoverflow.com/questions/33754249/windows-credenumerate-in-jna). After some time of trying to understand more about jna I managed to do it. Maybe it will help somebody who is struggling with the same thing.

To store credentials in Windows Credential Manager go to Control Panel > Credential Manager > add a generic credential. Then put address, username and password. Windows Credential Manager lets you get this data for a logged-in user. This is especially handy if you need to store a plain text passwords securely (and be able to retrieve them later).

This is a sample maven project I created to read the credentials from Windows Credential Manager.
Class **ListCredentials** has the main method which shows a simple usage of WindowsCredentialManager.
It also has **displayAllGenericCredentialsDetails()** method which list of the generic credentials stored for the current user. 

The code in this repository is not a full blown library to handle Windows Credential Manager in java (jna), however it may be good to get some understanding how to do it in jna. Especially method **displayAllGenericCredentialsDetails()** should be good for that.

Usage:
First store generic credential in Windows Credential Manager with address: "internet.or.network.address".
Then:
```
WindowsCredentialManager gcm = new WindowsCredentialManager();
GenericWindowsCredentials gwc = gcm.getByTargetName("internet.or.network.address");
```