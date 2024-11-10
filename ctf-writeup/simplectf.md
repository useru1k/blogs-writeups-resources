# TryHackMe: Simple CTF

![image](https://github.com/user-attachments/assets/f366e5de-c3e6-488d-ad90-cebacddc4de1)


* Simple CTF is just a beginner-level CTF on TryHackMe that showcases a few of the necessary skills needed for all CTF to include scanning and enumeration, exploitation, and privilege escalation.
  
* I start the machine and connected to my computer using OpenVpn.
* Then i started a basic port scanning using nmap in given ip of the machine and i got that 3 ports are open in this machine.
  
  > Starting Nmap 7.95 ( https://nmap.org ) at 2024-11-10 13:58 IST
  > Nmap scan report for 10.10.228.43
  > Host is up (0.27s latency).
  > Not shown: 997 filtered tcp ports (no-response)
  > PORT     STATE SERVICE VERSION
  > 21/tcp   open  ftp     vsftpd 3.0.3
  > 80/tcp   open  http    Apache httpd 2.4.18 ((Ubuntu))
  > 2222/tcp open  ssh     OpenSSH 7.2p2 Ubuntu 4ubuntu2.8 (Ubuntu Linux; protocol 2.0)
  > Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel
