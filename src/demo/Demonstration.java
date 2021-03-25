package demo;

import com.laTestlabs.driverdownload.Browser;

public class Demonstration 
{
    public static void main(String[] args)
    {
		Browser.Driver("CHROME").DownloadAt(".\\driver");
    }
}
