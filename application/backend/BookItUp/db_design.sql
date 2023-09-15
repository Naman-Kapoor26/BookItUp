USE book_it_up;
CREATE TABLE `Employee` (
  `userid` mediumint(8) unsigned NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `useremail` varchar(100) default NULL,
  `userphonenumber` int default NULL,
  `usercredits` int default 0,
  `role` varchar(15) default NULL,
  
  PRIMARY KEY (`userid`)
) AUTO_INCREMENT=1;

CREATE TABLE `meeting` (
  `meetingid` mediumint(8) unsigned NOT NULL auto_increment,
  `meetingname`varchar(20) unique,
  `meetingroom` varchar(255) NOT NULL,
  `meetingdate` DATE NOT NULL,
  `starttime` TIME NOT NULL,
  `endtime` TIME NOT NULL,
  `hostid` int NOT NULL,
  PRIMARY KEY (`meetingid`)
) AUTO_INCREMENT=1;

CREATE TABLE `meetingroom` (
  `roomname` varchar(30) NOT NULL,
  `seatingcapacity`int NOT NULL,
  `hasprojector` tinyint(1) default 0,
  `haswificonnection` tinyint(1) default 0,
  `hasconferencecall` tinyint(1) default 0,
  `hasboard` tinyint(1) default 0,
  `haswater` tinyint(1) default 0,
  `hastv` tinyint(1) default 0,
  `hascoffee` tinyint(1) default 0,
  
  PRIMARY KEY (`roomname`)
);


CREATE TABLE `userschedule` (
  `meetingid` varchar(30) NOT NULL,
  `userid`int NOT NULL,
  `ratings` float default -1.0,
  `hostid`int NOT NULL,
  `roomname`int NOT NULL,
  PRIMARY KEY (`meetingid`,`userid`),
  FOREIGN KEY (meetingid) REFERENCES meeting(meetingid),
  FOREIGN KEY (hostid) REFERENCES meeting(hostid),
  FOREIGN KEY (roomname) REFERENCES meetingroom(roomname)
); 


