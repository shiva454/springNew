package com.dbs.beans;
import org.apache.log4j.Logger;

public class PrimeChecker {
	static Logger log= Logger.getLogger(PrimeChecker.class);
	
public boolean check(int num) {
	log.debug("checking the number"+num);
	for(int c=2;c<num;c++)
	{
		if(num%c==0) {
			log.debug("returning false with"+num);
			return false;
		}
	}
	log.debug("returning true with"+num);
	return true;
	
}
}
