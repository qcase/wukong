package com.github.wukong.googlece.models.regionAutoscalers;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String autoscaler;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setRegion(java.lang.String region) {
		this.region = region;
}
	public java.lang.String getRegion() {
		return this.region;
}
	public void setAutoscaler(java.lang.String autoscaler) {
		this.autoscaler = autoscaler;
}
	public java.lang.String getAutoscaler() {
		return this.autoscaler;
}
}