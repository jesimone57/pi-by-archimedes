# Approximating Pi using Archimedes Algorithm

### Description of Problem
>The greek mathematician Archimedes approximated the universal constant Pi to several decimal points of precision.
>How did he do it?  He used an algorithm to approximate Pi by successively inscribing a circle with regular polygons.

>See Full Details here [Finding Pi by Archimedes' Method](https://www.youtube.com/watch?v=_rJdkhlWZVQ)
 
### To compile and run
1. git clone https://github.com/jesimone57/pi-by-archimedes.git
2. cd pi-by-archimedes/src
3. javac com/jesimone57/App.java
4. java  com.jesimone57.App 

### Sample Output 
 
 <pre>
 java com.jesimone57.App
 
 iter=1   sides=6  pi approx 3.0    error = -0.14159265358979312
 iter=2   sides=12  pi approx 3.105828541230249    error = -0.03576411235954424
 iter=3   sides=24  pi approx 3.1326286132812378    error = -0.008964040308555354
 iter=4   sides=48  pi approx 3.1393502030468667    error = -0.0022424505429263775
 iter=5   sides=96  pi approx 3.14103195089051    error = -5.60702699283322E-4
 iter=6   sides=192  pi approx 3.1414524722854624    error = -1.4018130433068876E-4
 iter=7   sides=384  pi approx 3.141557607911858    error = -3.504567793521929E-5
 iter=8   sides=768  pi approx 3.1415838921483186    error = -8.761441474547382E-6
 iter=9   sides=1536  pi approx 3.1415904632280505    error = -2.190361742648861E-6
 iter=10   sides=3072  pi approx 3.1415921059992717    error = -5.475905213714327E-7
 iter=11   sides=6144  pi approx 3.1415925166921577    error = -1.368976354498841E-7
 iter=12   sides=12288  pi approx 3.141592619365384    error = -3.422440908451563E-8
 iter=13   sides=24576  pi approx 3.141592645033691    error = -8.556102049084302E-9
 iter=14   sides=49152  pi approx 3.141592651450768    error = -2.139024957159563E-9
 iter=15   sides=98304  pi approx 3.1415926530550373    error = -5.34755795200681E-10
 iter=16   sides=196608  pi approx 3.1415926534561045    error = -1.3368861573326285E-10
 iter=17   sides=393216  pi approx 3.141592653556372    error = -3.342126575489601E-11
 iter=18   sides=786432  pi approx 3.141592653581438    error = -8.355094394119078E-12
 iter=19   sides=1572864  pi approx 3.1415926535877046    error = -2.0885515539248445E-12
 iter=20   sides=3145728  pi approx 3.1415926535892713    error = -5.218048215738236E-13
 iter=21   sides=6291456  pi approx 3.141592653589663    error = -1.3011813848606835E-13
 iter=22   sides=12582912  pi approx 3.141592653589761    error = -3.197442310920451E-14
 iter=23   sides=25165824  pi approx 3.1415926535897856    error = -7.549516567451064E-15
 iter=24   sides=50331648  pi approx 3.1415926535897913    error = -1.7763568394002505E-15
 iter=25   sides=100663296  pi approx 3.141592653589793    error = 0.0
 iter=26   sides=201326592  pi approx 3.1415926535897936    error = 4.440892098500626E-16
 iter=27   sides=402653184  pi approx 3.1415926535897936    error = 4.440892098500626E-16
 iter=28   sides=805306368  pi approx 3.1415926535897936    error = 4.440892098500626E-16
 iter=29   sides=1610612736  pi approx 3.1415926535897936    error = 4.440892098500626E-16
 </pre>
