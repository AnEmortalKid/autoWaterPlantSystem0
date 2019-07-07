Autowater Plantsystem by jayJavaGGDev Jul. 2019.


So it's incomplete as of today - its July 07, 2019, 9:39 am as I'm writing this.


My physical setup includes a soil moisture sensor - which when reading as wet will cause the Soil class to return this.wet.
My code is set up so that I only need to drop in the pi4j or similar code for pin listener to return Soil.wet.

I also have a relay controlled pump - the code to switch on the relay would be inserted into my pump class and it's Pump.turnOn()
function would be called in the SoilListener class in the tenSecondPump() function.

Where I'm actually stuck at is kinda silly - but I've only been coding for about a month now so I really am stuck -
is getting the pi4j library added into my project so that I can finish coding before I send it over to my Pi.
Any help here would be awesome.


Also, I'm using java 1.8 and the email service isn't working for me.

If you'd like to test it out it should run if you just go from main it's set to run soilListener(); which runs in a loop. I removed the popclient so if it's not working its because github hasn't updated it yet and just remove the popclient from the soilListener class and it should run fine. I used Java 1.8 by the way. If it doesn't work for you this may be way.
