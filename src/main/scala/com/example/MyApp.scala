package com.example

import org.apache.log4j.Logger


object MyApp extends App{
  private val log = Logger.getLogger(this.getClass)


  (1 to 2000).foreach(i =>   log.info(s"$i Hola David. Lets sleep"))
  Thread.sleep(120000)
  (1 to 2000).foreach(i =>   log.info(s"$i Hola Daniel. Lets sleep"))
  Thread.sleep(120000)
  (1 to 2000).foreach(i =>   log.info(s"$i Hola Mauro. Lets sleep"))
  Thread.sleep(2)
}
