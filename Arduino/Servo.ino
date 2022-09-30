#include <Servo.h>
Servo Servo1;

void setup() {
  Servo1.attach(5);
}

void loop() {
for(int i = 0;i <= 190;i++){
 Servo1.write(i);
 delay(10);
}
delay(190);
for(int i = 190;i >= 0;i--){
 Servo1.write(i);
 delay(10);
}
dela
