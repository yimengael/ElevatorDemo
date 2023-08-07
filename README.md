# This project describe the Elevator API

It has 4 main endpoints:

### Calling the Elevator Car
```
input : personFloor, elevatorCarId
output : elevator car properties updated accordingly
```

### Bring someone to a given floor
```
input : destinationFloor, elevatorCarId
output : elevator car properties updated accordingly
```

### Request all the floors that are being serviced
```
input : elevatroCarId
output : list of all the floors serviced
```

### Request the next floor to be serviced
```
input : elevatorCarId
output : Next Floor to be serviced
```

## Process to use this project


In order to build the project, from the base folder of the project, perform the following command
```
./gradlew clean build
```


In order to run the project, from the base folder of the project, perform the following command
```
./gradlew bootRun
```

Then type the following links using postman:

* http://localhost:8080/greeting

* http://localhost:8080/allfloors

* http://localhost:8080/nextfloor

* http://localhost:8080/callelevator
```
{
    "personFloor" : 1,
    "elevatorCarId" : 1
}
```

* http://localhost:8080/bringsomeone
```
{
  "personFloor" : 1,
  "elevatorCarId" : 1
}
```