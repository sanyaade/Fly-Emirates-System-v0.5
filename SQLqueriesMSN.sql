--------------------------------------------
-- Database Query DUMP
--------------------------------------------
-- Fly Emirates Airline Reservation System 
-- @author : MSN @ SLIIT_METRO 
-- @lead dev : harshadura (www.harshadura.com)
-- v 0.5 Release Candidate [For SLIIT 1st Year Project]
--------------------------------------------
-- Database Schema : MSN_FlyEmirates
--------------------------------------------

create database MSN_FlyEmirates;
use MSN_FlyEmirates;

create table Login
(
strUser varchar(20) primary key,
strPass varchar(20),
strType varchar(10)
);

create table Airport
(
AirCode varchar(20) primary key,
AirName varchar(30),
AirCity varchar(20),
AirAbbr varchar(10),
AirState varchar(20)
);

create table FlightLegs
(
LegID varchar(20) primary key,
LegFrom varchar(20),
LegTo varchar(20),
DepTime varchar(20),
ArrTime varchar(20),
FlightNo varchar(20),
AirType varchar(10)
);

create table Airplane
(
AirID varchar(20) primary key,
AirName varchar(20),
TotSeats varchar(20),
AirType varchar(20),
Company varchar(20)
);

create table Bookings
(
RecieptNo varchar(20) primary key,
BillDate varchar(20),
BillTime varchar(20),
CusName varchar(40),
PassportNo varchar(20),
Age integer(10),
Gender varchar(10),
SeatNo varchar(10),
FareType varchar(10),
FlightClass varchar(10),
Fare integer(10),
Status varchar(10),
LegID  varchar(10)
);

insert into Login values('harsha','sa','admin');
insert into Login values('saman','aa','admin');
insert into Login values('nimal','qq','officer');
insert into Airport values('A101','SanDIEGO Emirates','San Diego','SAN','LosAngelis');
insert into FlightLegs values('l101','AUS','UAE','2007/1/1 2300','2007/1/1 2400','C111','A');
insert into Bookings values('B100','11/14/10','22:07:19','Saman Gamage','90090445',21,'Male','12','Full','A',5000,'ON','L1000');


