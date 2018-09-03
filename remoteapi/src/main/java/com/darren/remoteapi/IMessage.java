package com.darren.remoteapi;

public interface IMessage {
   
	  /**
	   * 实现消息的回应处理
	   * @param msg
	   * @return
	   */
	  public String echo(String msg);
}
