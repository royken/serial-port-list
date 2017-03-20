# serial-port-list
Simple java project to list serial ports on a PC using jSerialComm library (http://fazecast.github.io/jSerialComm)

"Note for Linux users: Serial port access is limited to certain users and groups in Linux. To enable user access, you must open a terminal and enter the following commands before jSerialComm will be able to access the ports on your system. Don't worry if some of the commands fail. All of these groups may not exist on every Linux distro. (Note, this process must only be done once for each user):

sudo usermod -a -G uucp username
sudo usermod -a -G dialout username
sudo usermod -a -G lock username
sudo usermod -a -G tty username
Replace the username parameter with your current username. (If you are not sure what your username is, type whoami and it will tell you.) "(http://fazecast.github.io/jSerialComm) 
