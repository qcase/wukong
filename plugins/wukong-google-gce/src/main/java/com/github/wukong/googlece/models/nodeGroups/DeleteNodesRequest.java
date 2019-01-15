package com.github.wukong.googlece.models.nodeGroups;

public class DeleteNodesRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String nodeGroup;

	protected com.google.api.services.compute.model.NodeGroupsDeleteNodesRequest content;

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
	public void setNodeGroup(java.lang.String nodeGroup) {
		this.nodeGroup = nodeGroup;
}
	public java.lang.String getNodeGroup() {
		return this.nodeGroup;
}
	public void setContent(com.google.api.services.compute.model.NodeGroupsDeleteNodesRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.NodeGroupsDeleteNodesRequest getContent() {
		return this.content;
}
}