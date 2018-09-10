package com.isolver.codegenerator.codegen.util;

public class SimplePairedEntry {
	private RecordEntry srcEntry;
	private RecordEntry tarEntry;
	
	public SimplePairedEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimplePairedEntry(RecordEntry srcEntry, RecordEntry tarEntry) {
		super();
		this.srcEntry = srcEntry;
		this.tarEntry = tarEntry;
	}
	public RecordEntry getSrcEntry() {
		return srcEntry;
	}
	public void setSrcEntry(RecordEntry srcEntry) {
		this.srcEntry = srcEntry;
	}
	public RecordEntry getTarEntry() {
		return tarEntry;
	}
	public void setTarEntry(RecordEntry tarEntry) {
		this.tarEntry = tarEntry;
	}

	

}
