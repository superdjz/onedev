package io.onedev.server.manager;

import javax.annotation.Nullable;

import io.onedev.server.model.CodeComment;
import io.onedev.server.model.CodeCommentReply;
import io.onedev.server.model.Issue;
import io.onedev.server.model.IssueChange;
import io.onedev.server.model.IssueComment;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequest;
import io.onedev.server.model.PullRequestComment;
import io.onedev.server.model.PullRequestStatusChange;

public interface UrlManager {
	
	String urlFor(Project project);
	
	String urlFor(PullRequest request);
	
	String urlFor(PullRequestComment comment);
	
	String urlFor(PullRequestStatusChange statusChange);
	
	String urlFor(Issue issue);
	
	String urlFor(IssueComment comment);
	
	String urlFor(IssueChange change);
	
	String urlFor(CodeComment comment, @Nullable PullRequest request);

	String urlFor(CodeCommentReply reply, @Nullable PullRequest request);
	
}
