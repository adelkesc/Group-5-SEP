package guiView;

import java.util.ArrayList;

public class Events {
	private String name;
	private MyDate date;
	private int duration;
	private String type;
	private String location;
	private String category;
	private Lecturer conductor;
	private double price;
	private int minPartic, maxPartic;
	private boolean isFinalized;
	ArrayList<Members> eventMembList = new ArrayList<>();
	
	public Events(String name, MyDate date, int duration, String type, String location, String category, Lecturer conductor, double price, int minPartic, int maxPartic, boolean isFinalized) {
		this.name=name;
		this.date=date.copy();
		this.duration=duration;
		this.type=type;
		this.location=location;
		this.category=category;
		this.conductor=conductor;
		this.price=price;
		this.minPartic=minPartic;
		this.maxPartic=maxPartic;
		this.isFinalized=isFinalized;
	}
	public Events() {
		this.name="";
		this.date=null;
		this.duration=0;
		this.type="";
		this.location="";
		this.category="";
		this.conductor=null;
		this.price=0;
		this.minPartic=0;
		this.maxPartic=0;
		this.isFinalized=false;
	}
	public void finalizeEvent() {
		this.isFinalized=true;
	}
	public void addMemToEvent(Members member) {
		eventMembList.add(member);
	}

}
