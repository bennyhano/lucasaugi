package gu.dtalk.client;

import gu.simplemq.IMessageAdapter;
import gu.simplemq.exceptions.SmqUnsubscribeException;

public class TextMessageAdapter <T> implements IMessageAdapter<T>{

	private long lastRespTimestamp;
	private T lastRespObj;
	protected IClientRender render = new TextRender();
	
	public TextMessageAdapter() {
	}

	public IClientRender getRender() {
		return render;
	}

	public void setRender(IClientRender render) {
		if(null != render){
			this.render = render;
		}
	}

	public long getLastResp() {
		return lastRespTimestamp;
	}

	public Object getLastRespObj() {
		return lastRespObj;
	}

	@Override
	public void onSubscribe(T resp) throws SmqUnsubscribeException {
		lastRespTimestamp = System.currentTimeMillis();
		lastRespObj = resp;
		// DO NOTHING
	}

}
