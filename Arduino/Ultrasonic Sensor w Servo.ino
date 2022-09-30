const int Trigger = 7;
const int Echo = 6;

#include <Servo.h>
Servo ServoMotor;
Servo ServoMotor1;

long duration;
long distance;
int servoPin = 3;
int servoPin1 = 11;


void setup() {
ServoMotor.attach(servoPin);   
ServoMotor1.attach(servoPin1);
pinMode(servoPin,OUTPUT);
pinMode(Trigger, OUTPUT); 
pinMode(Echo, INPUT); 
Serial.begin(9600); 
}
void loop() {

digitalWrite(Trigger, LOW);
delayMicroseconds(2);

digitalWrite(Trigger, HIGH);
delayMicroseconds(10);
digitalWrite(Trigger, LOW);

duration = pulseIn(Echo, HIGH);

distance= duration*0.034/2;

Serial.print("Distance: ");
Serial.println(distance);

if(distance < 1500){ 
   ServoMotor.write(180);
   ServoMotor1.write(0);
   delay(500);
  }
else if(distance >  2000){
   ServoMotor.write(0);
   ServoMotor1.write(180);
   delay(500);
  }


}
