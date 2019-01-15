package com.github.wukong.googlece.models.autoscalers;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected com.google.api.services.compute.model.Autoscaler content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setZone(java.lang.String zone) {
		this.zone = zone;
}
	public java.lang.String getZone() {
		return this.zone;
}
	public void setContent(com.google.api.services.compute.model.Autoscaler content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Autoscaler getContent() {
		return this.content;
}
}